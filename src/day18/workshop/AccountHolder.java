package day18.workshop;

public class AccountHolder {

	/**
	 * Main method for manipulation of Banking application
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String[] args) {

		/**
		 * first monthly annual interest value is 4%
		 */
		SavingAccount.modifyAnnualInterestRate(4);
		System.out.println("New Annual Interest Rate is : " + SavingAccount.annualInterestRate);

		/*
		 * creating object saver1 for the SavingAccount class with the balances of 2000
		 */
		SavingAccount saver1 = new SavingAccount(2000);
		System.out.println("Account Balance for Saver1 is " + saver1.getSavingBalance());

		/**
		 * calling the method calculateMonthlyInterest for saver1 object for the initial
		 * 4% interest value
		 */
		saver1.calculateMonthlyInterest();
		System.out.println("Account Balance of Saver1 after Interest : " + saver1.getSavingBalance());

		/**
		 * creating object saver2 for the SavingAccount class with the balance of 3000
		 */
		SavingAccount saver2 = new SavingAccount(3000);
		System.out.println("Account Balance for Saver 2 is " + saver2.getSavingBalance());

		/**
		 * calling the method calculateMonthlyInterest for saver2 object for the initial
		 * value is 4% only
		 */
		saver2.calculateMonthlyInterest();
		System.out.println("Account Balance of Saver2 after Interest : " + saver2.getSavingBalance());

		/**
		 * for the second month annual interest rate is 5%
		 */
		SavingAccount.modifyAnnualInterestRate(5);
		System.out.println("New Annual Interest Rate is : " + SavingAccount.annualInterestRate);

		/**
		 * calling the method calculateMonthlyInterest for saver1 object for the second
		 * month 5% interest value
		 */
		saver1.calculateMonthlyInterest();
		System.out.println("Account Balance saver1 after Interest : " + saver1.getSavingBalance());

		/**
		 * calling the method calculateMonthlyInterest for saver2 object for the second
		 * month 5% interest value
		 */
		saver2.calculateMonthlyInterest();
		System.out.println("Account Balance saver2 after Interest : " + saver2.getSavingBalance());

	}

}
