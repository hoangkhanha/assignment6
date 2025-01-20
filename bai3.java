
package hoangkhanhha_30207153706;

import java.util.ArrayList;
public class bai3 {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        
        prices.add(10.05);
        prices.add(11.40);
        prices.add(21.44);
        prices.add(11.30);
        prices.add(90.11);

        
        System.out.println("Danh sach gia san pham:");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Gia san pham " + (i + 1) + ": " + prices.get(i));
        }
    }
}
