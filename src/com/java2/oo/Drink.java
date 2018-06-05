package com.java2.oo;

public class Drink {
    int id;
    String name;
    int price;
    public Drink(int id,String name, int price){
    	super();
    	this.id =id;
    	this.name =name;
    	this.price =price;
    }
    
    public void setId(int id){
    	 this.id =id;
    }
    public int getId(){
    	return id;
    }  /*可右鍵螢幕找source再找產生getters and setters*/
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
