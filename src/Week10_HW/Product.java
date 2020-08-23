package Week10_HW;

public class Product {
	// Canadians will be charged tax, non-Canadians will not be charged tax
		final int priceCans = 295; //prices are in CAD for Canadians
		final int priceNCans = 295;	//prices are in CAD for non-Canadians
		final double tax = 0.13;
		int productId; 
		String name;
		int quantity;
		String citizen;
		double totalPrice;
	
	public void totalPrice(int productId, String name, int quantity, String citizen) {
	
		if(citizen=="Canadian") {
			totalPrice = ((priceCans * quantity * tax) + priceCans * quantity);
			System.out.println("The total price for Canadian customers is "+totalPrice);
			}
		else{
			totalPrice = (priceNCans * quantity);
			System.out.println("The total price for non-Canadian is "+totalPrice);
			}	
		}
	}


	


