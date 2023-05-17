import java.util.*;
import java.lang.*;
public class Bank implements BankOperations {
	SavingsAccount savingAccounts[]= new SavingsAccount[100];
	CurrentAccount currentAccounts[]= new CurrentAccount[100];
	Scanner scan= new Scanner(System.in);
	
public void addInterest() {
	int flag=0;
	try {
	System.out.println("Enter Account Number");
	int acNo1= scan.nextInt();scan.nextLine();
	
	for(int i =0;i<savingAccounts.length;i++) {
		if(savingAccounts[i].getAccountNo()==acNo1) {
			savingAccounts[i].setBalance(savingAccounts[i].getBalance()+(savingAccounts[i].getBalance()*savingAccounts[i].getInterestRate()));
			System.out.println("Interest has been added to account "+savingAccounts[i].getAccountNo());
			++flag;
		}
	}
	}
	catch (NullPointerException a) {
	if(flag==0) {
		System.out.println("Account not found");
	}
	}
	
	}

public void changeInterestRate() {
		int flag=0;
		System.out.println("Enter Account Number");
		int acNo3= scan.nextInt();scan.nextLine();
		System.out.println("Enter new Interest rate ");
		double intRate= scan.nextDouble();scan.nextLine();
		try {
		for(int i =0;i<savingAccounts.length;i++) {
			if(savingAccounts[i].getAccountNo()==acNo3) {
				savingAccounts[i].setInterestRate(intRate);
				System.out.println("Interest rate of Account "+savingAccounts[i].getAccountNo()+" has been changed to "+savingAccounts[i].getInterestRate());
				++flag;
			}
		}
		}
		catch (NullPointerException a) {
		if(flag==0) {
			System.out.println("Account not found");
		}
		}
	}

public void transferBalance(int choice) {
	int flag=0;
	System.out.println("Enter the number of the Account from which the money wll be transfered");
	int acNoF= scan.nextInt();
	System.out.println("Enter the number of the Account to which the money wll be transfered");
	int acNo2= scan.nextInt();scan.nextLine();
	System.out.println("Enter the Amount of money  which wll be transfered");
	Double amount= scan.nextDouble();scan.nextLine();
	try {
	switch(choice) {
	case 1://Saving to saving
		for(int i=0;i<savingAccounts.length;i++) {
			for(int j=0;i<savingAccounts.length;j++) {
				if(savingAccounts[i].getAccountNo()==acNoF && savingAccounts[j].getAccountNo()==acNo2) {
					savingAccounts[i].transfer(amount);
					savingAccounts[j].deposit(amount); ++flag;
				}
			}
		}
		break;
	case 2://saving to current
		for(int i=0;i<savingAccounts.length;i++) {
			for(int j=0;i<currentAccounts.length;j++) {
				if(savingAccounts[i].getAccountNo()==acNoF && currentAccounts[j].getAccountNo()==acNo2) {
					savingAccounts[i].transfer(amount);
					currentAccounts[j].deposit(amount);++flag;
				}
			}
		}
		break;
	case 3://current to current
		for(int i=0;i<currentAccounts.length;i++) {
			for(int j=0;i<currentAccounts.length;j++) {
				if(currentAccounts[i].getAccountNo()==acNoF && currentAccounts[j].getAccountNo()==acNo2) {
					currentAccounts[i].transfer(amount);
					currentAccounts[j].deposit(amount);++flag;
				}
			}
		}
		break;
	case 4://current to saving
		for(int i=0;i<currentAccounts.length;i++) {
			for(int j=0;i<savingAccounts.length;j++) {
				if(currentAccounts[i].getAccountNo()==acNoF && savingAccounts[j].getAccountNo()==acNo2) {
					currentAccounts[i].transfer(amount);
					savingAccounts[j].deposit(amount);++flag;
				}
			}
		}
		break;
		
	}
	}
	catch (NullPointerException a) {
	if(flag==0) {
		System.out.println("Transfer failed. Please recheck Account Numbers");
	}
	}
}

public void addSavingsAccount() {

		int flag=0;int tmp=0;
		System.out.println("Enter Account Number");
		int SacNo= scan.nextInt();scan.nextLine();
		System.out.println("Enter Account Holder Name");
		String SacName= scan.nextLine();
		System.out.println("Enter starting balance");
		double Sbal= scan.nextDouble();
		System.out.println("Enter Interest rate ");
		double intRate= scan.nextDouble();scan.nextLine();
		
		for(int i=0;i<savingAccounts.length;i++)	
		{
			if(savingAccounts[i]== null)
			{
				savingAccounts[i]= new SavingsAccount(SacNo, SacName, Sbal, intRate);
			tmp=i;
			flag=1;
			break;
			}
			
		}
		if(flag==1)
		{
			System.out.println("Savings account has been created");

			System.out.println("*************************************************");
			System.out.println(savingAccounts[tmp].toString());
			System.out.println("*************************************************");
		}
		else
		{
			System.out.println("Savings account can not be created.");
		}

		
	}

public void addCurrentAccount() {
	int flag=0; int tmp=0;
	System.out.println("Enter Account Number");
	int CacNo= scan.nextInt();scan.nextLine();
	System.out.println("Enter Account Holder Name");
	String CacName= scan.nextLine();
	System.out.println("Enter starting balance");
	double Cbal= scan.nextDouble();scan.nextLine();
	
	for(int i=0;i<currentAccounts.length;i++)	
	{
		if(currentAccounts[i]== null)
		{
			currentAccounts[i]= new CurrentAccount(CacNo, CacName, Cbal);
		tmp=i;
		flag=1;
		break;
		}
		
	}
	if(flag==1)
	{
		System.out.println("Savings account has been created");
		System.out.println("*************************************************");
		System.out.println(currentAccounts[tmp].toString());
		System.out.println("*************************************************");
	}
	else
	{
		System.out.println("Savings account can not be created.");
	}
	
		
	}

public void showActiveAccounts() {
		int AcNum1 = 0,AcNum2 = 0;
		for(int i=0; currentAccounts[i]!=null;i++) {
			++AcNum1;
		}
		System.out.println("There are "+AcNum1+" accounts active");
		
		for(int i=0; savingAccounts[i]!=null;i++) {
			++AcNum2;
		}
		System.out.println("There are "+AcNum2+" savings accounts active");
		
		System.out.println("There are a total of "+(AcNum1+AcNum2)+" accounts active");
		
	}
	
public void seacrhAccountNo(int acNo) {
		int flag=0;
		try {
		for(int i=0; i<savingAccounts.length;i++) {
			if(savingAccounts[i].accountNo==acNo) {
				System.out.println("Savings account found");
				System.out.println("*************************************************");
				System.out.println(savingAccounts[i].toString());
				System.out.println("*************************************************");
				flag=1;
			}
		}
			
		}
		
		catch (NullPointerException a) {
		 try {
			for(int i=0; i<currentAccounts.length;i++) {
				if(currentAccounts[i].accountNo==acNo) {
					System.out.println("Current account found");
					System.out.println("*************************************************");
					System.out.println(currentAccounts[i].toString());
					System.out.println("*************************************************");
					flag=1;
				}
			}
		}
		 catch (NullPointerException b) {
			 if(flag==0) {
					System.out.println("No account found");
				}
		 }
	}
}

public void deposit(int acNo,double amount) {
	int flag=0;
	try {
	for(int i=0; i<savingAccounts.length;i++) {
		if(savingAccounts[i].accountNo==acNo) {
			savingAccounts[i].deposit(amount);
			flag=1;
		}
	}
		
	}
	
	catch (NullPointerException a) {
	 try {
		for(int i=0; i<currentAccounts.length;i++) {
			if(currentAccounts[i].accountNo==acNo) {
				currentAccounts[i].deposit(amount);
				flag=1;
			}
		}
	}
	 catch (NullPointerException b) {
		 if(flag==0) {
				System.out.println("No account found");
			}
	 }
}
	
}


public void withdraw(int acNo,double amount) {
	int flag=0;
	try {
	for(int i=0; i<savingAccounts.length;i++) {
		if(savingAccounts[i].accountNo==acNo) {
			savingAccounts[i].withdraw(amount);
			flag=1;
		}
	}
		
	}
	
	catch (NullPointerException a) {
	 try {
		for(int i=0; i<currentAccounts.length;i++) {
			if(currentAccounts[i].accountNo==acNo) {
				currentAccounts[i].withdraw(amount);
				flag=1;
			}
		}
	}
	 catch (NullPointerException b) {
		 if(flag==0) {
				System.out.println("No account found");
			}
	 }
}
}


	public static void main(String[] args) {
		

	}

}
