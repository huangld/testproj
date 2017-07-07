package test.guahao.com.feeddatatest;

import org.databene.benerator.anno.InvocationCount;
import org.databene.feed4junit.Feeder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Feeder.class)
public class DemoTest {
	//@Ignore
	@Test
    @InvocationCount(3)//配置的是该测试方法应被执行的总次数
    public void testLogin(String name, String password) {
        System.out.println("name:" + name + " password:" + password);
    }
}
