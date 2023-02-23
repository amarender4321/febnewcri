package Sample_project;

import java.util.HashMap;

import org.testng.annotations.Test;

public class StateCityArea {
	@Test
	public void stateCityAreaTest() {
		
		
		
		HashMap<String, Integer> BangaloreCity=new HashMap<String,Integer>();
		
		BangaloreCity.keySet();
		BangaloreCity.put("jayanager", 560055);
		BangaloreCity.put("BTM", 560056);
		BangaloreCity.put("BTR", 560059);
		BangaloreCity.put("HSR", 560057);
		
		System.out.println(BangaloreCity);
		
		
		HashMap<String, Integer> MysoreCity=new HashMap<String,Integer>();
		MysoreCity.put("vijaynagar", 55);
		MysoreCity.put("Ramnagar", 56);
		MysoreCity.put("MG", 59);
		MysoreCity.put("kuvempu", 57);
		
		System.out.println(MysoreCity);
		HashMap <String,HashMap<String, Integer>> karnataka=new HashMap<String,HashMap<String, Integer>>();
		karnataka.put("Bangalore", BangaloreCity);
		karnataka.put("Mysore", MysoreCity);
		System.out.println(karnataka.get("Bangalore").get("jayanager"));
	}

}
