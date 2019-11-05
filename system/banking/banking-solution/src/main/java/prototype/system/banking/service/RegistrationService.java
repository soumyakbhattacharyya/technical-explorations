package prototype.system.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prototype.system.banking.model.notification.NotificationExecutionOutcome;
import prototype.system.banking.model.notification.Subject;
import prototype.system.banking.model.registration.RegistrationConfirmation;
import prototype.system.banking.model.registration.User;

@Service
public class RegistrationService {

	private static final String SUCCESS = "SUCCESS";
	private static final String FAILURE = "FAILURE";
	@Autowired
	NotificationService notificationService;

	public RegistrationConfirmation register(User user) {

		if (user.isValid()) {
			// TODO process further
			if (persist()) {
				NotificationExecutionOutcome notificationOutcome = notificationService.notify(user, new Subject());
				if (notificationOutcome.isSuccess()) {
					return new RegistrationConfirmation(SUCCESS);
				} else {
					return new RegistrationConfirmation(FAILURE);
				}
			}

		}
		
		throw new AssertionError("Unreachable, as previous steps are decisive");

	}

	private boolean persist() {
		return true;
	}

}
