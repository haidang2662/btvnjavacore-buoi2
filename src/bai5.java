import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String a1 = "Javajava";
        System.out.println(a1.indexOf("a"));
        System.out.println(a1.lastIndexOf("a"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp xâu chính s : ");
        String s = sc.nextLine();
        System.out.println("Nhâp xâu cần tìm s1 : ");
        String s1 = sc.nextLine();
        System.out.println("Nhập xâu thay thế s2 : ");
        String s2 = sc.nextLine();
        String s4 = s.replace(s1, s2);
        System.out.println(s4);


    }


    }

