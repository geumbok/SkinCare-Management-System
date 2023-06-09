package SkinCareProduct;

import java.util.Scanner;

public class KoreaProduct extends SkinCareProduct {
	
	public KoreaProduct(MadeIn country) {
		super(country);
	}
	
	
	public void getUserInput(Scanner input) {
		setProductName(input);
    	setProductPrice(input);
    	setProductExpirationDate(input);
    	setProductEffect(input);
	}
	
	public void printInfo() {
		String scountry = getCountryString();
        System.out.println("country:" + scountry + "Product Name:" + name + " price:" + price +
                        " expirationDate:" + expirationDate + " effect:" + effect);
    }  
}