package by.academy.example;
import by.academy.example.SportEquipment;

public class RentUnit {
	private SportEquipment units[];

	public SportEquipment[] getUnits() {
		return units;
	}

	public void setUnits(SportEquipment[] units) {
		this.units = units;
	}
	
	public void write() {
		for(int i = 0; i < 3; i++) {
			System.out.println("This equipment is in rent:" + units[i].getTitle() + ". It was taken for " + units[i].getPrice());
		}
		
	}
	
}
