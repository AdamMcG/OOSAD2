package ORG.Week2;

public class CartItem {

	public CartItem() {
		// TODO - implement CartItem.CartItem
		throw new UnsupportedOperationException();
	}

	public CartItem(int id, int price, String name) {
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public int getItemID() {
		return this.itemID;
	}

	/**
	 * 
	 * @param itemID
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	private int itemID;
	private double price = 0;
	private String name = "test";
	

}
