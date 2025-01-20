
package hoangkhanhha_30207153706;

import java.util.ArrayList;
public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);  
        }

        
        System.out.println("Cac phan tu trong ArrayList la: ");
        for (int number : numbers) {
            System.out.print(number + " ");  
        }
    }
    
}
