public class Money implements Comparable<Money>{

    private int price;

    public Money(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Money o) {
        return Long.compare(this.price, o.price);
    }

}
