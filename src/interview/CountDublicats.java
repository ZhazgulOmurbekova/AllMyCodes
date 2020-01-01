package interview;

public class CountDublicats {


    public static String[] ITEMS = {"Cactus", "T Shirt", "air", "Terracotta Necklace", "Coffee Mug", "Wood Crate Wall Storage", "Blanket", "Knife", "Copper Coffee and Tea Kettle", "Wall Art",
            "Marble Clock", "Natural Bench", "Llama Valley Framed Print", "Gold Metal Frame Mirror", "Fork", "Star Wars game", "Barracuda", "Anchor", "Sunlight", "planet Saturn"};
    //corresponding prices
    public static double[] PRICES = {49.99, 13.99, 5.99, 14.99, 29.99, 11.50, 79.99, 23.80, 27.99, 39.44, 78.40, 299.30, 55.00, 176.89, 4.99, 67.00, 8.19, 50.00, 1500, 400};
    public String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
    public double SHIPPING_CHARGE = 11.50;

    public static void main(String[] args) {

    }


    public int getNumberOfDuplicateItems(String[] order) {
        //TODO



        String word = "";
        String temp = "";
        int tottal = 0;
        for (int i = 0; i < order.length; i++) {
            if(!temp.contains(order[i])) {
                temp += order[i];

                int count = 0;
                for (int j = 0; j < order.length; j++) {
                    if (order[i].equals(order[j])) {
                        count++;
                    }
                    if (count >= 2) {
                        word += order[i] + " ";
                        tottal++;
                        return count;
                    }
                }
            }
        }

        return tottal;
    }
    /**
     * Calculate discount 2
     * For members: When purchased 3 special items  -> get 2 extra special items for free
     * For non-members: When purchased 3 special items -> get 1 special extra item for free
     *
     * Special items are listed in a SPECIAL_ITEMS array
     *
     * For example, if order has the following items and member is true:
     * 			      	"dog", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "coffee mug"}
     * if order has the following items and member is true:
     * 			      	"dog", "cactus", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "cactus", "coffee mug", "cactus", "cactus"}
     * if order has the following items and member is false:
     * 			      	"dog", "cactus", "cactus", "cactus", "cactus", "coffee mug" -> return {"dog", "cactus", "cactus", "cactus", "cactus", "coffee mug", "cactus"}
     *
     * When no special items in the order, then order will be returned without change
     * 					"dog", "transmission", "barracuda", "coffee mug", "Star Wars game"
     *
     * @param// List of items in the order, member
     * @return new array that will have original items in the order and free items added at the end of the order
     */
    public String[] buyThreeDiscount(String[] order, boolean isMember) {
        //TODO


       if (isMember){

       }

        return null;
    }
}
