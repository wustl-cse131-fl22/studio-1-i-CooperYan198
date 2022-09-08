package studio1;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for year?");
		int y = in.nextInt();
		boolean leapYear=(y%4==0)&&(y%100!=0||y%400==0);
		System.out.println(leapYear);
	}

}
