package staticClass;

public class BestBuyStore {
    public static void main(String[] args) {
        BestBuy store = new BestBuy();
        BestBuy store2 = new BestBuy();
        System.out.println(store.numOfComputers);
        store.numOfComputers--;

        System.out.println(store2.numOfComputers);
    }
}
