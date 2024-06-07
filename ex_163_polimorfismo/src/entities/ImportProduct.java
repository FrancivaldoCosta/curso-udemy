package entities;

public class ImportProduct extends Product {

	private Double customsFee;
	
	



	public ImportProduct() {
		super();
		
		
	}

	public ImportProduct(Double customsFee) {
		super();
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public String priceTag() {
		return null;
		
	}
	
	public Double totalPrice() {
		return customsFee;
		
	}
	
}
