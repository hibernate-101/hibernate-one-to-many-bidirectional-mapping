package com.hibernate.model;

public class Items {
	private long id;
	private String itemId;
	private double itemTotal;
	private int itemQuantity;
	private Cart cart;

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Items(String itemId, double itemTotal, int itemQuantity, Cart cart) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.itemQuantity = itemQuantity;
		this.cart = cart;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemId=" + itemId + ", itemTotal="
				+ itemTotal + ", itemQuantity=" + itemQuantity + "]";
	}

}
