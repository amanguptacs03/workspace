package com.psl.client;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BankAccount implements Comparable<BankAccount> {
	String accountNo;
	double amount;
	
	private String fullName;
	

	public BankAccount() {
		super();
	}



	public BankAccount( String fullName,String accountNo, double amount) {
		
		this(accountNo,amount);
		this.fullName = fullName;
	}



	public BankAccount(String accountNo, double amount) {
		super();
		this.accountNo = accountNo;
		this.amount = amount;
	}

	
	


	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountNo == null) ? 0 : accountNo.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return String.format("BankAccount [FullName=%s,AccountNo=%s,Salary=%f]",getFullName(), getAccountNo(),getAmount());
	}







	@Override
	public int compareTo(BankAccount anotherAccount) {
		if(getAmount() >anotherAccount.getAmount())
		return 1;
		else if(getAmount() <anotherAccount.getAmount())
			return -1;
		return getFullName().compareTo(anotherAccount.getFullName());
	//	return (int) (anotherAccount.getAmount()-getAmount());
	}
	
	
}
