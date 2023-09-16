package fruitmarket;

public class Market {
    public static void main(String[] args) {

        Apple grannySmith = new Apple();
        grannySmith.makeJuice();
        grannySmith.harvestSeason();
        popularity(grannySmith);

        Fruit tommyAktins = new Mango();
        tommyAktins.makeJuice();
        ((Mango) tommyAktins).seedType();
        popularity(tommyAktins);

        tommyAktins = new Apple();
        tommyAktins.makeJuice();
        ((Apple) tommyAktins).harvestSeason();
        popularity(tommyAktins);

        Pineapple spongeCrib = new Pineapple();
        spongeCrib.makeJuice();
        spongeCrib.homeOf();
        popularity(spongeCrib);
    }
    public static void popularity(Fruit fruit){
        if (fruit instanceof Apple){
            System.out.println("More popular in the United States");
        }
        else if (fruit instanceof Mango) {
            System.out.println("More popular in the Caribbean");
        }
        else if (fruit instanceof Pineapple) {
            System.out.println("More popular in Miami");
        }
    }
}
