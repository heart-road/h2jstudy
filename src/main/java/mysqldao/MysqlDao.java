package mysqldao;

import hero.Hero;
import util.DbConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by runda on 2016/12/22.
 */
public class MysqlDao {
    static Connection conn = DbConnUtil.getConn();
    public static void insertHero(Hero hero){
        PreparedStatement statement = null;
        try {
            String sql = "INSERT INTO hero VALUES (null ,?,?,?)";
            statement = conn.prepareStatement(sql);
            int damage = hero.getDamage();
            int hp = hero.getHp();
            String name = hero.getName();
            statement.setString(1,name);
            statement.setInt(2,hp);
            statement.setInt(3,damage);
            statement.executeUpdate();
            System.out.println("插入成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
