package elements;

import visitors.BuyEverithingInterface;

/**
 * @author george
 * Concrete client in the UML diagram
 */
public class Shampoo implements GroceriesInterface{

	@Override
	public void accept(BuyEverithingInterface buyEverithingInterface) {
		buyEverithingInterface.buy(this);

	}

}
