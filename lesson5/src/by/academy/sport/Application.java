package by.academy.sport;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import by.academy.example.*;
import java.io.BufferedReader;
import java.io.FileReader;
/*import by.academy.example.Category;
import by.academy.example.SportEquipment;*/
//import java.util.*;

public class Application{
	public static void main(String[] args) throws Exception {
		SportEquipment sporteq1 = new SportEquipment();
		SportEquipment sporteq2 = new SportEquipment();
		SportEquipment sporteq3 = new SportEquipment();
		SportEquipment sporteq4 = new SportEquipment();
		SportEquipment sporteq5 = new SportEquipment();
		
		Category category1 = new Category();
		Category category2 = new Category();
		Category category3 = new Category();
		Category category4 = new Category();
		Category category5 = new Category();
		
		FileReader fr = new FileReader("file.txt");
		Scanner scan = new Scanner(fr);
		
		category1.setName(scan.nextLine());
		category2.setName(scan.nextLine());
		category3.setName(scan.nextLine());
		category4.setName(scan.nextLine());
		category5.setName(scan.nextLine());
		
		sporteq1.setCategory(category1);
		sporteq2.setCategory(category2);
		sporteq3.setCategory(category3);
		sporteq4.setCategory(category4);
		sporteq5.setCategory(category5);
		
		sporteq1.setTitle(scan.nextLine());
		sporteq2.setTitle(scan.nextLine());
		sporteq3.setTitle(scan.nextLine());
		sporteq4.setTitle(scan.nextLine());
		sporteq5.setTitle(scan.nextLine());
		
		scan.close();
		fr.close();
		int[] array = null;
		try(BufferedReader in = new BufferedReader(new FileReader("file1.txt"))){
			array = in.lines().mapToInt(Integer::parseInt).toArray();
		}
		
		sporteq1.setPrice(array [0]);
		sporteq2.setPrice(array [1]);
		sporteq3.setPrice(array [2]);
		sporteq4.setPrice(array [3]);
		sporteq5.setPrice(array [4]);
		
		Shop shop = new Shop();
		Map<SportEquipment, Integer> k = new HashMap<SportEquipment, Integer>();
		k.put(sporteq1, array[5]);
		k.put(sporteq2, array[6]);
		k.put(sporteq3, array[7]);
		k.put(sporteq4, array[8]);
		k.put(sporteq5, array[9]);
		shop.setGoods(k);
		
		RentUnit rent = new RentUnit();
		SportEquipment[] n = {sporteq1, sporteq2, sporteq1};
		rent.setUnits(n);
		
		k.replace(sporteq2, 1-1);
		k.replace(sporteq1, 10-2);
		
		for(Map.Entry<SportEquipment, Integer> item: k.entrySet()) {
			System.out.printf("%s, %d\n", item.getKey().getTitle(), item.getValue());
		}
		
		rent.write();

	}

}
