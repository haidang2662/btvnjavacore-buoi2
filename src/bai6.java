import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh huyền : ");
        float a = sc.nextFloat();
        System.out.println("nhập chiều dài cạnh góc vuông");
        float b = sc.nextFloat();
        System.out.println("nhập chiều dài cạnh góc vuông");
        float c = sc.nextFloat();
        if(a*a!=b*b+c*c) {
            System.out.println("Chiều dài 3 cạnh trên không phải là chiều dài 3 cạnh của tam giác vuông");
        }
        else {
            double sinb = b/a ;
            System.out.println("giá trị sin của góc B là ");
            double d = sinb*100;
            double e = Math.ceil(d);
            double f = e/100;
            System.out.println("sinb = " + f );
            double cosb = c/a ;
            System.out.println("giá trị cos của góc B là ");
            double d1 = cosb*100;
            double e1 = Math.ceil(d1);
            double f1 = e1/100;

            System.out.println("cosb = " + f1 );
        }

    }
}
