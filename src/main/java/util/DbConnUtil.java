package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by runda on 2016/12/22.
 */
public class DbConnUtil {
    public static Connection conn = null;
    static {
        try{

            Class.forName("java.sql.DriverManager");
            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 root
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/house","root","root");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){return conn;}
}
