package SkinCareProduct;
import java.util.Scanner;

public class SkinCareProduct {
	protected MadeIn country=MadeIn.Korea;
	protected String name;
    protected String price;
    protected String expirationDate;
    protected String effect;
    
    public SkinCareProduct() {
    }
    public SkinCareProduct(String name) {
       this.name = name;
    }
    
    public SkinCareProduct(String name, String price, 
                         String expirationDate, String effect) {
       this.name = name;
       this.price = price;
       this.expirationDate = expirationDate;
       this.effect = effect;
    }
    
    public MadeIn getCountry() {
		return country;
	}
	public void setCountry(MadeIn country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
    public void printInfo() {
       System.out.println("Product Name:" + name + " price:" + price +
                        " expirationDate:" + expirationDate + " effect:" + effect);
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
}