package prototype.system.banking.service;

import org.springframework.stereotype.Service;

import prototype.system.banking.model.notification.NotificationExecutionOutcome;
import prototype.system.banking.model.notification.Subject;
import prototype.system.banking.model.registration.User;

@Service
public class NotificationService {

	public NotificationExecutionOutcome notify(User user, Subject subject) {
		return new NotificationExecutionOutcome();
		
	}

}
