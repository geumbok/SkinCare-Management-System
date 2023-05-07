import java.util.Scanner;

public class MenuManager {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      SkinCareProductManager skinCareProductManager = new SkinCareProductManager(input);
      
      int num = -1;
      while (num != 5) {
         System.out.println("*** SkinCareProduct Management System Menu ***");
         System.out.println(" 1. Add SkinCareProduct");
         System.out.println(" 2. Delete SkinCareProduct");
         System.out.println(" 3. Edit SkinCareProduct");
         System.out.println(" 4. View SkinCareProduct");
         System.out.println(" 5. Exit");
         System.out.println("Select one number between 1 - 5:");
         num = input.nextInt();
         
         if (num == 1) {
            skinCareProductManager.addSkinCareProduct();
         }
         else if (num == 2) {
            skinCareProductManager.deleteSkinCareProduct();
         }
         else if (num == 3) {
            skinCareProductManager.editSkinCareProduct();
         }
         else if (num == 4) {
            skinCareProductManager.viewSkinCareProducts ();
            
         }
         else {
            continue;
         }
      }
   }
}