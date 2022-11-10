package ir.tamin.aophomework.main.model;

import org.springframework.stereotype.Component;

@Component
public class AccountDto {

    private String number;
    private AccountType type;



//    public AccountDto(String number, AccountType type) {
//        this.number = number;
//        this.type = type;
//    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", type=" + type +
                '}';
    }
}
