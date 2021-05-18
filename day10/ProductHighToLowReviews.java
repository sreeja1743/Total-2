package day10;

import java.util.Comparator;

public class ProductHighToLowReviews implements Comparator<Product>{
	
	public int compare(Product o1, Product o2) {
		return o2.getReviewCount() - o1.getReviewCount();
	}

}
