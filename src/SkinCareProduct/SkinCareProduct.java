package SkinCareProduct;
import java.util.Scanner;

public abstract class SkinCareProduct {
	protected MadeIn country=MadeIn.Korea;
	protected String name;
    protected String price;
    protected String expirationDate;
    protected String effect;
    protected String packDate;
    
    public SkinCareProduct() {
    }
    
    public SkinCareProduct(MadeIn country) {
    	this.country=country;
    }
    
    public SkinCareProduct(String name) {
       this.name = name;
    }
    public SkinCareProduct(MadeIn country, String name) {
    	this.country=country;
    	this.name=name;
    }
    public SkinCareProduct(String name, String price) {
    	this.name=name;
    	this.price=price;
    }
    
    public SkinCareProduct(MadeIn country, String name, String price) {
    	this.country=country;
    	this.name=name;
    	this.price=price;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate) {
    	this.country=country;
    	this.name=name;
    	this.price=price;
    	this.expirationDate=expirationDate;
    }
    
    public SkinCareProduct(String name, String price, String expirationDate, String effect) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate, String effect) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
    }
    public SkinCareProduct(String name, String price, String expirationDate, String effect, String packDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
        this.packDate=packDate;
    }
    public SkinCareProduct(MadeIn country, String name, String price, String expirationDate, String effect, String packDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.effect = effect;
        this.packDate=packDate;
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
	public String getPackDate() {
		return packDate;
	}
	public void setPackDate(String packDate) {
		this.packDate = packDate;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	
    public abstract void printInfo();
    
}