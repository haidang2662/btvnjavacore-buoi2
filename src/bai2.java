import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu hằng số a , điều kiện a khác 0 : ");
        double a = sc.nextDouble();
        System.out.println("Nhập dữ liệu hằng số b : ");
        double b = sc.nextDouble();
        System.out.println("Nhập dữ liệu hằng số c : ");
        double c = sc.nextDouble();
        double d = b*b-4*a*c;
        double e = Math.sqrt(d);

        if (d<0) {
            System.out.println(" Phương trình " + a + "x^2 + " + b + " x + " + c + " vô nghiệm ");
        }
        if (d==0) {
            double x = -b/2*a;
            System.out.println("Phương trình " + a + "x^2 + " + b + " x + " + c + " có 1 nghiệm ");
            System.out.println("x=" +x);
        }
        else {
            double x1 = (-b+e)/2*a;
            double x2 = (-b-e)/2*a;
            System.out.println("Phương trình " + a + "x^2 + " + b + " x + " + c + " có 2 nghiệm ");
            System.out.println("x1=" +x1);
            System.out.println("x2=" +x2);
        }

    }
}
