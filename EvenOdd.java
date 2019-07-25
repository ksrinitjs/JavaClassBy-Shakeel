import java.io.BufferedReader;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Value: ");
			int a=sc.nextInt();
			if(a%2==0) {
			System.out.println(a + " :Even Number");
		}
		else {
			System.out.println(a + " :Odd Number");
		}

	}

}
