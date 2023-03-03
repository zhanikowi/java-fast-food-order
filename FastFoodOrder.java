import java.util.*;

public class FastFoodOrder{
    public static String welcomeMessage = "";
    public static String[] menu = new String[100];
    public static String[][] submenu = new String[100][100];
    public static int[][] price = new int[100][100];
    public static int menucnt = 0;
    public static int[] submenucnt = new int[100];
     
    public static void printMenu() {
        for (int p = 1; p <= menucnt; p++)
            System.out.println((p) + ". " + menu[p] + ".");
    }
  
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      OOP cm = new OOP();
      System.out.println("\nWelcome to the Admin Panel of \"Salam Bro\" Fast Food Station! \nHere you can do the following activities: ");
      boolean k = true;
      while (k){
            System.out.println("\n0.Exit menu.");
            System.out.println("1.Change Welcome message.");
            System.out.println("2.Change Menu.");
            System.out.println("3.Change SubMenu.");
            System.out.println("4.Change Prices.");
            System.out.println("5.Display Welcome Message.");
            System.out.println("6.Display Menu.");
            System.out.println("7.Display SubMenu.");
            System.out.println("8.Display Prices.");
            System.out.println("9.Switch to Client Mode.");
            System.out.print("\nChoose an activity: ");

            int s = in.nextInt();
           
            switch(s){
              case(0): 
                System.exit(0); 
                break;
              
              case(1):
                changeWelcomeM();
                break;
              
              case(2):
                changeMenu(); 
                break;
                    
              case(3):
                changeSubmenu();
                break;
                     
              case(4):
                changePrice();
                break;

              case(5):
                displayMessage();
                break;

              case(6):
                displayMenu();
                break;
                

              case(7): 
                displaySubmenu();
                break;

              case(8): 
                displayPrices();
                break;

              case(9):
                cm.mod(in, welcomeMessage, menu, submenu, price);
                break;
              }           
      }
    }
    public static void changeWelcomeM(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, type the message that clients will see when they enter the menu: ");
        System.out.println("Tip: use underscore (_) as a splitter");
        
        welcomeMessage = in.nextLine();
    }

    public static void changeMenu(){
        Scanner in = new Scanner(System.in);
        System.out.print("Here you can do the following activities: \n0.Go Back. \n1.Add categories. \n2.Remove categories. \nYour choice: ");
        int choice1 = in.nextInt();
            switch (choice1){
                    case(0): break;
                    case(1): 
                      System.out.print("Write the names of categories separated by comma (c1, c2, ...): \n> ");  
                      in.nextLine();
                      String typed1 = in.nextLine();
                      String[] temporary = new String[0];
                      temporary = typed1.split(", ");
                      for(int p = 0; p < temporary.length; p ++){
                          menu[p+menucnt+1] = temporary[p]; 
                      }
                      menucnt += temporary.length;
                    break;
                      
                    case(2): 
                      if(menu[1] != null){
                          System.out.print("Choose a category which you want to remove: ");
                          for(int p = 1; p <= menucnt; p ++)
                              System.out.println((p) + ". " + menu[p] + ".");
                          System.out.print("\nYour choice: ");
                          int remmenu = in.nextInt();
                          for(int r = remmenu; r < menucnt; r++)
                              menu[remmenu] = menu[remmenu+1];
                              menu[menucnt] = null;
                              menucnt--;
                      }
                      else{
                        System.out.println("\nYou don't have a menu yet.");
                      }
                    break; 
            }
    }

    public static void changeSubmenu(){
      Scanner in = new Scanner(System.in);
      if(menu[1] != null){
        System.out.print("Here you can do the following activities:\n0.Go Back.\n1.Add subcategories.\n2.Remove subcategories.\nYour choice: ");
        int choice2 = in.nextInt();
            switch(choice2){
                    case(0): break;

                    case(1):
                      System.out.println("Choose a category for which you want to add subcategories:");
                      printMenu();
                      System.out.print("\nYour choice: ");
                      int choice3 = in.nextInt();
                      System.out.println();
                      System.out.println("\nWrite the names of subcategories separated by comma(c1, c2, ...)");
                      System.out.print("> ");
                      in.nextLine();
                      String addsub = in.nextLine();
                      String[] temporary2 = new String[0];
                      temporary2 = addsub.split(", ");
                      for(int l = 0; l < temporary2.length; l ++){
                          submenu[choice3][l + submenucnt[choice3]+1] = temporary2[l]; 
                      } submenucnt[choice3] += temporary2.length;
                    break;

                    case(2):    
                      if(menu[1] != null){
                        System.out.println("Choose a category for which you want to remove subcategories:");
                        printMenu(); 
                        System.out.print("\nYour choice: ");
                        int choice4 = in.nextInt();
                          if(submenu[choice4][1] != null){
                            System.out.println("Choose subcategories you want to remove by its index shown below:");
                            for(int f = 1; f <= submenucnt[choice4]; f ++)
                                System.out.println((f) + ". " + submenu[choice4][f] + "."); 
                            int remsub = in.nextInt();
                            for(int w = remsub; w < submenucnt[choice4]; w++)
                                submenu[choice4][w] = submenu[choice4][w+1];
                                submenu[choice4][submenucnt[choice4]] = null;
                                submenucnt[choice4]--;
                          }
                          else{
                            System.out.println("\nYou don't have subcategories in this category.\n");}
                      } else{
                          System.out.println("\nYou don't have a menu yet.");
                      } 
                    break;
            }
      }
      else{
        System.out.println("\nYou don't have a  menu yet.");
      }

    }

    public static void changePrice(){
      Scanner in = new Scanner(System.in);
      if(menu[1] != null){
        System.out.println("Choose a category for which you want to change prices of subcategories:");
        printMenu();
        System.out.print("\nYour choice: ");
        int changeprice = in.nextInt();
            if(submenu[changeprice][1] != null){
                System.out.println();
                System.out.println("Choose a subcategories for which you want to change prices: ");
                for(int f = 1; f <= submenucnt[changeprice]; f ++)
                    System.out.println((f) + ". " + submenu[changeprice][f] + " - " + price[changeprice][f] + " kzt.");
                System.out.print("\nTip: write indexes seperated by comma(i1, i2 ...) \n> ");
                in.nextLine();
                String price2 = in.nextLine();
                String[] temporary3 = price2.split(", ");
                for(int y = 0; y < temporary3.length; y ++){
                    System.out.print("\nEnter a new price for " + submenu[changeprice][y+1] +": ");
                    int price3 = in.nextInt();
                    int indexofprice = Integer.parseInt(temporary3[y]);
                    price[changeprice][indexofprice] = price3;
                }
            }
            else{
              System.out.println("\nYou don't have subcategories in this category.");}
      } else{
          System.out.println("\nYou don't have a menu yet.");
              }
    }

    public static void displayMessage(){
      Scanner in = new Scanner(System.in);
        if (welcomeMessage == ""){
                System.out.println("\nYou don't have a Welcome Message yet.");}
        else {
                String[] message = welcomeMessage.split("_");
                for (String mess : message)
                System.out.println(mess.trim() + " ");}
    }

    public static void displayMenu(){
      if(menu[1] == null){
                  System.out.println("\nYou don't have a menu yet!");
      } else{
          printMenu();
        }         
    }

    public static void displaySubmenu(){
      Scanner in = new Scanner(System.in);
      if(menu[1] != null){
        System.out.println("Choose a category for which you want to see its subcategories: ");
        printMenu();
        System.out.print("\nYour choice: "); 
        int choice5 = in.nextInt();
        if(submenu[choice5][1] != null){
            System.out.println(); 
            for(int u = 1; u <= submenucnt[choice5]; u ++)
                System.out.println((u) + ". " + submenu[choice5][u] + "."); 
                System.out.println(); 
        } else{
            System.out.println("\nYou don't have subcategories in this category.");}
      } else{
          System.out.println("\nYou don't have a menu yet.");
      }       
              
    }

    public static void displayPrices(){
      Scanner in = new Scanner(System.in);
      if(menu[1] != null){
        System.out.println("Choose a category for which you want to see its subcategories' prices: ");
        printMenu();
        System.out.print("\nYour choice: ");
        int seeprice = in.nextInt();
        if(submenu[seeprice][1] != null){
            for(int u = 1; u <= submenucnt[seeprice]; u ++)
                System.out.println((u) + ". " + submenu[seeprice][u] + " - " + price[seeprice][u] + " kzt."); 
        } else{
            System.out.println("You don't have subcategories in this category."); }
              }
      else{
        System.out.println("You don't have a menu yet.");
      }
    }


    

      
     


}
