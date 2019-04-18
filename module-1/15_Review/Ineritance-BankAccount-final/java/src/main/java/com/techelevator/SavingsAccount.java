package com.techelevator;

public class SavingsAccount extends BankAccount  implements InterestAccount{
	
    public SavingsAccount(String accountHolder, String accountNumber, DollarAmount balance) {
        super(accountHolder, accountNumber, balance);
    }

    public SavingsAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    
    //we need to override  the withdraw() in the super class b/c we need to do something different
    @Override
    public DollarAmount withdraw(DollarAmount amountToWithdraw) {
        // only perform transaction of positive $
        if (!getBalance().minus(amountToWithdraw).isNegative()) {
            super.withdraw(amountToWithdraw);
            // Assess $2 fee if it goes below $150
            if (getBalance().getDollars() < 150) {
                super.withdraw(new DollarAmount(200));
            }                
        }
        return getBalance();
    }

	@Override
	public DollarAmount addInterest() {
		double interest = 0; //initialize interest to 0
		interest = super.getBalance().getTotalAmountInCents() * INTEREST_RATE;
		super.deposit(new DollarAmount((int)interest));
		
		return super.getBalance();
	}
}
