package sinh.dev;

import java.util.Scanner;
public class tinhtong {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhap vao n so nguyen");
		int n = scanner.nextInt();
		int i = 0;
		int sum = 0;
		for (i = 0; i<=n;i++) {
		 sum = sum +i;
	}
	System.out.println("Tong n so la :"+sum);

}
}