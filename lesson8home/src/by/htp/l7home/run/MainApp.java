package by.htp.l7home.run;

import by.htp.l7home.classes.*;

public class MainApp {

	public static void main(String[] args) {
		Cubbe cubbe1 = new Cubbe(0, 3, "small", 10);
		Cubbe cubbe2 = new Cubbe(0, 3, "big", 30);
		Cubbe cubbe3 = new Cubbe(3, 6, "small", 10);
		Cubbe cubbe4 = new Cubbe(3, 6, "middle", 20);
		Cubbe cubbe5 = new Cubbe(6, 9, "big", 30);
		
		
		Ball ball_1 = new Ball(0, 3, "big", 15);
		Ball ball_2 = new Ball(3, 6, "middle", 10);
		Ball ball_3 = new Ball(3, 6, "small", 5);
		Ball ball_4 = new Ball(6, 9, "big", 15);
		Ball ball_5 = new Ball(6, 9, "big", 15);
		
		Car car1 = new Car(0, 3, "middle", 12);
		Car car2 = new Car(3, 6, "small", 6);
		Car car3 = new Car(6, 9, "middle", 12);
		Car car4 = new Car(6, 9, "big", 18);
		Car car5 = new Car(6, 9, "big", 18);
		
		Doll doll_1 = new Doll(0, 3, "big", 21);
		Doll doll_2 = new Doll(0, 3, "small", 7);
		Doll doll_3 = new Doll(3, 6, "small", 7);
		Doll doll_4 = new Doll(3, 6, "middle", 14);
		Doll doll_5 = new Doll(6, 9, "big", 21);
		
		Room room = new Room();
		room.setCubbe(new Cubbe[] {cubbe1, cubbe2, cubbe3, cubbe4, cubbe5});
		room.setBall(new Ball[] {ball_1, ball_2, ball_3, ball_4, ball_5});
		room.setCar(new Car[] {car1, car2, car3, car4, car5});
		room.setDoll(new Doll[] {doll_1, doll_2, doll_3, doll_4, doll_5});
		
		System.out.println("Выведем игрушки в комнате распределенные по размеру(по мере их увеличения):");
		room.strSort();
		System.out.println("Узнаем количество всех больших игрушек для детей в возрасте от 6 до 9 лет:"+ room.find());
		System.out.println("Отсортируем игрушки в комнате по стоимости.");
		room.sort();
		System.out.println("\n.......Отсортированно!!!");
	}

}
