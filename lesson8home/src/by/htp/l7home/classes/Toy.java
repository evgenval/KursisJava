package by.htp.l7home.classes;

public class Toy {
	private int ageStart;
	private int ageFinish;
	private String size;
	private int cost;
	
	public int getAgeStart() {
		return ageStart;
	}
	public void setAgeStart(int ageStart) {
		this.ageStart = ageStart;
	}
	public int getAgeFinish() {
		return ageFinish;
	}
	public void setAgeFinish(int ageFinish) {
		this.ageFinish = ageFinish;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Toy(int ageStart, int ageFinish, String size, int cost) {
		this.ageStart = ageStart;
		this.ageFinish = ageFinish;
		this.size = size;
		this.cost = cost;
	}
	public Toy() {
		
	}
	
}
