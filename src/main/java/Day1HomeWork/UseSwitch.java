package Day1HomeWork;

import java.util.Scanner;

public class UseSwitch {

	public static void main(String[] args) {
	
		Scanner obj = new Scanner(System.in);
		String status = obj.next();
		//System.out.println(status);
		
		switch(status)
		{
		case "Pass" :
			System.out.println("Pass");
			break;
		case "Fail" :
			System.out.println("Fail");
			break;
		case "Inprogress" :
			System.out.println("Inprogress");
			break;
		case "Blocked" :
			System.out.println("Blocked");
			break;
		default :
			System.out.println("nothing");
			break;
			
			
			
			
		
		}
		

	}

}
