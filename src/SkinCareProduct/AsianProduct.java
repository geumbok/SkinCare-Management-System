package SkinCareProduct;

import java.util.Scanner;

import exception.ExpirationDateFormatException;

public abstract class AsianProduct extends SkinCareProduct {
   
   public AsianProduct(MadeIn country) {
       super(country);
    }

   @Override
   public abstract void getUserInput(Scanner input);


   @Override
   public void printInfo() {
      String scountry = getCountryString();
        System.out.println("country:" + scountry + "Product Name:" + name + " price:" + price +
                        " expirationDate:" + expirationDate + " effect:" + effect);
    }
   public void setProductExpirationwithYN(Scanner input) {
      char answer='x';
        while(answer!='y' && answer!='Y' && answer!='n' && answer!='N')
        {
           System.out.print("It has an expiration date? (Y/N)");
           answer=input.nextLine().charAt(0);
           try {

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
            catch(ExpirationDateFormatException e) {
               System.out.println("Incorrect Expiration Format. put the expration date that contains /");
               
            }   
        }      
   }
}