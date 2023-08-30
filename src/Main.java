import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu hằng số a : ");
        double a = sc.nextDouble();
        if (a==0) {
            System.out.println("Phương trình không phải là phương trình bậc nhất");
        }
        else  {
            System.out.println("Nhập dữ lệu hằng số b : ");
            double b = sc.nextDouble();
            double x = -b / a ;
            System.out.println("Phương trình " + a + "x + " + b +"=0 có nghiệm là : ");
            System.out.println("x =" +x);
        }



    }
}