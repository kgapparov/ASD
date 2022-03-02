package edu.mum.cs.cs525.labs.lab6;

import edu.mum.cs.cs525.labs.lab6.logger.LoggerAdapter;
import edu.mum.cs.cs525.labs.lab6.logger.My4jLogger;
import edu.mum.cs.cs525.labs.lab6.logger.MyLogger;

public class Application {
	public static void performTask (AccountService accountService) {
		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
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
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

	public static void main(String[] args) {
		AccountServiceImpl accountService = new AccountServiceImpl();
		//accountService.setLogger(new MyLogger());
		accountService.setLogger(new LoggerAdapter(new My4jLogger()));
		performTask(accountService);
	}

}
