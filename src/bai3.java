import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu chiều rộng hình chữ nhật b :");
        float b = sc.nextFloat();
        if (b<=0) {
            System.out.println("Chiều rộng hình chữ nhật phải có giá trị > 0 ");
        }
        else {
        System.out.println("Nhập dữ liệu chiều dài hình chữ nhật a  : ");
        float a = sc.nextFloat();
        if (a<=b) {
            System.out.println("chiều rộng hcn phải bé hơn chiều dài hình chữ nhật ");
        }
        else {
            float c = (a+b)*2;

        System.out.println("Chu vi của hình chữ nhật là : "  );

        System.out.println("c=" +c);

        float s = a*b;

        System.out.println("Diện tích của hình chữ nhật là : ");

        System.out.println("s=" +s );
        }
        }

    }
}
