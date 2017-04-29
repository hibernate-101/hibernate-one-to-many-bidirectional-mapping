package com.hibernate.model;

import java.util.Set;

public class Cart {
	private long id;
	private double total;
	private String name;
	Set<Items> item;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Items> getItem() {
		return item;
	}

	public void setItem(Set<Items> item) {
		this.item = item;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [id=" + id + ", total=" + total + ", name=" + name + "]";
	}
	
	
	
	

}
