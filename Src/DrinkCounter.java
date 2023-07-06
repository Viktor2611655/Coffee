public class DrinkCounter {
    private int totalDrinks;
    private double totalPrice;

    public DrinkCounter(){
        totalDrinks = 0;
        totalPrice = 0.0;
    }
    public void addDrink(double price){
        totalDrinks++;
        totalPrice += price;
    }
    public int getTotalDrinks(){
        return totalDrinks;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
}
