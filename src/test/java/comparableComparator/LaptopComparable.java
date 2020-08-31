package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptop> laps=new ArrayList<Laptop>();
		laps.add(new Laptop("Sony", 12, 200.12));
		laps.add(new Laptop("Dell", 6, 100.11));
		laps.add(new Laptop("Apple", 16, 400.34));
		laps.add(new Laptop("Samsung",8, 50.5));
		laps.add(new Laptop("Lenovo", 24, 900.12));
		
		System.out.println("Laptos before sorting on ram = ");
		for(Laptop lap:laps) {
			System.out.println(lap);
		}
		Collections.sort(laps);
		
		System.out.println("Laptos before sorting on ram = ");
		for(Laptop lap:laps) {
			System.out.println(lap);
		}

	}

}
