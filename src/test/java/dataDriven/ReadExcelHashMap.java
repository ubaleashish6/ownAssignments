package dataDriven;

import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ReadExcelHashMap {
	
	@Test
	public void testOne() {
		Map<String, String> data=ReadExcelDataUtility.getMapData();
		for(Entry<String, String> entry:data.entrySet()) {
			System.out.println("Key: "+entry.getKey() +", Value: "+entry.getValue());
		}
	}

}
