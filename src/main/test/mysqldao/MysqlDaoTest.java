package mysqldao;

import hero.Hero;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * Created by runda on 2016/12/22.
 */
public class MysqlDaoTest {
    @Test
    public void test() throws SQLException {
        Hero hero = new Hero("提莫", 300, 50);
        MysqlDao.insertHero(hero);
    }
}