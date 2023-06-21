package Pizzabill;

import java.util.Scanner;

import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;

class b{ 

    public void choice(String ch){
        if(ch.equalsIgnoreCase("delux")){
            System.out.println("Select: \n a. Vegetarian \n b. Non Vegetarian ");
            System.out.println("Your Choice [a or b]: ");
            int cheese1=0,Toppings1=0;
            int water=0;
            int packets1=0,drinks1=0,takeaway1;
            Scanner sc=new Scanner(System.in);
            String chab=sc.next();
            if(chab.equalsIgnoreCase("a")){
                System.out.println("Crunchy onions, crispy capsicum, Crunchy onions, crispy capsicum,  ");
            }
            else{
                System.out.println("The wholesome flavour of tandoori masala with  Chicken tikka I onion I red paprika I mint mayo ");
            }
            System.out.println("Let us select the extras now -  \n Do you want Extra Cheese? [true/false]: ");
            boolean cheese=sc.nextBoolean();
            if(cheese==true){
                System.out.println("Extra Cheese Added");
                cheese1=100;
              
               
                
            }
           
            System.out.println("Do you want Extra Toppings? [true/false]:");
            boolean Toppings=sc.nextBoolean();
            if(Toppings==true){
                System.out.println("Extra Toppings Added");
                Toppings1=100;
            }
            System.out.println("Do you want WaterBottle? [true/false]:");
            boolean bottle=sc.nextBoolean();
            if(bottle==true){
                System.out.println("How many bottles?:");
               
                water=sc.nextInt();
                System.out.println(water+" Water Bottle Added");
                
            }
            System.out.println("Do you want Ketchup? [true/false]:");
            boolean Ketchup=sc.nextBoolean();
            if(Ketchup==true){
                System.out.println("How many Packets?: ");
                int packets=sc.nextInt();
                System.out.println("Ketchup Packets Added");
                packets1=packets;

            }
            System.out.println("Do you want SoftDrinks? [true/false]:");
            boolean SoftDrinks=sc.nextBoolean();
            if(SoftDrinks==true){
                System.out.println("How many Cans?:");
                int drinks=sc.nextInt();
                System.out.println("Soft Drinks Added");
                drinks1=drinks;
            }
            System.out.println("Do you want Take Away? [true/false]:");
            boolean takeaway=sc.nextBoolean();
            if(takeaway==true){
                System.out.println("Take Away Opted");
                takeaway1=1;
            }

            int pizza,bottle1,Ketchup1,SoftDrinks1;
            pizza=600;
            bottle1=water*20;
            Ketchup1= packets1*5;
            SoftDrinks1=drinks1*75;
            takeaway1=20;
            int total=pizza+cheese1+Toppings1+bottle1+Ketchup1+SoftDrinks1+takeaway1;
            int gst=(total*18)/100;
            int total1=total+gst;
            System.out.println("*********** ********** BILL COPY ********** **********");
            System.out.println("Base Pizza Price:                   "+pizza);
            if(cheese1!=0){
            System.out.println("Extra Cheese Charges:               "+cheese1);
            }
            if(Toppings1!=0){
            System.out.println("Extra Toppings Charges:             "+Toppings1);
            }if(bottle1!=0){
            System.out.println("Extra WaterBottle Charges:          "+bottle1);}
            if(Ketchup1!=0){
            System.out.println("Extra Ketchup Charges:              "+Ketchup1);}
            if(SoftDrinks1!=0){
            System.out.println("Extra SoftDrinks Charges:           "+SoftDrinks1);}
            if(takeaway1!=0){
            System.out.println("Extra Bag Charges for take away:    "+takeaway1);}
            System.out.println("*********** ********** ********** ********** **********");
            System.out.println("Bill Amount has come to:            "+total);
            System.out.println("Adding the Tax Amount:              "+gst);
            System.out.println("*********** ********** ********** ********** **********");
            System.out.println("Net Amount Payable:                 "+total1);
            System.out.println("*********** ********** ********** ********** **********");

 }



     else {
    System.out.println("Select: \n a. Vegetarian \n b. Non Vegetarian ");
    System.out.println("Your Choice [a or b]: ");
    int cheese1=0,Toppings1=0;
    int water=0;
    int packets1=0,drinks1=0,takeaway1=0;
    Scanner sc=new Scanner(System.in);
    String chab=sc.next();
    if(chab.equalsIgnoreCase("a")){
        System.out.println("Crunchy onions, crispy capsicum, Crunchy onions, crispy capsicum,  ");
    }
    else{
        System.out.println("The wholesome flavour of tandoori masala with  Chicken tikka I onion I red paprika I mint mayo ");
    }
    System.out.println("Let us select the extras now -  \n Do you want Extra Cheese? [true/false]: ");
    boolean cheese=sc.nextBoolean();
    if(cheese==true){
        System.out.println("Extra Cheese Added");
        cheese1=100;
      
       
        
    }
   
    System.out.println("Do you want Extra Toppings? [true/false]:");
    boolean Toppings=sc.nextBoolean();
    if(Toppings==true){
        System.out.println("Extra Toppings Added");
        Toppings1=100;
    }
    System.out.println("Do you want WaterBottle? [true/false]:");
    boolean bottle=sc.nextBoolean();
    if(bottle==true){
        System.out.println("How many bottles?:");
       
        water=sc.nextInt();
        System.out.println(water+" Water Bottle Added");
        
    }
    System.out.println("Do you want Ketchup? [true/false]:");
    boolean Ketchup=sc.nextBoolean();
    if(Ketchup==true){
        System.out.println("How many Packets?: ");
        int packets=sc.nextInt();
        System.out.println("Ketchup Packets Added");
        packets1=packets;

    }
    System.out.println("Do you want SoftDrinks? [true/false]:");
    boolean SoftDrinks=sc.nextBoolean();
    if(SoftDrinks==true){
        System.out.println("How many Cans?:");
        int drinks=sc.nextInt();
        System.out.println("Soft Drinks Added");
        drinks1=drinks;
    }
    System.out.println("Do you want Take Away? [true/false]:");
    boolean takeaway=sc.nextBoolean();
    if(takeaway==true){
        System.out.println("Take Away Opted");
        takeaway1=1;
    }

    int pizza,bottle1,Ketchup1,SoftDrinks1;
    pizza=400;
    bottle1=water*20;
    Ketchup1= packets1*5;
    SoftDrinks1=drinks1*75;
    takeaway1=takeaway1*20;
    int total=pizza+cheese1+Toppings1+bottle1+Ketchup1+SoftDrinks1+takeaway1;
    int gst=(total*18)/100;
    int total1=total+gst;
    System.out.println("*********** ********** BILL COPY ********** **********");
    System.out.println("Base Pizza Price:                   "+pizza);
    if(cheese1!=0){
    System.out.println("Extra Cheese Charges:               "+cheese1);
    }
    if(Toppings1!=0){
    System.out.println("Extra Toppings Charges:             "+Toppings1);
    }if(bottle1!=0){
    System.out.println("Extra WaterBottle Charges:          "+bottle1);}
    if(Ketchup1!=0){
    System.out.println("Extra Ketchup Charges:              "+Ketchup1);}
    if(SoftDrinks1!=0){
    System.out.println("Extra SoftDrinks Charges:           "+SoftDrinks1);}
    if(takeaway1!=0){
    System.out.println("Extra Bag Charges for take away:    "+takeaway1);}
    System.out.println("*********** ********** ********** ********** **********");
    System.out.println("Bill Amount has come to:            "+total);
    System.out.println("Adding the Tax Amount:              "+gst);
    System.out.println("*********** ********** ********** ********** **********");
    System.out.println("Net Amount Payable:                 "+total1);
    System.out.println("*********** ********** ********** ********** **********");

}




    }


       




}








