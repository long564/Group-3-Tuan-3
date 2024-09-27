package b2;

import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem trung binh");
		double dtb = sc.nextDouble();
		if (dtb<4)
			System.out.println("Hoc sinh xep loai kem");
		if (dtb>=4&&dtb<5)
			System.out.println("Hoc sinh xep loai yeu");
		else if (dtb>=5&&dtb<7)
			System.out.println("Hoc sinh xep loai trung binh");
		else if (dtb>=7&&dtb<8)
			System.out.println("Hoc sinh xep loai kha");
		else if (dtb>=8&&dtb<9)
			System.out.println("Hoc sinh xep loai gioi");
		else 
			System.out.println("Hoc sinh xep loai xuat sac");
	}
}
