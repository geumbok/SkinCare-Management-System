package SkinCareProduct;

import java.util.Scanner;

import exception.ExpirationDateFormatException;

public class JapanProduct extends AsianProduct {
   
   protected String parentExpirationDate;
    protected String parentEffect;
   
    public JapanProduct(MadeIn country) {
       super(country);
    }
   
   public void getUserInput(Scanner input) {
       setProductName(input);
       input.nextLine();
       setProductPrice(input);     
       input.nextLine();
       setProductExpirationwithYN(input);
       setPackDatewithYN(input);
        setProductEffect(input);  
        input.nextLine();
    }
   
   public void setPackDatewithYN(Scanner input) {
      char answer='x';
        while(answer!='y' && answer!='Y' && answer!='n' && answer!='N')
        {
           System.out.print("It has a pack date? (Y/N)");
           answer=input.next().charAt(0);
           try {

              if(answer=='y'||answer=='Y') {
                 setPackDate(input);
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
   
   
   public void printInfo() {
      String scountry = getCountryString();
        System.out.println("country:" + scountry + "  Product Name:" + name + "  price:" + price +
                        "  expirationDate:" + expirationDate + "  effect:" + effect + "  Pack Date:" + packDate);
    }
   
   
}