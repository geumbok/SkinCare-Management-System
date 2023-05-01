import java.util.ArrayList;
import java.util.Scanner;

import SkinCareProduct.SkinCareProduct;
import SkinCareProduct.UsaProduct;

public class SkinCareProductManager {
   
   ArrayList<SkinCareProduct> skinCareProducts = new ArrayList<SkinCareProduct>();
   Scanner input;
   SkinCareProductManager(Scanner input) {
      this.input = input;
   }

   public void addSkinCareProduct() {
      int country=0;
      SkinCareProduct skinCareProduct;
	  while(country!=1 && country !=2) {
		  System.out.print("1 for Korea");
		  System.out.print("2 for Usa"); 
		  System.out.print("Select num for skinCareProduct country between 1 and 2:"); 
		  country=input.nextInt();
		  if(country==1) {
			  skinCareProduct = new SkinCareProduct();
			  skinCareProduct.getUserInput(input);
			  skinCareProducts.add(skinCareProduct);
			  break;
		  }
		  else if(country==2) {
			  skinCareProduct = new UsaProduct();
			  skinCareProduct.getUserInput(input);
			  skinCareProducts.add(skinCareProduct);
			  break;
		  }
		  else {
			  System.out.print("Select num for skinCareProduct country between 1 and 2:");
		  }
	  }
   }
      
      
   public void deleteSkinCareProduct() {
      System.out.print("Product Name:");
      String productName = input.next();
      int index = -1;
      for (int i = 0; i<skinCareProducts.size(); i++) {
         if (skinCareProducts.get(i).getName().equals(productName)) {
            index = i;
            break; 
         }
      }
      
      if (index >= 0) {
         skinCareProducts.remove(index);
         System.out.println(productName + " is deleted");
      }
      else {
         System.out.println("the product has not been registered");
         return;
      }
   }
   
   public void editSkinCareProduct() {
      System.out.print("SkinCareProduct Name:");
      String productName = input.next();
      for (int i = 0; i<skinCareProducts.size(); i++) {
         SkinCareProduct skinCareProduct = skinCareProducts.get(i);
         if (skinCareProduct.getName().equals(productName)) {
            
            int num = 0;
            while (num != 5) {
               System.out.println("** SkinCareProduct Info Edit Menu **");
               System.out.println(" 1. Edit Name");
               System.out.println(" 2. Edit price");
               System.out.println(" 3. Edit expirationDate");
               System.out.println(" 4. Edit effect");
               System.out.println(" 5. Exit");
               System.out.println("Select one number between 1 - 5:");
                num = input.nextInt();
               
               if (num == 1) {
                  System.out.print("Product Name:");
                  String name = input.next();
                  skinCareProduct.setName(name);
               }
               else if (num == 2) {
                  System.out.print("Product Price:");
                  String price = input.next();
                  skinCareProduct.setPrice(price);
               }
               else if (num == 3) {
                  System.out.print("Product Expiration Date:");
                  String expirationDate = input.next();
                  skinCareProduct.setExpirationDate(expirationDate);
               }
               else if (num == 4) {
                  System.out.print("Product effect:");
                  String effect = input.next();
                  skinCareProduct.setEffect(effect);
               }
               else {
                  continue;
               } // if
            } // while
            break;
         } // if
      } // for
   }

   public void viewSkinCareProducts() {
      for (int i = 0; i<skinCareProducts.size(); i++) {
         skinCareProducts.get(i).printInfo();
         
      }
        
   }
} 