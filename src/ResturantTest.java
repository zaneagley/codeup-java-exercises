public class ResturantTest {





    public static void main(String[] args) {

        ResturantDish d1 = new ResturantDish();
        ResturantDish d2 = new ResturantDish();

//    int costInCents;
//    String nameOfDish;
//    boolean wouldRecommend;

        d1.setCostInCents(300);
        d1.setNameOfDish("Cheesy Burgs");
        d1.setWouldRecommend(true);


        System.out.println(d1.getCostInCents());
        System.out.println(d1.getNameOfDish());
        System.out.println(d1.getWouldRecommend());

        System.out.println(d1.eat());

    }




}
