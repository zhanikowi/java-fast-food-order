import java.util.Scanner;
public class FastFood{
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        String basqet = "" ;
        
        System.out.println("Welcome to the menu of 'Salam Bro' Fast Food Station.");
        System.out.println("Here you can see our menu below.");

        int totalPrice = 0 ;
        boolean k = true;
        while (k) {
            System.out.println("0.Exit menu.");
            System.out.println("1.Burgers.");
            System.out.println("2.Hot dogs.");
            System.out.println("3.French fries.");
            System.out.println("4.Drinks.");
            System.out.println("5.Sauces.");
            System.out.println("6.Additives.");
            System.out.println("7.Clear Basket.");
            System.out.println("8.Check Basket.");
            System.out.print("Choose one: ");
            int s = scan.nextInt() ;
            switch(s){
                case(0) : k = false ; break ;
                case(1):
                    System.out.println(" ");
                    System.out.println("0. Exit menu.");
                    System.out.println("1. Chicken Hamburger - 590 kzt.");
                    System.out.println("2. Beef Hamburger - 790 kzt.");
                    System.out.println("3. Chicken Cheeseburger - 790 kzt.");
                    System.out.println("4. Beef Cheeseburger - 890 kzt.");
                    System.out.println("5. Double chicken hamburger - 990 kzt.");
                    System.out.println("6. Double chicken cheeseburger - 1090 kzt.");
                    System.out.println("7. Double beef hamburger - 1090 kzt.");
                    System.out.println("8. Double beef cheeseburger - 1190 kzt.");
                    System.out.println("9. Mixed hamburger - 1090 kzt.");
                    System.out.println("10. Mixed cheeseburger - 1190 kzt.");
                    System.out.println(" ");

                    System.out.print("Choose a burger:");

                    int choose = scan.nextInt() ;

                    switch (choose){
                        case (0) : break ;
                        case (1) : basqet += "Chicken Hamburger - 590 kzt. \n"  ; totalPrice += 590 ; break ;
                        case (2) : basqet += "Beef Hamburger - 790 kzt.\n " ; totalPrice += 790 ;break ;
                        case (3) : basqet += "Chicken Cheeseburger - 790 kzt.\n " ;totalPrice += 790 ; break ;
                        case (4) : basqet += "Beef Cheeseburger - 890 kzt. \n" ;totalPrice += 890 ; break ;
                        case (5) : basqet += "Double chicken hamburger - 990 kzt. \n" ; totalPrice += 990 ;break ;
                        case (6) : basqet += "Double chicken cheeseburger - 1090 kzt. \n" ; totalPrice += 1090 ;break ;
                        case (7) : basqet += "Double beef hamburger - 1090 kzt. \n" ; totalPrice += 1090 ;break ;
                        case (8) : basqet += "Double beef cheeseburger - 1190 kzt. \n" ; totalPrice += 1190 ;break ;
                        case (9) : basqet += "Mixed hamburger - 1090 kzt. \n" ; totalPrice += 1090 ;break ;
                        case (10) : basqet += "Mixed cheeseburger - 1190 kzt. \n" ; totalPrice += 1190 ;break ;



                    }
                    break;
                case(2):
                    System.out.println(" ");
                    System.out.println("0. Exit Menu.");
                    System.out.println("1. Spicy hot dog - 590 kzt.");
                    System.out.println("2. Hot dog - 590 kzt.");
                    System.out.println(" ");
                    System.out.print("Choose a hot dog:");

                    int choose1 = scan.nextInt() ;

                    switch (choose1){
                        case (0) : break ;
                        case (1) : basqet += "Spicy hot dog - 590 kzt. \n"  ; totalPrice += 590 ; break ;
                        case (2) : basqet += "Hot dog - 590 kzt.\n " ; totalPrice += 590 ;break ;

                    }
                    break;
                case(3):
                    System.out.println(" ");
                    System.out.println("0. Exit Menu.");
                    System.out.println("1.French fries - 390 kzt. ");
                    System.out.println(" ");
                    System.out.print("Choose french fries:");
                    int choose2 = scan.nextInt() ;
                    switch (choose2){
                        case (0) : break ;
                        case (1) : basqet += "French fries - 390 kzt.  \n"  ; totalPrice += 390 ; break ;
                    }
                    break;
                case(4):
                    System.out.println(" ");
                    System.out.println("0. Exit menu.");
                    System.out.println("1. Coca-cola 0.51 - 250 kzt.");
                    System.out.println("2. Fanta 0.51 - 250 kzt.");
                    System.out.println("3. Sprite 0.51 - 250 kzt.");
                    System.out.println("4. Fuse tea 0.51 - 250 kzt.");
                    System.out.println("5. Bon aqua 0.51 - 250 kzt.");
                    System.out.println("6. Raspberry compote 0.31 - 250 kzt.");
                    System.out.println("7. Currant compote 0.31 - 250 kzt. ");
                    System.out.println("8. Piko pulpy 0.51 - 350 kzt.");
                    System.out.println(" ");
                    System.out.print("Choose a drink:");

                    int choose3 = scan.nextInt();
                    switch (choose3){
                        case (0) : break ;
                        case (1) : basqet += "Coca-cola 0.51 - 250 kzt. \n"  ; totalPrice += 2500 ; break ;
                        case (2) : basqet += "Fanta 0.51 - 250 kzt.\n " ; totalPrice += 250 ;break ;
                        case (3) : basqet += "Sprite 0.51 - 250 kzt.\n " ;totalPrice += 250 ; break ;
                        case (4) : basqet += "Fuse tea 0.51 - 250 kzt. \n" ;totalPrice += 250 ; break ;
                        case (5) : basqet += "Bon aqua 0.51 - 250 kzt. \n" ; totalPrice += 250 ;break ;
                        case (6) : basqet += "Raspberry compote 0.31 - 250 kzt. \n" ; totalPrice += 250 ;break ;
                        case (7) : basqet += "Currant compote 0.31 - 250 kzt. \n" ; totalPrice += 250 ;break ;
                        case (8) : basqet += "Piko pulpy 0.51 - 350 kzt. \n" ; totalPrice += 350 ;break ;
                    }
                    break;
                case(5):
                    System.out.println(" ");
                    System.out.println("0. Exit menu.");
                    System.out.println("1. Ketchup - 100 kzt.");
                    System.out.println("2. Cheese sauce - 100 kzt.");
                    System.out.println("3. Sauce BBQ - 100 kzt.");
                    System.out.println("4. Spicy sauce - 50 kzt.");
                    System.out.println("5. Mustard sauce - 100 kzt.");
                    System.out.println(" ");
                    System.out.print("Choose a sauce:");

                    int choose4 = scan.nextInt();
                    switch (choose4){
                        case (0) : break ;
                        case (1) : basqet += "Ketchup - 100 kzt. \n"  ; totalPrice += 100 ; break ;
                        case (2) : basqet += "Cheese sauce - 100 kzt.\n " ; totalPrice += 100 ;break ;
                        case (3) : basqet += "Sauce BBQ - 100 kzt.\n " ;totalPrice += 100 ; break ;
                        case (4) : basqet += "Spicy sauce - 50 kzt. \n" ;totalPrice += 50 ; break ;
                        case (5) : basqet += "Mustard sauce - 100 kzt.\n" ; totalPrice += 100 ;break ;
                    }
                    break;
                case(6):
                    System.out.println(" ");
                    System.out.println("0. Exit menu.");
                    System.out.println("1. Jalapeno - 100 kzt.");
                    System.out.println("2. Cheese - 150 kzt.");
                    System.out.println(" ");
                    System.out.print("Choose an additive:");

                    int choose5 = scan.nextInt() ;
                    switch (choose5){
                        case (0) : break ;
                        case (1) : basqet += "Jalapeno - 100 kzt. \n"  ; totalPrice += 100 ; break ;
                        case (2) : basqet += "Cheese - 150 kzt.\n " ; totalPrice += 150 ;break ;
                    }
                    break;
                case(7):
                    System.out.println(" ");
                    basqet = "" ;
                    totalPrice = 0 ;
                    break;
                case(8):
                    System.out.println(" ");
                    if (basqet.isEmpty()) {
                        System.out.println("Basket is empty.");

                    }
                    else
                        System.out.println(basqet);
                    System.out.println("Total price : " + totalPrice);
                    break;

            }

        }

    }
}