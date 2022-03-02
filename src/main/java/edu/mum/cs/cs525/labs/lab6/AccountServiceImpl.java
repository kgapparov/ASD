package edu.mum.cs.cs525.labs.lab6;

import edu.mum.cs.cs525.labs.lab6.logger.LogLevel;
import edu.mum.cs.cs525.labs.lab6.logger.Logger;

import java.util.Collection;
import java.util.logging.Level;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;

	private Logger logger;

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		logger.log(LogLevel.INFO, "Acount created succesfully :" + accountNumber);
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);
		logger.log(LogLevel.INFO, "Deposit operation performed on account :" + accountNumber);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
		logger.log(LogLevel.INFO, "Withdraw operation performed :" + accountNumber);
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		logger.log(LogLevel.INFO, "Transfer operation performed.");
	}
}
