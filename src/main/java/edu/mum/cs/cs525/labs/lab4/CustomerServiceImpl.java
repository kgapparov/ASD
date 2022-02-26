package edu.mum.cs.cs525.labs.lab4;

public class CustomerServiceImpl extends AccountDAOFactory implements CustomerService{
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

    public void setEnvironment(EnvironmentType type) {
        System.out.println("The Environment type changed to " + type.toString());
        super.setAccountDao(type);
    }
    public CustomerServiceImpl(Subject subject){
        subject.register(this);
    }
    public CustomerServiceImpl (){
    }

    public CustomerServiceImpl(EnvironmentType type) {
        super();
        super.setAccountDao(type);
    }

    @Override
    public void getAccountEntries(Account account) {

    }
}
