import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn r : ");
        double r = sc.nextDouble();
        double a = Math.PI;
        double c = 2*r*a;
        System.out.println("Chu vi hình tròn là c : ");
        double d = c*1000;
        double e = Math.ceil(d);
        double f = e/1000;
        System.out.println("c = " +f);
        double s = r*r*a;
        System.out.println("Diện tích hình tròn là S : ");
        double d1 = s*1000;
        double e1 = Math.ceil(d1);
        double f1 = e1/1000;
        System.out.println("S = "+f1);





    }
}
