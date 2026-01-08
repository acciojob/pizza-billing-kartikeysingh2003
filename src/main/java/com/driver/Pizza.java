package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;
    private boolean billGenerated = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill = "";
        if(isVeg){
            price = 300;
        } else {
            price = 400;
        }
        bill += "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            extraCheeseAdded=true;
            price+=80;
            bill+="Extra Cheese Price: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            } else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeawayAdded){
            price += 20;
            bill += "Paperbag Added: 20\n";
            takeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGenerated){
            bill += "Total Price: " + price + "\n";
            billGenerated = true;
        }
        return bill;
    }
}
