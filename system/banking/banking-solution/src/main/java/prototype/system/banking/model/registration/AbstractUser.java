package prototype.system.banking.model.registration;

public abstract class AbstractUser implements User {

	@Override
	public abstract boolean isValid();

	@Override
	public boolean isNotified() {
		// TODO implement notification method
		return false;
	}

}
