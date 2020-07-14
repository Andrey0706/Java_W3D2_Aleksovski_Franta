package A2;

public class WeekendMenu extends Menu {
    private String appetizer;

    public WeekendMenu(String mainDish, String soup, String dessert, String appetizer) {
        super(mainDish, soup, dessert);
        this.appetizer = appetizer;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getSoupOfTheDay(){
        return super.getSoup();
    }

    @Override
    public String printMenu() {
        return
                "mainDish='" + super.getMainDish() + '\'' +
                ", soup='" + super.getSoup() + '\'' +
                ", dessert='" + super.getDessert() + '\'' +
                ", appetizer='" + this.getAppetizer() + '\''
                ;
    }
}
