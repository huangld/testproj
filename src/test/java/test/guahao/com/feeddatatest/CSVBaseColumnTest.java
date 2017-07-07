package test.guahao.com.feeddatatest;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Feeder.class)
public class CSVBaseColumnTest {
	@Test
	@Source(uri ="src\\test\\resources\\CSVColumnData.csv", rowBased = false,encoding="GBK", emptyMarker = "<empty>")//CSV source
	public void test_CSV(String name, int age, String sex) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sex);
	}
}
