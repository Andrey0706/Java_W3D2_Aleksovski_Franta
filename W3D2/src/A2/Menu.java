package A2;

public abstract class Menu {
    private String mainDish;
    private String soup;
    private String dessert;

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public Menu(String mainDish, String soup, String dessert) {
        this.mainDish = mainDish;
        this.soup = soup;
        this.dessert = dessert;
    }
    public abstract String getSoupOfTheDay();

    public String printMenu(){
        return
                "mainDish='" + mainDish + '\'' +
                ", soup='" + soup + '\'' +
                ", dessert='" + dessert + '\''
                ;
    }

}
