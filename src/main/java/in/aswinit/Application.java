package in.aswinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.aswinit.entity.Account;
import in.aswinit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		AccountRepository repository=context.getBean(AccountRepository.class);
		Account obj=new Account();
		obj.setAccId(111);
		obj.setAccHolderName("aaa");
		obj.setAccType("current");
		obj.setBranchName("secundrabad");
		obj.setMinBal(4567.0);
		repository.save(obj);
	}

}
