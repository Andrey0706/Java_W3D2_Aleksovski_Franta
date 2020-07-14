package A2;

public class WeekdayMenu extends Menu {

    public WeekdayMenu(String mainDish, String soup, String dessert) {
        super(mainDish, soup, dessert);
    }

public String getSoupOfTheDay(){
        return super.getSoup();
}
}
