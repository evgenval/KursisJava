package by.htp.l7home.classes;

import by.htp.l7home.inter.ToyOperation;

public class Room implements ToyOperation{
	private Ball[] ball;
	private Car[] car;
	private Cubbe[] cubbe;
	private Doll[] doll;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Ball[] getBall() {
		return ball;
	}

	public void setBall(Ball[] ball) {
		this.ball = ball;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	public Cubbe[] getCubbe() {
		return cubbe;
	}

	public void setCubbe(Cubbe[] cubbe) {
		this.cubbe = cubbe;
	}

	public Doll[] getDoll() {
		return doll;
	}

	public void setDoll(Doll[] doll) {
		this.doll = doll;
	}

	@Override
	public int intSort(Toy[] toys) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void strSort() {
		String small = "small", middle = "middle", big = "big";
		
		for(int k = 0; k < 3; k++) {
			int b = 0, c = 0, u = 0, d = 0;
			if(k == 0) {
				for(int i = 0; i < ball.length; i++) {
					if(small.equals(ball[i].getSize())) {
						b++;
					}
					if(small.equals(car[i].getSize())) {
						c++;
					}
					if(small.equals(cubbe[i].getSize())) {
						u++;
					}
					if(small.equals(doll[i].getSize())) {
						d++;
					}	
				}
				System.out.println("Маленькие игрушки это " + b + " мяч(-а)," + c + " машинка(-и)," + 
						u + " кубик(-а) и " + d + " машинка(-и).");
			}
			if(k == 1) {
				for(int i = 0; i < ball.length; i++) {
					if(middle.equals(ball[i].getSize())) {
						b++;
					}
					if(middle.equals(car[i].getSize())) {
						c++;
					}
					if(middle.equals(cubbe[i].getSize())) {
						u++;
					}
					if(middle.equals(doll[i].getSize())) {
						d++;
					}	
				}
				System.out.println("Средних размеров игрушки это " + b + " мяч(-а)," + c + " машинка(-и)," + 
						u + " кубик(-а) и " + d + " машинка(-и).");
			}
			if(k == 2) {
				for(int i = 0; i < ball.length; i++) {
					if(big.equals(ball[i].getSize())) {
						b++;
					}
					if(big.equals(car[i].getSize())) {
						c++;
					}
					if(big.equals(cubbe[i].getSize())) {
						u++;
					}
					if(big.equals(doll[i].getSize())) {
						d++;
					}	
				}
				System.out.println("Большие игрушки это " + b + " мяч(-а)," + c + " машинка(-и)," + 
						u + " кубик(-а) и " + d + " машинка(-и).");
			}
		}
	}

	@Override
	public int find() {
		int f = 6, s = 0;
		String bigg = "big";
		for(int i = 0; i < ball.length; i++) {
			if(bigg.equals(ball[i].getSize()) && (ball[i].getAgeStart() == f)) {
				s++;
			}
			if(bigg.equals(car[i].getSize()) && (car[i].getAgeStart() == f)) {
				s++;
			}
			if(bigg.equals(cubbe[i].getSize()) && (cubbe[i].getAgeStart() == f)) {
				s++;
			}
			if(bigg.equals(doll[i].getSize()) && (doll[i].getAgeStart() == f)) {
				s++;
			}	
		}
		return s;
	}

	@Override
	public void sort() {
		Ball ball6 = new Ball();
		for(int k = 0; k < ball.length;k++) {
			for(int i = 0; i < ball.length-1; i++) {
				if(ball[i].getCost() > ball[i+1].getCost()) {
					ball6 = ball[i];
					ball[i] = ball[i+1];
					ball[i+1] = ball6;
				}
			}
		}
		Car car6 = new Car();
		for(int k = 0; k < car.length;k++) {
			for(int i = 0; i < car.length-1; i++) {
				if(car[i].getCost() > car[i+1].getCost()) {
					car6 = car[i];
					car[i] = car[i+1];
					car[i+1] = car6;
				}
			}
		}
		Cubbe cubbe6 = new Cubbe();
		for(int k = 0; k < cubbe.length;k++) {
			for(int i = 0; i < cubbe.length-1; i++) {
				if(cubbe[i].getCost() > cubbe[i+1].getCost()) {
					cubbe6 = cubbe[i];
					cubbe[i] = cubbe[i+1];
					cubbe[i+1] = cubbe6;
				}
			}
		}
		Doll doll6 = new Doll();
		for(int k = 0; k < doll.length;k++) {
			for(int i = 0; i < doll.length-1; i++) {
				if(doll[i].getCost() > doll[i+1].getCost()) {
					doll6 = doll[i];
					doll[i] = doll[i+1];
					doll[i+1] = doll6;
				}
			}
		}
	}
}
