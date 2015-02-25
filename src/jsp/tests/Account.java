package jsp.tests;

public class Account {
    
    private int acctno;
    private String name;
    private double balance;
    
    public Account() {
    }

    public Account(int accountNumber, String name, double balance){
        this.acctno = accountNumber; this.name = name; this.balance = balance;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
