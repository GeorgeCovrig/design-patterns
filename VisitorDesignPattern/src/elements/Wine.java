package elements;

import visitors.BuyEverithingInterface;

/**
 * 
 * @author george
 * Concrete client in the UML diagram
 */
public class Wine implements GroceriesInterface{

	@Override
	public void accept(BuyEverithingInterface buyEverithingInterface) {
		buyEverithingInterface.buy(this);

	}

}
