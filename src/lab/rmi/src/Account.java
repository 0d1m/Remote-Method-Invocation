package lab.rmi.src;

import java.util.Date;

public class Account {
	int code;
	double balance;
	Date creationDate;
	
	public Account(int code, double balance, Date creationDate) {
		this.code =code;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
