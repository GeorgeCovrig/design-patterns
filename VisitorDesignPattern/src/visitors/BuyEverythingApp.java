package visitors;

import elements.Bread;
import elements.Parfume;
import elements.Shampoo;
import elements.Wine;

public class BuyEverythingApp implements BuyEverithingInterface{

	@Override
	public void buy(Bread bread) {
		System.out.println("Bought "+bread.getClass().getName());
	}

	@Override
	public void buy(Parfume parfume) {
		System.out.println("Bought "+parfume.getClass().getName());
	}

	@Override
	public void buy(Shampoo shampoo) {
		System.out.println("Bought "+shampoo.getClass().getName());

	}

	@Override
	public void buy(Wine wine) {
		System.out.println("Bought "+wine.getClass().getName());


	}

}
