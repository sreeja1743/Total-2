package day9;

import java.time.LocalDate;
public class Product {
    private String productName;
    private int productCost;
    private int startRating;
    private LocalDate manifacturingDate;
    
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public LocalDate getManifacturingDate() {
		return manifacturingDate;
	}
	public void setManifacturingDate(LocalDate manifacturingDate) {
		this.manifacturingDate = manifacturingDate;
	} 
	
	
	public Product(String productName,int productCost, int starRating ) {
		this.productName = productName;
		this.productCost = productCost;
		this.startRating = starRating;
	}
	
	public String toString() {
		return productName+" "+productCost+" "+startRating;
	}
    
}
