

import java.util.Scanner;
public class Check {	
	
	public static void main(String[] args) {
		String resposes="null";		
		System.out.println("Would you like to continue");		
		while(resposes.equalsIgnoreCase("y") ||( !(resposes.equalsIgnoreCase("n")))){					
			Scanner scan =new Scanner(System.in);
			resposes=scan.nextLine();
			if(resposes.equalsIgnoreCase("y")){
				System.out.println("Would you like to continue");	
			}
			
			else
			{				
				System.out.println("Invalid Input");
				System.out.println("Would you like to continue");
				
			}
		}
		

	}

}
