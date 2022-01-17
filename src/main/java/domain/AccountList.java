package domain;

import java.util.ArrayList;

public class AccountList {
    //This is a test class, so that the client had connection to the facade

    ArrayList<DTUPayAccount> list = new ArrayList<>();

    //singleton
    private static AccountList accountList = new AccountList();
    private AccountList(){};
    public static AccountList getInstance(){return accountList;}
    //------------------------


    public void addAccount(DTUPayAccount account){list.add(account);}
    public ArrayList<DTUPayAccount> getAccountList(){ return list;}
}
