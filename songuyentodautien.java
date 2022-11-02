import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
// in ra 20 so nguyen to dau tien;
public class songuyentodautien {
    public static void main(String[] args) {
        int dem = 0;
        for (int i = 2; ; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2 && dem < 20) {
                System.out.println(i + " , ");
                dem++;
            }
        }
    }
}
