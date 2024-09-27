import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap lan luot do dai 3 canh a b c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a+b>c && b+c>a && a+c>b)
            if (a==b&&b==c)
                    System.out.println("3 canh tren tao thanh 1 tam giac deu");
            else 
            {
                if (a==b&&b!=c||b==c&&c!=a||a==c&&c!=b)
                    if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
                        System.out.println("3 canh tren tao thanh 1 tam giac vuong can");
                    else
                    System.out.println("3 canh tren tao thanh 1 tam giac can");
                else 
                    if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
                        System.out.println("3 canh tren tao thanh 1 tam giac vuong");
                    else
                    System.out.println("3 canh tren tao thanh 1 tam giac thuong");
                
            }
        else
        System.out.println("3 canh tren khong the tao thanh 1 tam giac");
    }
}