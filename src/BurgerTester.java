public class BurgerTester {


    public static void main(String[] args) {
        BurgerTools doubleCheese = new BurgerTools();

        doubleCheese.mostPopularTopping = "cheese";
        doubleCheese.averageDaysBeforeExpiration = 5;
        doubleCheese.temperatureWhenCooked = 350;

        System.out.println(doubleCheese.grill());

    }

}
