package ir.tamin.aophomework.main.model;

public enum AccountType {

    SAVING_ACCOUNT(1,"savingAccount"),
    CURRENT_ACCOUNT(2,"currentAccount");

    private int code;
    private String name;

    AccountType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
