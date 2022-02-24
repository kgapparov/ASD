package edu.mum.cs.cs525.labs.lab3;

public class Application {
	public static void main(String[] args) {

		AccountService accountService = new AccountServiceImpl();
		// create 2 accounts;
		accountService.createAccount(AccountType.SAVING, "1263862", "Frank Brown");
		accountService.createAccount(AccountType.CHECKING, "4253892", "John Doe");
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 509);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances


		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			account.setInterest(new P3(account.getInterest()));
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n", "", "Current Balance:", account.getBalance());
		}

		accountService.addInterest();

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			account.setInterest(new P2(account.getInterest()));
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());

			System.out.println("-Date-------------------------"
					+ "-Description------------------"
					+ "-Amount-------------");

			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n",
						entry.getDate().toString(),
						entry.getDescription(),
						entry.getAmount());
			}

			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n", "", "Current Balance:", account.getBalance());
		}

	}

}
