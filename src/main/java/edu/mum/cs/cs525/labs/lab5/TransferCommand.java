package edu.mum.cs.cs525.labs.lab5;

public class TransferCommand implements Command{
    private AccountService accountService;

    public TransferCommand(AccountService accountService) {
        this.accountService = accountService;
    }

    private String accountFrom;

    private String accountTo;

    private String description;

    private double amount;

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private boolean isExecuted = false;

    @Override
    public void execute() {
        isExecuted = true;
        accountService.transferFunds(accountFrom, accountTo, amount, description);
    }

    @Override
    public void redo() {
        if (isExecuted)
            execute();
    }

    @Override
    public void undo() {
        if (isExecuted)
            accountService.transferFunds(accountTo, accountFrom, amount, "Refunding " + description);
        isExecuted = false;
    }
}
