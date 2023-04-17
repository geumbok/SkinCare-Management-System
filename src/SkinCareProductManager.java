import java.util.ArrayList;
import java.util.Scanner;

public class SkinCareProductManager {
   
   ArrayList<SkinCareProduct> skinCareProducts = new ArrayList<SkinCareProduct>();
   Scanner input;
   SkinCareProductManager(Scanner input) {
      this.input = input;
   }

   public void addSkinCareProduct() {
      SkinCareProduct skinCareProduct = new SkinCareProduct();
      System.out.print("Product Name:");
      skinCareProduct.name = input.next();
      input.next();
      System.out.print("Product Price:");
      skinCareProduct.price = input.next();
      input.nextLine();
      System.out.print("Product Expiration date:");
      skinCareProduct.expirationDate = input.next();
      input.nextLine();
      System.out.print("Product Effect:");
      skinCareProduct.effect = input.nextLine();
      skinCareProducts.add(skinCareProduct);
   }
      
      
   public void deleteSkinCareProduct() {
      System.out.print("Product Name:");
      String productName = input.next();
      int index = -1;
      for (int i = 0; i<skinCareProducts.size(); i++) {
         if (skinCareProducts.get(i).name.equals(productName)) {
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
         if (skinCareProduct.name.equals(productName)) {
            
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
                  skinCareProduct.name = input.next();
               }
               else if (num == 2) {
                  System.out.print("Product Price:");
                  skinCareProduct.price = input.next();
               }
               else if (num == 3) {
                  System.out.print("Product Expiration Date:");
                  skinCareProduct.expirationDate = input.next();
               }
               else if (num == 4) {
                  System.out.print("Product effect:");
                  skinCareProduct.effect = input.next();
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