public class Main {

    public static void main(String[] args) {
        Money money1 = new Money(200);
        Money money2 = new Money(100);

        System.out.println(money2.compareTo(money1));
    }
}
