import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap 2 so: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Ban muon thuc hien phep tinh nao (+ - * /)?");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':System.out.printf("Tong cua "+a+" va "+b+" la %f",a+b); break;
            case '-':System.out.printf("Hieu cua "+a+" va "+b+" la %f",a-b); break;
            case '*':System.out.printf("Tich cua "+a+" va "+b+" la %f",a*b); break;
            case '/':System.out.printf("Hieu cua "+a+" va "+b+" la %f",a/b); break;
        }
    }
}
