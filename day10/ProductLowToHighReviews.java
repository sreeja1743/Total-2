package day10;

import java.util.Comparator;

public class ProductLowToHighReviews implements Comparator<Product> {
	
	public int compare(Product o1, Product o2) {
		return o1.getReviewCount() - o2.getReviewCount();
	}

}
