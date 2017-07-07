package test.guahao.com.feeddatatest;

import javax.validation.constraints.Pattern;

import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Feeder.class)
public class RegexTest {
	@Test
	public void testSmoke(@Pattern(regexp = "[A-Z][a-z][0-9]{3,8}") String name) {
		System.out.println("name:" + name);
	}
}
