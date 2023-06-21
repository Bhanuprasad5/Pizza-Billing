package Pizzabill;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Pizza opptions \n1 Normal :");
        System.out.println("Classic hand tossed thin crust Pizzas");
        System.out.println("Vegetarian"); 
        System.out.println("Tomatoes, Capsicum, Onlions and Corns.");       
        System.out.println("Non-Vegetarian: \n Grilled Chicken Rashers, Peri-Peri Chicken,   Onion, Capsicum");
        System.out.println("2. Delux : \n Classic hand tossed Cheese Bust Pizzas \n Vegetarian: \n Crunchy onions, crispy capsicum, succulent mushrooms, juicy  tomatoes, liberal sprinkling of exotic Mexican herbs and golden corn to top it all. ");
        System.out.println("Non-Vegetarian: \n Crunchy onions, crispy capsicum, Crunchy onions, crispy capsicum, of exotic Mexican herbs and golden corn to top it all. \n  ");
        System.out.println("Your Choice [normal/delux]: ");
        Scanner sc=new Scanner(System.in);
        String cho=sc.next();
        b ob=new b();
        ob.choice(cho);
    
}
}