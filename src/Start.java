import java.util.*;
import java.lang.NullPointerException;
public class Start {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Bank b1=new Bank();
		
		System.out.println("Welcome to Bank Application");
		boolean repeat = true;
		
		do {
			try {
			System.out.println("Choose an option: ");
			System.out.println("	1. Add new Current Account");
			System.out.println("	2. Add new Saving Acount");
			System.out.println("	3. Add interest to saving account");
			System.out.println("	4. Change interest rate of Saving Account");
			System.out.println("	5. Transfer Balance");
			System.out.println("	6. Show number of active Accounts");
			System.out.println("	7. Search by Account Number");
			System.out.println("	8. Deposit money to Account Number");
			System.out.println("	9. Withdraw money from Account Number");
			System.out.println("	10. Exit ");
			
			System.out.print("Your option : ");
			System.out.println();
			int option1 = scan.nextInt();scan.nextLine();
			switch(option1) {
			
			case 1:
				System.out.println();
				b1.addCurrentAccount();
				System.out.println();
				break;
				
			case 2:
				System.out.println();
				b1.addSavingsAccount();
				System.out.println();
				break;
				
			case 3:
				System.out.println();
				b1.addInterest();
				System.out.println();
				System.out.println("	Would you like to update your balance? ");
				System.out.println("		1. Yes, Withdraw money");
				System.out.println("		2. Yes, Deposit money");
				System.out.println("		3. Yes, Transfer money");
				System.out.println("		4. No");
				
				System.out.print("	Your option : ");
				System.out.println();
				int option2 = scan.nextInt();scan.nextLine();
				switch(option2) {
				
				case 1:
					System.out.println("Enter the account mumber you want to Withdraw from");
					int WacNo= scan.nextInt();scan.nextLine();
					System.out.println("Enter the Amount of money  you want to Withdraw");
					Double amountW= scan.nextDouble();scan.nextLine();
					b1.withdraw(WacNo,amountW);
					System.out.println();
					break;
					
				case 2:
					System.out.println("Enter the account mumber you want to Deposit in");
					int DacNo= scan.nextInt();scan.nextLine();
					System.out.println("Enter the Amount of money  you want to Deposit");
					Double amountD= scan.nextDouble();scan.nextLine();
					b1.deposit(DacNo,amountD);
					System.out.println();
					break;
					
				case 3:
					System.out.println("	Transfer form: ");
					System.out.println("	Choose an option: ");
					System.out.println("		1. Saving account to Saving account");
					System.out.println("		2. Saving account to Current account");
					System.out.println("		3. Current account to Current account");
					System.out.println("		4. Current account to Saving account");
					int option3 = scan.nextInt();scan.nextLine();
					System.out.println();
					b1.transferBalance(option3);
					System.out.println();
					break;
					
				case 4:
					
					break;
					
				default:
		            System.out.println("Invalid Input");
		            break;
					
				}
				break;
				
			case 4:
				System.out.println();
				b1.changeInterestRate();
				System.out.println();
				break;
				
			case 5:
				System.out.println("	Transfer form: ");
				System.out.println("	Choose an option: ");
				System.out.println("		1. Saving account to Saving account");
				System.out.println("		2. Saving account to Current account");
				System.out.println("		3. Current account to Current account");
				System.out.println("		4. Current account to Saving account");
				int option3 = scan.nextInt();scan.nextLine();
				System.out.println();
				b1.transferBalance(option3);
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				b1.showActiveAccounts();
				System.out.println();
				break;
				
			case 7:
				System.out.println("	Enter Account number: ");
				int acNo = scan.nextInt();
				System.out.println();
				b1.seacrhAccountNo(acNo);
				System.out.println();
				break;
			
			case 8:
				System.out.println("Enter the account mumber you want to Deposit in");
				int DacNo= scan.nextInt();scan.nextLine();
				System.out.println("Enter the Amount of money  you want to Deposit");
				Double amountD= scan.nextDouble();scan.nextLine();
				b1.deposit(DacNo,amountD);
				System.out.println();
				break;
				
			case 9:
				System.out.println("Enter the account mumber you want to Withdraw from");
				int WacNo= scan.nextInt();scan.nextLine();
				System.out.println("Enter the Amount of money  you want to Withdraw");
				Double amountW= scan.nextDouble();scan.nextLine();
				b1.withdraw(WacNo,amountW);
				System.out.println();
				break;
				
			case 10: 
				repeat=false;
				break;
				
			default:
	            System.out.println("Invalid Input");
	            break;
	            
			}
			}catch (InputMismatchException e) {
                System.out.println("Wrong Input Please Pay Attention Here");
                scan.next();
	
		}
		}
		while(repeat==true);
	}

}
