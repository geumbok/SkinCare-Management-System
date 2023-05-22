package forProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SkinCareProductManager skinCareProductManager = new SkinCareProductManager(input);

		selectMenu(input, skinCareProductManager);
	}

	public static void selectMenu(Scanner input, SkinCareProductManager skinCareProductManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					skinCareProductManager.addSkinCareProduct();
					break;
				case 2:
					skinCareProductManager.deleteSkinCareProduct();
					break;
				case 3:
					skinCareProductManager.editSkinCareProduct();
					break;
				case 4:
					skinCareProductManager.viewSkinCareProducts();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;				
			}
		}		
	}

	public static void showMenu() {
		System.out.println("*** SkinCareProduct Management System Menu ***");
		System.out.println(" 1. Add SkinCareProduct");
		System.out.println(" 2. Delete SkinCareProduct");
		System.out.println(" 3. Edit SkinCareProduct");
		System.out.println(" 4. View SkinCareProduct");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");

	}
}