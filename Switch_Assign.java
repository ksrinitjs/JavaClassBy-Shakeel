import java.util.Scanner;

public class Switch_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Switchexample();
	}
	
	public static void Switchexample() {
		// TODO Auto-generated method stub
		int day;		
		System.out.println("Enter the day of week you want to find:");
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		switch(day) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;		
		case 3: System.out.println("Tuesday");
		break;		
		case 4: System.out.println("Wednesday");
		break;	
		case 5: System.out.println("Thursday");
		break;	
		case 6: System.out.println("Friday");
		break;	
		case 7: System.out.println("Saturday");
		break;	
		default:System.out.println("PLease select between 1-7");
		break;
		
		}
		
		
	}


}