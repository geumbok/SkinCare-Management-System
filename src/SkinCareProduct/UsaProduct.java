package SkinCareProduct;

import java.util.Scanner;

public class UsaProduct extends SkinCareProduct {
	
	public UsaProduct(MadeIn country) {
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
        
        char answer='x';
        while(answer!='y' && answer!='Y' && answer!='n' && answer!='N')
        {
        	System.out.print("It has an expiration date? (Y/N)");
        	answer=input.nextLine().charAt(0);
        	if(answer=='y'||answer=='Y') {
        		System.out.print("Expiration date:");
        		String expirationDate=input.next();
        		this.setExpirationDate(expirationDate);
        		break;
        	}
        	else if(answer=='n'||answer=='N') {
        		this.setExpirationDate("");
        		break;
        	}
        	else {
        	}
        }
                
        System.out.print("Product Effect:");
        String effect = input.nextLine();
        this.setEffect(effect);
    }
}
