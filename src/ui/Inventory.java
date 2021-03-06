package ui;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> inv;
	
	public Inventory() {
		inv = new ArrayList<Item>();
	}
	
	public void addItems(Item items) {
		inv.add(items);
	}
	
	public int inventorySize() {
		return inv.size();
	}
	
	public Item getItem(int index) {
		return inv.get(index);
	}
}
