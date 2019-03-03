package main;

import observable.ProgrammingNewsSiteGenerics;
import observable.SportMagazineObservableGenerics;
import observer.PersonGenerics;

public class MainGenerics {

	public static void main(String[] args) {
		// observer creation
		PersonGenerics john = new PersonGenerics("John");
		PersonGenerics maria = new PersonGenerics("Maria");
		PersonGenerics iohan = new PersonGenerics("Iohan");

		// observable creation
		SportMagazineObservableGenerics sportMagazineObservable = new SportMagazineObservableGenerics();
		ProgrammingNewsSiteGenerics programmingNewsSite = new ProgrammingNewsSiteGenerics();

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
