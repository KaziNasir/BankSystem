
public class CurrentAccount extends Account {
	

	
public CurrentAccount() {
		
	}

public CurrentAccount(int accountNo, String ownerName, double balance) {
		super(accountNo, ownerName, balance);
		
	}

public void withdraw(double amount) {
		if(balance-amount>=0) {
			balance-=amount; System.out.println("$ "+amount+" has been withdrawn from current account No. "+accountNo);
		}
		else {System.out.println("Your current account cannot have less than $0");}
	}

public void transfer(double amount) {
	if(balance-amount>=0) {
		balance-=amount; System.out.println("$ "+amount+" has been transfered from current account No. "+accountNo);
	}
	else {System.out.println("Your current account cannot have less than $0");}
}


	@Override
public String toString() {
	return "CurrentAccount [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
}

	public static void main(String[] args) {
		

	}

}
