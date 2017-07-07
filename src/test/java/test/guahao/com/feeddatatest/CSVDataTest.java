package test.guahao.com.feeddatatest;

import static org.junit.Assert.assertEquals;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith; 

@RunWith(Feeder.class)
public class CSVDataTest {
	@Test
	@Source("src\\test\\resources\\CSVData.csv")//CSV source
	public void test_CSV(int param_1, int param_2, int expectValue) {
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(expectValue);
		assertEquals(expectValue, param_1+param_2);
	}
	
	@Test
	@Source("src\\test\\resources\\CSVData2.csv")//CSV source
	public void test_CSV2(String param_1, String expectValue) {
		System.out.println(param_1);
		System.out.println(expectValue);
		assertEquals(expectValue, param_1);
	}
	
	@Test
	@Source("src\\test\\resources\\CSVData3.csv")
	public void test_CSV3(String param_1, String expectValue) {
		System.out.println(param_1);
		System.out.println(expectValue);
		assertEquals(expectValue, param_1);
	}
}
