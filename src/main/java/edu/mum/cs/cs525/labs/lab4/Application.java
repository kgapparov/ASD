package edu.mum.cs.cs525.labs.lab4;

public class Application {
	private static void perfomTask(AccountService accountService) {
		System.out.println("\n\n==============================================================================");
		//create two account
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
		//create environment
		Environment env = new Environment();

		//create two services
		AccountService accountService = new AccountServiceImpl(env);
		CustomerService cs = new CustomerServiceImpl(env);

		//set environment
		env.setEnvironment(EnvironmentType.PRODUCTION);

		//perform tasks
		perfomTask(accountService);

		//set change to other environment
		env.setEnvironment(EnvironmentType.TEST);

		//perform tasks
		perfomTask(accountService);
	}

}
