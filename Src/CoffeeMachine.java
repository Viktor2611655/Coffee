public class CoffeeMachine {
    public static void main(String[] args){
        DrinkCounter drinkcounter = new DrinkCounter();
        double price = 0.0;

        makeDrink(DrinksMachine.КАВА, drinkcounter);
        makeDrink(DrinksMachine.КОКА_КОЛА, drinkcounter);
        makeDrink(DrinksMachine.МОХІТО, drinkcounter);

        System.out.println("Загаль кількість напоїв: " + drinkcounter.getTotalDrinks());
        System.out.println("Загальна сума: " + drinkcounter.getTotalPrice());
    }

    public static void makeDrink(DrinksMachine drinkType, DrinkCounter drinkCounter){
        switch (drinkType){
            case КАВА:
                DrinkMake.makeCoffee();
                drinkCounter.addDrink(Drinks.КАВА_PRICE);
                break;
            case ЧАЙ:
                DrinkMake.makeTea();
                drinkCounter.addDrink(Drinks.ЧАЙ_PRICE);
                break;
            case ЛИМОНАД:
                DrinkMake.makeLemonade();
                drinkCounter.addDrink(Drinks.ЛИМОНАД_PRICE);
                break;
            case МОХІТО:
                DrinkMake.makeMojito();
                drinkCounter.addDrink(Drinks.МОХІТО_PRICE);
                break;
            case МІНЕРАЛКА:
                DrinkMake.makeMineral();
                drinkCounter.addDrink(Drinks.МІНЕРАЛКА_PRICE);
                break;
            case КОКА_КОЛА:
                DrinkMake.makeCocaCola();
                drinkCounter.addDrink(Drinks.КОКА_КОЛА_PRICE);
                break;
            default:
                System.out.println("Невідомий напий. ");
        }
    }
}
