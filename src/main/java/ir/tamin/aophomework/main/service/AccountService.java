package ir.tamin.aophomework.main.service;

import ir.tamin.aophomework.main.model.AccountDto;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public AccountDto create(AccountDto accountDto){
        return accountDto;
    }

    public AccountDto update(String accNumber, AccountDto accountDto){
        return accountDto;
    }

    public void findByAccNumber(String accNumber){

    }

    public void delete(String accNumber){

    }

}
