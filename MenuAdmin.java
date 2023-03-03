import java.util.*;

public class MenuAdmin{

 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   Scanner in = new Scanner(System.in);
   String[] welcomeMessage = new String[0];
   String[] menu = new String[100];
   String[][] submenu = new String[100][100];
   int[][] price = new int[100][100];
   int menucnt = 0;
   int[] submenucnt = new int[100];
   Arrays.fill(submenucnt, 0);
   int i=0;
   int j=0;
            System.out.println("Welcome to the Admin Panel of 'Salam Bro' Fast Food Station!");
            System.out.println("Here you can do the following activities:");
   boolean k=true;
   while(k){
            System.out.println("\n0.Exit menu.");
            System.out.println("1.Change Welcome message.");
            System.out.println("2.Change Menu.");
            System.out.println("3.Change SubMenu.");
            System.out.println("4.Change Prices.");
            System.out.println("5.Display Welcome Message.");
            System.out.println("6.Display Menu.");
            System.out.println("7.Display SubMenu.");
            System.out.println("8.Display Prices.");
            System.out.println("9.Switch to Client Mode(coming soon).");
            System.out.print("\nChoose an activity: ");

            int s = scan.nextInt();
           
            switch(s){
              case(0): k=false; break;
              case(1):
                System.out.println("Please, type the message that clients will see when they enter the menu: ");
                System.out.println("Tip: use underscore (_) as a splitter ");
                
                String typed = in.nextLine();
                welcomeMessage = typed.split("_");  

                
                break;
              case(2):
                  System.out.println("Here you can do the following activities:");
                  System.out.println("0.Go Back."); 
                  System.out.println("1.Add categories.");
                  System.out.println("2.Remove categories.");
                  System.out.print("\nYour choice:"); 
                  int choice1 = scan.nextInt();
                  switch (choice1){
                    case(0): break;
                    case(1): 
                      System.out.println("Write the names of categories separated by comma (c1, c2, ...):");
                      System.out.print("\n>  ");
                      String typed1 = in.nextLine();
                      String[] temporary = new String[0];
                      temporary = typed1.split(", ");
                      for(int p = 0; p < temporary.length; p ++){
                        menu[p+menucnt+1] = temporary[p]; 
                      }
                      menucnt += temporary.length;
                      System.out.println();
                      break;
                      
                    case(2): 
                      if(menu[1] != null){
                        System.out.println("Choose a category which you want to remove:");
                        for(int p = 1; p <= menucnt; p ++)
                          System.out.println((p) + ". " + menu[p] + ".");
                        System.out.print("\nYour choice: ");
                        int remmenu = scan.nextInt();
                        for(int r = remmenu; r < menucnt; r++)
                            menu[remmenu] = menu[remmenu+1];
                          menu[menucnt] = null;
                          menucnt--;
                      }
                      else{
                        System.out.println("\nYou don't have a menu yet.");
                      }
                 

                    break; } break;
                    
              case(3):
              if(menu[1] != null){
                  System.out.println("Here you can do the following activities:\n0.Go Back.\n1.Add subcategories.\n2.Remove subcategories.\nYour choice:");
                  int choice2 = scan.nextInt();
                    switch(choice2){

                      case(0): break;

                      case(1):
                      System.out.println("Choose a category for which you want to add subcategories:");
                      for(int p = 1; p <= menucnt; p ++)
                        System.out.println((p) + ". " + menu[p] + "."); 
                      System.out.print("\nYour choice: "); 
                      int choice3 = scan.nextInt();
                      System.out.println();
                      System.out.println("\nWrite the names of subcategories separated by comma(c1, c2, ...)\n");
                      System.out.print("> ");
                      String addsub = in.nextLine();
                      String[] temporary2 = new String[0];
                      temporary2 = addsub.split(", ");
                      for(int l = 0; l < temporary2.length; l ++){
                        submenu[choice3][l+submenucnt[choice3]+1] = temporary2[l]; 
                      }
                      submenucnt[choice3] += temporary2.length;
                      break;

                      case(2):    
                      if(menu[1] != null){
                        System.out.println("Choose a category for which you want to remove subcategories:");
                        for(int d = 1; d <= menucnt; d ++)
                          System.out.println((d) + ". " + menu[d] + "."); 
                        System.out.print("\nYour choice: ");
                        int choice4 = scan.nextInt();
                        if(submenu[choice4][1] != null){
                          System.out.println("Choose subcategories you want to remove by its index shown below:");
                          for(int f = 1; f <= submenucnt[choice4]; f ++)
                            System.out.println((f) + ". " + submenu[choice4][f] + "."); 
                          int remsub = scan.nextInt();
                          for(int w = remsub; w < submenucnt[choice4]; w++)
                            submenu[choice4][w] = submenu[choice4][w+1];
                          submenu[choice4][submenucnt[choice4]] = null;
                          submenucnt[choice4]--;
                        }
                        else{
                          System.out.println("\nYou don't have subcategories in this category.\n");
                        }
                      }
                      else{
                        System.out.println("\nYou don't have a menu yet.");
                      }

                            
                            
                          
                      break;
                          
                    }
                     break;
                }
                else{
                  System.out.println("\nYou don't have a  menu yet.");
                }
                     
              case(4):
              if(menu[1] != null){
                System.out.println("Choose a category for which you want to change prices of subcategories:");
                for(int p = 1; p <= menucnt; p ++)
                  System.out.println((p) + ". " + menu[p] + ".");
                System.out.print("\nYour choice: ");
                int changeprice = scan.nextInt();
                if(submenu[changeprice][1] != null){
                System.out.println();
                System.out.println("Choose a subcategories for which you want to change prices:");
                for(int f = 1; f <= submenucnt[changeprice]; f ++)
                  System.out.println((f) + ". " + submenu[changeprice][f] + " - " + price[changeprice][f] + " kzt.");
                System.out.println("\nTip: write indexes seperated by comma(i1, i2 ...)\n");
                System.out.print("> ");
                String price2 = in.nextLine();
                String[] temporary3 = new String[0];
                temporary3 = price2.split(", ");
                System.out.print("\nEnter a new price for " + menu[changeprice] +":");
                int price3 = scan.nextInt();
                for(int y = 0; y < temporary3.length; y ++){
                  int indexofprice = Integer.parseInt(temporary3[y]);
                  price[changeprice][indexofprice] = price3;
                }
                }
                else{
                  System.out.println("\nYou don't have subcategories in this category.");
                }
              }
              else{
                System.out.println("\nYou don't have a menu yet.");
              }


              case(5):
              for(int o = 0; o < welcomeMessage.length; o ++)
                   System.out.println(welcomeMessage[o]);
              System.out.println();
              break;

              case(6):
                if(menu[1] == null){
                  System.out.println("\nYou don't have a menu yet!");
                }
                else{
                  for(int p = 1; p <= menucnt; p ++)
                    System.out.println((p) + ". " + menu[p] + "."); 
                }
                    System.out.println();
                    break;
                

              case(7): 
              if(menu[1] != null){
                  System.out.println("Choose a category for which you want to see its subcategories:");
                  for(int p = 1; p <= menucnt; p ++)
                    System.out.println((p) + ". " + menu[p] + ".");
                  System.out.print("\nYour choice:"); 
                  int choice5 = scan.nextInt();
                  if(submenu[choice5][1] != null){
                  System.out.println(); 
                  for(int u = 1; u <= submenucnt[choice5]; u ++)
                    System.out.println((u) + ". " + submenu[choice5][u] + "."); 
                  System.out.println(); 
                }
                else{
                  System.out.println("\nYou don't have subcategories in this category.");
                }
              }
              else{
                System.out.println("\nYou don't have a menu yet.");
              }       
              break;

              case(8): 
              if(menu[1] != null){
              System.out.println("Choose a category for which you want to see its subcategories' prices:");
              for(int p = 1; p <= menucnt; p ++)
                System.out.println((p) + ". " + menu[p] + ".");
              System.out.print("\nYour choice: ");
              int seeprice = scan.nextInt();
              System.out.println();
              if(submenu[seeprice][1] != null){
                for(int u = 1; u <= submenucnt[seeprice]; u ++)
                  System.out.println((u) + ". " + submenu[seeprice][u] + " - " + price[seeprice][u] + " kzt."); 
              }
              else{
                System.out.println("You don't have subcategories in this category.");
              }
              }
              else{
                System.out.println("You don't have a menu yet.");
              }

              case(9): break;
              }
            
     }
    }

      
     


}