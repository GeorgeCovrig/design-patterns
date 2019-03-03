package observable;

import java.util.ArrayList;
import java.util.List;

import observer.InterfaceObserverGenerics;

public class SportMagazineObservable implements InterfaceObservable {

	List<InterfaceObserverGenerics> subscribersList = new ArrayList<InterfaceObserverGenerics>();

	@Override
	public void registerObserver(InterfaceObserverGenerics observer) {
		subscribersList.add(observer);
	}

	@Override
	public void removeObserver(InterfaceObserverGenerics observer) {
		subscribersList.remove(observer);
	}

	@Override
	public void notifyObservers(String subject) {
		for (InterfaceObserverGenerics observer : subscribersList) {
			observer.update(subject, this.getClass().getSimpleName());
		}

	}

}
