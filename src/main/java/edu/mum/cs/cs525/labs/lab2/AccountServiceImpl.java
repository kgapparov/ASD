package edu.mum.cs.cs525.labs.lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService{
	private AccountDAO accountDAO;

	private List<Observer> observers = new ArrayList<>();
	
	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);

		sendNotification(account, ActionType.CREATEACCOUNT);
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);

		sendNotification(account, ActionType.DEPOSIT);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		sendNotification(account, ActionType.CHECKACCOUNT);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);

		sendNotification(account , ActionType.WITHDRAW);
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		sendNotification(fromAccount, ActionType.TRANSFER);
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		remove(o);
	}

	@Override
	public void sendNotification(Account account, ActionType action) {
		for (Observer o : observers) {
			o.update(account, action);
		}
	}
}
