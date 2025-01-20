
package hoangkhanhha_30207153706;
import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

       
        colors.add("Vang");
        colors.add("Do");
        colors.add("Tim");
        

        
        System.out.println("Danh sach mau ban dau: " + colors);

        
        colors.set(1, "Xanh"); 

        
        System.out.println("Danh sach mau sau khi cap nhat: " + colors);
    }
}
