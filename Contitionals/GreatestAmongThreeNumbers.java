package Contitionals;
import java.util.Scanner;
public class GreatestAmongThreeNumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		/*
		 * if(a>b&&a>c) { System.out.println(a+"is greatest"); } else if(b>c) {
		 * System.out.println(b+"is greatest"); } else {
		 * System.out.println(c+"is greatest"); }
		 */
		System.out.println((a>b?(a>c?a:c):(b>c?b:c)));
	}
}
