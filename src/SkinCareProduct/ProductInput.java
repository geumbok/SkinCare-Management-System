package SkinCareProduct;

import java.util.Scanner;

public interface ProductInput {
	
	public void getUserInput(Scanner input);
	
	public String getName();
	
	public void setName(String name);
	
	public void setPrice(String price);
	
	public void setExpirationDate(String expirationDate);
	
	public void setEffect(String effect);

	public void printInfo();
}