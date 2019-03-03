package observable;

import observer.InterfaceObserver;

public interface InterfaceObservable {
	public void registerObserver(InterfaceObserver observer);

	public void removeObserver(InterfaceObserver observer);

	public void notifyObservers(String subject);
}
