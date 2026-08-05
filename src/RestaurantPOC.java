import java.util.Scanner;

public class RestaurantPOC {
	

	public static void main(String[] args) {
		System.out.println("welcome to the restaurant");
		
		double vegPrice=0;
		double nonvegPrice=0;
		String choice;
		
		
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("enter the veg/non-veg:");
		String cat=sc.next();
		
		switch(cat) {
		case "non-veg"->{
			System.out.println("enter the non veg item:");
			String item=sc.next();
			
			switch(item){
			case "cbir"->{
				System.out.println("chicken biryani=150");
				double cbiryaniprice=150;
				nonvegPrice+=cbiryaniprice;
				
			}
			case "mbir" -> {
			    System.out.println("Mutton Biryani = 250 rs");
			    double mbirPrice = 250.0;
			    nonvegPrice += mbirPrice;
			}

			case "fbir" -> {
			    System.out.println("Fish Biryani = 220 rs");
			    double fbirPrice = 220.0;
			    nonvegPrice += fbirPrice;
			}

			case "ebir" -> {
			    System.out.println("Egg Biryani = 120 rs");
			    double ebirPrice = 120.0;
			    nonvegPrice += ebirPrice;
			}

			case "ck65" -> {
			    System.out.println("Chicken 65 = 180 rs");
			    double ck65Price = 180.0;
			    nonvegPrice += ck65Price;
			}

			case "ckfr" -> {
			    System.out.println("Chicken Fry = 200 rs");
			    double ckfrPrice = 200.0;
			    nonvegPrice += ckfrPrice;
			}

			case "mtfr" -> {
			    System.out.println("Mutton Fry = 320 rs");
			    double mtfrPrice = 320.0;
			    nonvegPrice += mtfrPrice;
			}

			case "fryf" -> {
			    System.out.println("Fish Fry = 220 rs");
			    double fryfPrice = 220.0;
			    nonvegPrice += fryfPrice;
			}

			case "prwn" -> {
			    System.out.println("Prawns Fry = 280 rs");
			    double prwnPrice = 280.0;
			    nonvegPrice += prwnPrice;
			}

			case "crab" -> {
			    System.out.println("Crab Curry = 350 rs");
			    double crabPrice = 350.0;
			    nonvegPrice += crabPrice;
			}

			case "ome" -> {
			    System.out.println("Omelette = 50 rs");
			    double omePrice = 50.0;
			    nonvegPrice += omePrice;
			}

			case "eggc" -> {
			    System.out.println("Egg Curry = 140 rs");
			    double eggcPrice = 140.0;
			    nonvegPrice += eggcPrice;
			}

			case "ckcr" -> {
			    System.out.println("Chicken Curry = 240 rs");
			    double ckcrPrice = 240.0;
			    nonvegPrice += ckcrPrice;
			}

			case "mtcr" -> {
			    System.out.println("Mutton Curry = 340 rs");
			    double mtcrPrice = 340.0;
			    nonvegPrice += mtcrPrice;
			}

			case "fshr" -> {
			    System.out.println("Fish Curry = 260 rs");
			    double fshrPrice = 260.0;
			    nonvegPrice += fshrPrice;
			}
			default->System.out.println("invalid non veg item");	
			}
		}
		case "veg"->{

			System.out.println("eneter the items:");
			String item=sc.next();
			
			switch(item) {
			case "vbir"->{
				System.out.println("veg biryani=120");
				double vegbiryaniPrice=120;
				vegPrice+=vegbiryaniPrice;
				
			}
			case "pbir" -> {
			    System.out.println("Paneer Biryani = 180 rs");
			    double paneerbiryaniPrice = 180;
			    vegPrice += paneerbiryaniPrice;
			}

			case "mbir" -> {
			    System.out.println("Mushroom Biryani = 170 rs");
			    double mushroombiryaniPrice = 170;
			    vegPrice += mushroombiryaniPrice;
			}

			case "fric" -> {
			    System.out.println("Veg Fried Rice = 130 rs");
			    double friedricePrice = 130;
			    vegPrice += friedricePrice;
			}

			case "nood" -> {
			    System.out.println("Veg Noodles = 140 rs");
			    double noodlesPrice = 140;
			    vegPrice += noodlesPrice;
			}

			case "pman" -> {
			    System.out.println("Paneer Manchurian = 190 rs");
			    double paneermanchurianPrice = 190;
			    vegPrice += paneermanchurianPrice;
			}

			case "gobi" -> {
			    System.out.println("Gobi Manchurian = 160 rs");
			    double gobimanchurianPrice = 160;
			    vegPrice += gobimanchurianPrice;
			}

			case "pmas" -> {
			    System.out.println("Paneer Masala = 220 rs");
			    double paneermasalaPrice = 220;
			    vegPrice += paneermasalaPrice;
			}

			case "dalf" -> {
			    System.out.println("Dal Fry = 140 rs");
			    double dalfryPrice = 140;
			    vegPrice += dalfryPrice;
			}

			case "mixv" -> {
			    System.out.println("Mix Veg Curry = 180 rs");
			    double mixvegPrice = 180;
			    vegPrice += mixvegPrice;
			}

			case "chap" -> {
			    System.out.println("Chapathi = 20 rs");
			    double chapathiPrice = 20;
			    vegPrice += chapathiPrice;
			}

			case "naan" -> {
			    System.out.println("Butter Naan = 35 rs");
			    double naanPrice = 35;
			    vegPrice += naanPrice;
			}

			case "puri" -> {
			    System.out.println("Poori = 50 rs");
			    double pooriPrice = 50;
			    vegPrice += pooriPrice;
			}

			case "idle" -> {
			    System.out.println("Idli = 40 rs");
			    double idliPrice = 40;
			    vegPrice += idliPrice;
			}

			case "dose" -> {
			    System.out.println("Masala Dosa = 80 rs");
			    double dosaPrice = 80;
			    vegPrice += dosaPrice;
			}

			case "upma" -> {
			    System.out.println("Upma = 60 rs");
			    double upmaPrice = 60;
			    vegPrice += upmaPrice;
			}

			case "pong" -> {
			    System.out.println("Pongal = 70 rs");
			    double pongalPrice = 70;
			    vegPrice += pongalPrice;
			}

			case "meal" -> {
			    System.out.println("Veg Meals = 150 rs");
			    double mealsPrice = 150;
			    vegPrice += mealsPrice;
			}

			case "curd" -> {
			    System.out.println("Curd Rice = 80 rs");
			    double curdricePrice = 80;
			    vegPrice += curdricePrice;
			}

			case "lemr" -> {
			    System.out.println("Lemon Rice = 90 rs");
			    double lemonricePrice = 90;
			    vegPrice += lemonricePrice;
			}
			default->System.out.println("invalid veg option selected");
			}
		}
		
		
		
		default->System.out.println("invalid option");
	}
		System.out.println("Do you want to add another item? (yes/no)");
        choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));

        System.out.println("\n========== BILL ==========");
        System.out.println("nonVeg Price : " + nonvegPrice);
        System.out.println("veg Price     : " + vegPrice);
        System.out.println("Total Amount    : " + (nonvegPrice + vegPrice));
		
		
		sc.close();
	}
}
