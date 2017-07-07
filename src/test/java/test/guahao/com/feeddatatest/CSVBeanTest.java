package test.guahao.com.feeddatatest;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(Feeder.class)
public class CSVBeanTest {

	/*
	 * CSV数据源转换为Person对象
	 */
	@Test
	public void testCSVBean(@Source(uri ="src\\test\\resources\\CSVColumnData.csv", rowBased = false,encoding="GBK",emptyMarker = "<empty>") Person person){
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSex());
	}
}
