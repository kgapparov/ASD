package edu.mum.cs.cs525.labs.lab5;

public class WithdrawCommand implements Command{
    private AccountService accountService;

    private double amount;

    private boolean isExecuted = false;

    WithdrawCommand(AccountService accountService) {
        this.accountService = accountService;
    }

    private String accountNumber = "";
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public void execute() {
        isExecuted = true;
        accountService.withdraw(accountNumber, amount);
    }

    @Override
    public void redo() {
        if (isExecuted)
            this.execute();
    }

    @Override
    public void undo() {
        if (isExecuted)
            accountService.deposit(accountNumber, amount);
        isExecuted = false;
    }
}
