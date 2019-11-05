package prototype.system.banking.model.registration;

import java.util.function.IntPredicate;

public interface User {

	static User factory(){
		return new CommercialUser();		
	}

	boolean isValid();

	boolean isNotified();
}
