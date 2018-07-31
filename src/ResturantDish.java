public class ResturantDish {


    private static int costInCents;
    private static String nameOfDish;
    private static boolean wouldRecommend;

    public String eat(){
       return ("Nom Nom Nom!");
    }

    public void setCostInCents(int amount) {
        costInCents = amount;
    }

    public void setNameOfDish(String name) {
        nameOfDish = name;
    }
    public void setWouldRecommend(boolean recommend) {
        wouldRecommend = recommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }
    public boolean getWouldRecommend() {
        return wouldRecommend;
    }


}
