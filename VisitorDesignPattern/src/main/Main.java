package main;

import java.util.ArrayList;
import java.util.List;

import elements.Bread;
import elements.GroceriesInterface;
import elements.Parfume;
import elements.Shampoo;
import elements.Wine;
import visitors.BuyEverithingInterface;
import visitors.BuyEverythingApp;

public class Main {

	public static void main(String[] args) {
		//Element
		BuyEverithingInterface buyEverythingApp=new BuyEverythingApp();
		//visitors
		Bread bread=new Bread();
		Parfume parfume = new Parfume();
		Shampoo shampoo= new Shampoo();
		Wine wine = new Wine();
		List<GroceriesInterface> listGroceries = new ArrayList<GroceriesInterface>();
		listGroceries.add(wine);
		listGroceries.add(bread);
		listGroceries.add(parfume);
		listGroceries.add(shampoo);
		for (GroceriesInterface grocery : listGroceries) {
			grocery.accept(buyEverythingApp);
		}
	}

}
