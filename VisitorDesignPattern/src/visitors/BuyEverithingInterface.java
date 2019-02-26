package visitors;

import elements.Bread;
import elements.Parfume;
import elements.Shampoo;
import elements.Wine;

/**
 * 
 * @author george
 * this is the interface of Visitor
 * instead of methods visit we have the method buy
 */
public interface BuyEverithingInterface {
	public void buy(Bread bread);
	public void buy(Parfume bread);
	public void buy(Shampoo bread);
	public void buy(Wine bread);

}
