package elements;

import visitors.BuyEverithingInterface;

/**
*
* @author  george
* This interface can be seen in the UML diagram as Element interface
*/
public interface GroceriesInterface {
	public void accept(BuyEverithingInterface buyEverithingInterface);
}
