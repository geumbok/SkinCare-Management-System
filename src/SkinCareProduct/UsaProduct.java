package SkinCareProduct;

import java.util.Scanner;

public class UsaProduct extends SkinCareProduct implements ProductInput{
	
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
        		String expirationDate=input.nextLine();
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
