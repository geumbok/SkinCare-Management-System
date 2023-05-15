package SkinCareProduct;

import java.util.Scanner;

public class KoreaProduct extends SkinCareProduct implements ProductInput{
	
	public KoreaProduct(MadeIn country) {
		super(country);
	}
	
	
	public void getUserInput(Scanner input) {
	    System.out.print("Product Name:");
	    String name = input.next();
	    this.setName(name);
	    input.nextLine();
	        
	    System.out.print("Product Price:");
	    String price = input.next();
	    this.setPrice(price);
	    input.nextLine();
	        
	    System.out.print("Product Expiration date:");
	    String expirationDate = input.next();
	    this.setExpirationDate(expirationDate);
	    input.nextLine();
	        
	    System.out.print("Product Effect:");
	    String effect = input.nextLine();
	    this.setEffect(effect);
	        
	}
	
	public void printInfo() {
    	String scountry="none";
    	switch(this.country) {
    	case Korea:
    		scountry="Kor.";
    		break;
    	case Usa:
    		scountry="Us.";
    		break;
    	case Norway:
    		scountry="Nor.";
    		break;
    	case Japan:
    		scountry="Jap.";
    		break;
    	default:
    		
    	}
    	
        System.out.println("country:" + scountry + "Product Name:" + name + " price:" + price +
                        " expirationDate:" + expirationDate + " effect:" + effect);
    }

}