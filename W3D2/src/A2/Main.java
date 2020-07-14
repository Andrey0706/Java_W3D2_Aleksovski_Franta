package A2;

public class Main {
    public static void main(String[] args) {

        Menu monday = new WeekdayMenu("Tomato quiche", "Tomato soup", "Strawberry icecream");
        Menu tuesday = new WeekdayMenu("Pizza", "French soup", "olives with sugar");
        Menu wednesday = new WeekdayMenu("Grilled Potatoes", "potato soup", "french fries");
        Menu thursday = new WeekdayMenu("Lasagne", "pea soup", "chockolate cake");
        Menu friday = new WeekdayMenu("Gulash", "Peach soup", "coconut pudding");
        Menu saturday = new WeekendMenu("Mushroom rizotto", "vegetable mash" , "tiramisu", "Uzo");
        Menu sunday = new WeekendMenu("Spagetti", "garlic soup", "honney cake", "pistachios");

        System.out.println(monday.getSoupOfTheDay());
        System.out.println("This week you will enjoy");
        System.out.println("Monday: " + monday.printMenu());
        System.out.println("Tuesday: " + tuesday.printMenu());
        System.out.println("Wednesday: " + wednesday.printMenu());
        System.out.println("Thursday: " + thursday.printMenu());
        System.out.println("Friday: " + friday.printMenu());
        System.out.println("Saturday: " + saturday.printMenu());
        System.out.println("Sunday: " + sunday.printMenu());

    }


}
