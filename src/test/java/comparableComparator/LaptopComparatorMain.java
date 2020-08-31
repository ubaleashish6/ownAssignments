package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<LaptopforComparator> laps = new ArrayList<LaptopforComparator>();
		laps.add(new LaptopforComparator("Sony", 12, 200.12));
		laps.add(new LaptopforComparator("Dell", 6, 100.11));
		laps.add(new LaptopforComparator("Apple", 16, 400.34));
		laps.add(new LaptopforComparator("Samsung", 8, 50.5));
		laps.add(new LaptopforComparator("Lenovo", 24, 900.12));

		System.out.println("Laptos before sorting on ram = ");
		for (LaptopforComparator lap : laps) {
			System.out.println(lap);
		}
		/*
		 * Comparator<LaptopforComparator> comp = new Comparator<LaptopforComparator>()
		 * {
		 * 
		 * @Override public int compare(LaptopforComparator o1, LaptopforComparator o2)
		 * { // TODO Auto-generated method stub if(o1.getPrice()< o2.getPrice()) {
		 * return 1; } else { return -1; }
		 * 
		 * } };
		 */

		Comparator<LaptopforComparator> comp = new Comparator<LaptopforComparator>() {

			@Override
			public int compare(LaptopforComparator o1, LaptopforComparator o2) {
				// TODO Auto-generated method stub
				return o2.brand.compareTo(o1.brand);
			}
		};
		Collections.sort(laps, comp);

		System.out.println("Laptos before sorting on price = ");
		for (LaptopforComparator lap : laps) {
			System.out.println(lap);
		}

	}

}
