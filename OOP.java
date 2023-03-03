import java.util.*;
public class OOP{
   
    void mod(Scanner sc, String welcomeMessage, String[] menu, String[][] submenu, int[][] price) {
        int totalPrice = 0 ;
        String basqet = "" ;
        
        //welcomeMessage
        if (welcomeMessage != null) {
                String[] message = welcomeMessage.split("_");
                for (String mess : message)
                System.out.println(mess.trim());
        }
        
        //determinig count
        int count = 0;
        for (int i = 1; i < menu.length; i++){
            if (menu[i] == null) break;
            count++;
        }
        
        //menu
        boolean k = true;
        while (k){
            if(menu[1] != null) {
                System.out.println("\n0. Exit menu.");
                for (int i = 1; i < 100; i++) {
                    if (menu[i] == null) break;
                    System.out.println((i) + ". " + menu[i] + ".");}
                System.out.println(count + 1 + ". Clear basket.");
                System.out.println(count + 2 + ". Check basket.");

            }else{
                System.out.println("You don't have a menu yet!");
            }System.out.print("Choose one: ");
        
            int s = sc.nextInt();
            if(s == 0){
                break;
            } else if (s == count + 1) {
                basqet = "" ;
                totalPrice = 0 ; 
            } else if (s == count + 2) {
                if (basqet.isEmpty()) {
                    System.out.println("Basket is empty.");
            }
                else {
                    System.out.println(basqet);
                    System.out.println("Total price: " + totalPrice + " kzt."); }
            } else {
                for (int i = 0; i < 100; i++) {
                    if (submenu[s][i + 1] == null) break;
                       System.out.println(i + 1 + ". " + submenu[s][i + 1] + " - " + price[s][i + 1] + " kzt.");}

                    System.out.print("\nChoose subcategory to put it into the basket: ");
                    int c = sc.nextInt();
                    basqet += submenu[s][c] + " - " + price[s][c] + " kzt." + "\n";
                    totalPrice += price[s][c];
                    }

            }

            
            
    }

}

