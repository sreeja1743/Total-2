package day9;

import java.util.*;


public class ProductMain {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	  HashSet<Product> set = new HashSet<>();
	  Product p1 = new Product("HP-Laptop",2000,5);
	  Product p2 = new Product("Dell-Laptop",2000,5);
	  Product p3 = new Product("Apple-Laptop",2000,5);
	  Product p4 = new Product("HP-Laptop",2000,5);
	  set.add(p1);
	  set.add(p2);
	  set.add(p3);
	  set.add(p4);
	  
	  //System.out.println(set);
	  
	  
	  List<Product> list = new ArrayList<>(set);
	  list.remove(p4);
	  
	  for(int i = 0; i < list.size(); i++) {
		  
		  
		      System.out.println(list.get(i).getProductName());
	  }
	  
    }
}
