package ir.tamin.aophomework.main;


import ir.tamin.aophomework.main.config.AppConfig;
import ir.tamin.aophomework.main.model.AccountDto;
import ir.tamin.aophomework.main.model.AccountType;
import ir.tamin.aophomework.main.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService bean = ctx.getBean(AccountService.class);
        AccountDto accountDto = new AccountDto();
        accountDto.setNumber("1239644");
        accountDto.setType(AccountType.CURRENT_ACCOUNT);
        AccountDto savedAccount = bean.create(accountDto);
        ctx.close();
    }
}
