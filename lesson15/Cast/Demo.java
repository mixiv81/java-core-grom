package lesson15.Cast;

public class Demo {
    public static void main(String[] args) {
        InternetProvider provider = (InternetProvider) test();
        FoodProvider foodProvider = (FoodProvider) testFood();

        System.out.println(provider);
    }

    private static Provider test() {
        return new InternetProvider();
    }

    private static Provider testFood() {
        return new InternetProvider();
    }
}
