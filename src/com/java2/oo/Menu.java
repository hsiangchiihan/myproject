package com.java2.oo;

public class Menu {

	int id;
	String name;
	int price;
	int kcal;
	public Menu(int id, String name, int price, int kcal) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
