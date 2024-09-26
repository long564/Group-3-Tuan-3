import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap mot so nguyen: ");
    int x= sc.nextInt();
    if (x>0) 
        System.out.println("so "+x+" la so nguyen duong");
    else if (x<0) {
        System.out.println("so "+x+" la so nguyen am");
    }
    else
        System.out.println("So vua nhap la so 0");

}