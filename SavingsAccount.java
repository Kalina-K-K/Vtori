package edu2;

public class SavingsAccount {
	double balance;
	double interestRate=0.01;
	String name;
	
	void withdraw(double sum) {
		if(balance<sum) {
			System.out.println("Error");
		}else if(sum<0) {
			System.out.println("Error");
		}else {
			balance = balance-sum;
		}
	}
	
	void display() {
		System.out.println("Customer: " + name);
		System.out.println("Balance: " + balance);
	}
}
