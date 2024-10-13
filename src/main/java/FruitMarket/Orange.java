package FruitMarket;

public class Orange extends Fruit {

    public Orange(){
        setCalories(105);
    }

    public void peel(){
        System.out.println("Orange has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }
}