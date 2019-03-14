package by.academy.example;
import by.academy.example.Category;

public class SportEquipment {
	private Category category;
	private String title;
	private int price;
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		}
	}
	public Category getCategory() {
		return this.category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
