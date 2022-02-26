package edu.mum.cs.cs525.labs.lab4;

import java.util.Collection;

public class AccountServiceImpl extends AccountDAOFactory implements AccountService {

	AccountServiceImpl(EnvironmentType type){
		super();
		super.setAccountDao(type);
	}

	AccountServiceImpl(){
	}

	public void setEnvironment(EnvironmentType type) {
		super.setAccountDao(type);
	}

	public AccountServiceImpl (Subject subject){
		subject.register(this);
	}

	@Override
	public void update(EnvironmentType type) {
		setEnvironment(type);
	}

	@Override
	public AccountDAO createAccountDAO(EnvironmentType type) {
		AccountDAO accountDAO = null;
		if (type == EnvironmentType.PRODUCTION) accountDAO = new AccountDAOImpl();
		else accountDAO = new MockAccountDAOImpl();
		return accountDAO;
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		super.getAccountDao().saveAccount(account);
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = super.getAccountDao().loadAccount(accountNumber);
		account.deposit(amount);
		this.getAccountDao().updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = super.getAccountDao().loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return getAccountDao().getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = super.getAccountDao().loadAccount(accountNumber);
		account.withdraw(amount);
		super.getAccountDao().updateAccount(account);
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = super.getAccountDao().loadAccount(fromAccountNumber);
		Account toAccount = super.getAccountDao().loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		super.getAccountDao().updateAccount(fromAccount);
		super.getAccountDao().updateAccount(toAccount);
	}
}
