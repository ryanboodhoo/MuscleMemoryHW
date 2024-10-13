package FruitMarket;

public class Main {
    public static void main(String[] args){
        Apple Apple = new Apple();
        Apple.removeSeeds();

        Orange Orange = new Orange();
        FruitMarket.Orange.peel();

        Fruit orange = new Fruit();

        squeeze(Apple);
        squeeze(Orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}

