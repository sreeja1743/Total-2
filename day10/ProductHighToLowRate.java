package day10;

import java.util.Comparator;

public class ProductHighToLowRate implements Comparator<Product> {
	
		public int compare(Product o1, Product o2) {
			return o2.getStarRating() - o1.getStarRating();
		}
}
