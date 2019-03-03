package observable;

import java.util.ArrayList;
import java.util.List;

import observer.InterfaceObserverGenerics;

public abstract class AbstractObservableGenerics <S extends AbstractObservableGenerics<S,O,A>, O extends InterfaceObserverGenerics<A>, A>{
	List<O> subscribersList = new ArrayList<O>();

	
	public void registerObserver(O observer) {
		subscribersList.add(observer);
	}

	public void removeObserver(O observer) {
		subscribersList.remove(observer);
	}

	public void notifyObservers(A subject) {
		for (O observer : subscribersList) {
			observer.update(subject, this.getClass().getSimpleName());
		}
	}
}
