package edu2;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount a = new SavingsAccount();
		a.name="Alex";
		a.balance=1000;
		a.withdraw(70);
		a.display();
	}

}
