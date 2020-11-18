package edu2;

public class AccountTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account14 acc = new Account14(1122, 20_000);
		Account14.setYearInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println(acc.getBalance());
		System.out.println(Account14.getMonthlyInterestRate());
		System.out.println(acc.getDate());
	}

}
