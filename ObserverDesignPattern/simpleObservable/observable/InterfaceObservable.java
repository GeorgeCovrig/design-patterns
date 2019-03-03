package observable;

import observer.InterfaceObserverGenerics;

public interface InterfaceObservable {
	public void registerObserver(InterfaceObserverGenerics observer);

	public void removeObserver(InterfaceObserverGenerics observer);

	public void notifyObservers(String subject);
}
