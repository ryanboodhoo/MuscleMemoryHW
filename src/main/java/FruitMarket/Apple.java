package FruitMarket;

public class Apple extends Fruit {

    public Apple(){
        setCalories(100);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds have been removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Fresh Apple juice is made");
    }
}
