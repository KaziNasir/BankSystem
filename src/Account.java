
public abstract class Account {
	protected int accountNo;
	protected String ownerName;
	protected double balance;
	
public Account(){  }

public Account(int accountNo, String ownerName, double balance) {
	this.accountNo = accountNo;
	this.ownerName = ownerName;
	this.balance = balance;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public int getAccountNo() {
	return accountNo;
}

public double getBalance() {
	return balance;
}

public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public abstract void withdraw(double amount);

public abstract void transfer(double amount);

public void deposit(double amount) {
	if(amount>0) {
		balance+=amount; System.out.println("$"+amount+" has been deposited to account No. "+accountNo);
	}
}



	public static void main(String[] args) {
		

	}

}
