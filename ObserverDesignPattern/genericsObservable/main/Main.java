package main;

import observable.ProgrammingNewsSite;
import observable.SportMagazineObservable;
import observer.Person;

public class Main {

	public static void main(String[] args) {
		// observer creation
		Person john = new Person("John");
		Person maria = new Person("Maria");
		Person iohan = new Person("Iohan");

		// observable creation
		SportMagazineObservable sportMagazineObservable = new SportMagazineObservable();
		ProgrammingNewsSite programmingNewsSite = new ProgrammingNewsSite();

		// John and Maria are subscribing to sportMagazine
		// Iohan is subscribing to programming site
		// we will send mails from each and see what's happening
		sportMagazineObservable.registerObserver(maria);
		sportMagazineObservable.registerObserver(john);

		programmingNewsSite.registerObserver(iohan);

		sportMagazineObservable.notifyObservers("new product is arriving");
		programmingNewsSite.notifyObservers("see what's new in IT industry");

		// maria unsubcribes sportMagazine
		// let's see what's happening

		sportMagazineObservable.removeObserver(maria);

		System.out.println("===Maria unsubscribes sport magazine");
		sportMagazineObservable.notifyObservers("new product is arriving");
		programmingNewsSite.notifyObservers("see what's new in IT industry");

	}

}
