package prototype.system.banking.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import prototype.system.banking.model.registration.User;
import prototype.system.banking.service.RegistrationService;

@SpringBootTest
public class BankingProcessUT {

	/*
	 * requirement
	 * 
	 * new user of internet banking should be able to register him/herself by
	 * providing either account information (account number, his/her name, date of
	 * birth) or debit card information (card number, name on the card and expiry
	 * date). A successful registration would imply that user receives a
	 * notification containing username and password to login into the system.
	 */

	@Autowired
	RegistrationService registrationService;

	@Test
	public void testRegistration() {

		User user = User.factory();

		// validate user
		assertThat(user.isValid()).isTrue();

		// register user
		assertThat(registrationService.register(user)).isNotNull();

		// notify user
		assertThat(user.isNotified()).isTrue();
	}

}
