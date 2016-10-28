package task;

import java.util.Scanner;

public class program {

	
	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("0 for search, 1 for insert, 2 for update, 3 for delete");
			Scanner scan= new Scanner (System.in);
			int cases = scan.nextInt();
			
		product testprod = new product(999);
		
		
		
		XYZ ss = new XYZ();
		switch (cases)
		{case 0:
			System.out.println("Please, insert the manufacturer: ");
			Scanner manu= new Scanner (System.in);
			String Manuf = manu.nextLine();
			testprod.setManufacturer(Manuf);
		ss.search_product(testprod);
		break;
		
		case 1:
			System.out.println("Please, insert the Product ID: ");
			Scanner ProdID= new Scanner (System.in);
			int ProdId = ProdID.nextInt();
			testprod.setID(ProdId);
			System.out.println("Please, insert the Manufacturer: ");
			Scanner manuf= new Scanner (System.in);
			String Manu = manuf.nextLine();
			testprod.setManufacturer(Manu);
			System.out.println("Please, insert the Type: ");
			Scanner type= new Scanner (System.in);
			String Type = type.nextLine();
			testprod.setType(Type);
			System.out.println("Please, insert the Production Date: ");
			Scanner prodDate= new Scanner (System.in);
			String Pdate = prodDate.nextLine();
			testprod.setProductionDate(Pdate);
			System.out.println("Please, insert the Expiry Date: ");
			Scanner expiryDate= new Scanner (System.in);
			String Edate = expiryDate.nextLine();
			testprod.setExpiryDate(Edate);
		    ss.insert_product(testprod);
		break;
		
		case 2:
			System.out.println("Please, insert the ID of the product you want to update:");
			Scanner id= new Scanner (System.in);
			int iD = id.nextInt();
			testprod.setID(iD);
			System.out.println("Please, insert the Type: ");
			Scanner type2= new Scanner (System.in);
			String Type2 = type2.nextLine();
			testprod.setType(Type2);
			System.out.println("The Manufacturer: ");
			Scanner manuf2= new Scanner (System.in);
			String Manu2 = manuf2.nextLine();
			testprod.setManufacturer(Manu2);
			System.out.println("The Production Date: ");
			Scanner prodDate2= new Scanner (System.in);
			String Pdate2 = prodDate2.nextLine();
			testprod.setProductionDate(Pdate2);
			System.out.println("The Expiry Date: ");
			Scanner expiryDate2= new Scanner (System.in);
			String Edate2 = expiryDate2.nextLine();
			testprod.setExpiryDate(Edate2);
		    ss.update_product(testprod);
		break;
		
		case 3:
		System.out.println("Please, insert the ID: ");
		Scanner id2= new Scanner (System.in);
		int iD2 = id2.nextInt();
		testprod.setID(iD2);
		ss.delete_product(testprod);
		break;
		
		
		default:
			System.out.println("Unavailable!");
		break;
		}
		}

}
}
