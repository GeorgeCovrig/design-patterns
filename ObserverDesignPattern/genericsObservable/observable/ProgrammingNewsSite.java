package observable;

import java.util.ArrayList;
import java.util.List;

import observer.InterfaceObserver;

public class ProgrammingNewsSite implements InterfaceObservable {
	List<InterfaceObserver> subscribersList = new ArrayList<InterfaceObserver>();

	@Override
	public void registerObserver(InterfaceObserver observer) {
		subscribersList.add(observer);
	}

	@Override
	public void removeObserver(InterfaceObserver observer) {
		subscribersList.remove(observer);
	}

	@Override
	public void notifyObservers(String subject) {
		for (InterfaceObserver observer : subscribersList) {
			observer.update(subject, this.getClass().getSimpleName());
		}
	}
}