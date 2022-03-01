package edu.mum.cs.cs525.labs.lab5;

public class Application {
	public static void display(AccountService accountService) {
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
		AccountService accountService = new AccountServiceImpl();

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");

		//Internet Provider account
		accountService.createAccount("3331122", "Telco Inc");

		//Depoist Command customization
		DepositCommand holidayDepositCounter = new DepositCommand(accountService);
		holidayDepositCounter.setAmount(100);
		holidayDepositCounter.setAccountNumber("1263862");

		//withdraw command customization
		WithdrawCommand wc = new WithdrawCommand(accountService);
		wc.setAccountNumber("1263862");
		wc.setAmount(50.0);

		//setTranfer command customization
		TransferCommand transferCommand = new TransferCommand(accountService);
		transferCommand.setAccountFrom("1263862");
		transferCommand.setAccountTo("3331122");
		transferCommand.setDescription("Internet service.");
		transferCommand.setAmount(70.0);

		/**
		 * Customizing your personal Invoker.
		 */
		Invoker invoker = new Invoker();
		invoker.setCommand(0, holidayDepositCounter);
		invoker.setCommand(2, transferCommand);
		invoker.setCommand(1, wc);


		// Perform tasks through invoker
		invoker.commandExecute(0);
		invoker.commandExecute(0);
		invoker.commandExecute(0);
		invoker.commandExecute(0);
		invoker.commandExecute(0);
		invoker.commandExecute(1);
		invoker.commandExecute(1);
		invoker.commandExecute(1);
		invoker.undo();
		invoker.redo();
		invoker.commandExecute(1);
		invoker.redo();
		invoker.undo();
		invoker.commandExecute(2);
		invoker.undo();

		//The following undo() is empty because it is already executed once.
		invoker.undo();
		invoker.undo();
		invoker.undo();

		//Result of task performings.
		display(accountService);

	}

}
