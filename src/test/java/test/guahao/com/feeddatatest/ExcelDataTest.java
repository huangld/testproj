package test.guahao.com.feeddatatest;

import static org.junit.Assert.assertEquals;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith; 

@RunWith(Feeder.class)
public class ExcelDataTest {

/*	@Test
	@Source("src\\test\\resources\\ExcelData.xls")//Excel source
	public void test_Excel(int param_1, int param_2, int expectValue) {
		assertEquals(expectValue, param_1+param_2);
	}
	*/
	@Test
	@Source("src\\test\\resources\\ExcelData.xlsx")//Excel source
	public void test_Excelx(int param_1, int param_2, int expectValue) {
		assertEquals(expectValue, param_1+param_2);
	}
}
