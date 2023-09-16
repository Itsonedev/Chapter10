package fruitmarket;

public class Apple extends Fruit {
    @Override
    public void makeJuice(){
        System.out.println("Makes Apple Juice");
    }
    public void harvestSeason(){
        System.out.println("Is harvested between late Summer and early fall");
    }
}
