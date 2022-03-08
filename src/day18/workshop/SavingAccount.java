package day18.workshop;

public class SavingAccount {

	/**
	 * using static variable AnnualInterestrate to store the annual interest rate
	 * for all the account holders and each object of the class contains private
	 * instance variable savingBalance representing the amount the saver currently
	 * has on deposit
	 */

	static float annualInterestRate;
	private float savingBalance;

	/**
	 * creating constructor of SavingAccount class having the same name as the class
	 * without return type
	 * 
	 * @param savingBalance -store the balance amount
	 */
	public SavingAccount(float savingBalance) {
		this.savingBalance = savingBalance;
	}

	/**
	 * creating method calculateMonthlyInterest to calculate the monthly interest by
	 * multiplying the savingBalance by AnnualInterestRate divided by 12 and
	 * interest amount will be added to the savingBalance
	 * 
	 * @return
	 */
	public float calculateMonthlyInterest() {
		float monthlyInterest = (savingBalance * (annualInterestRate / 100) / 12);
		savingBalance += monthlyInterest;
		return savingBalance;
	}

	/**
	 * creating a static method modifyInterestRate that sets the annualInterestRate
	 * to a new value
	 * 
	 * @param iRate -taking iRate for the new value
	 */
	public static void modifyAnnualInterestRate(float iRate) {
		annualInterestRate = iRate;
	}

	public float getSavingBalance() {
		return savingBalance;
	}
}