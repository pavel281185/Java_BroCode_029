public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzarella");
        Pizza pizza3 = new Pizza("thicc crust", "tomato");
        Pizza pizza4 = new Pizza("thicc crust");

        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
    }
}