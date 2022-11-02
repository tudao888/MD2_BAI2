import java.util.Scanner;

public class timUCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int uocChungMax = 0;
        if (a == 0 || b == 0) {
            System.out.println(a + "va" + b + "khong co UCLN");
        }
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        System.out.println("UCLN la " + a);
    }
//            for (int i = 1; i < a || i < b; i++) {
//                if (a % i == 0 && b % i == 0) {
//                    uocChungMax = i;
//                }
//            }
//            System.out.println("uoc chung lon nhat cua a va b la : " + uocChungMax);
//        }
//    }
}
