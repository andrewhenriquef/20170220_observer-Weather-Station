package application;

import subscriber.*;

public interface Publisher {

	public void addSubscriber(Subscriber subs);
	public void removeSubscriber(Subscriber subs);
	public void notifySubscriber();

}
