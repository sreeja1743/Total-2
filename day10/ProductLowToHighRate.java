package day10;

import java.util.Comparator;

public class ProductLowToHighRate implements Comparator<Product>{
	
	public int compare(Product o1, Product o2) {
		return o1.getStarRating() - o2.getStarRating();
	}

}
