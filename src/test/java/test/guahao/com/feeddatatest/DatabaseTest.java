package test.guahao.com.feeddatatest;

import org.databene.benerator.anno.Database;
import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.databene.platform.db.DBSystem;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Feeder.class)
@Database(id = "db", url = "jdbc:mysql://192.168.1.15:3308/portal", 
        driver = "com.mysql.jdbc.Driver", user = "portal", password = "portal")
public class DatabaseTest {  
    static DBSystem db;
    
    @Test
    @Source(id = "db", selector = "select classification_type,name from disease_classification")
    public void test(String classification_type, String name) {
        System.out.println(classification_type + ", " + name);
    }
    
}
