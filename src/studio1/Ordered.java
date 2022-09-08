package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		System.out.println("Value for z?");
		int z = in.nextInt();
		Boolean isOrdered= false;
		isOrdered=(x<y &&y<z)||(x>y &&y>z);
		System.out.println(isOrdered);

	}

}
