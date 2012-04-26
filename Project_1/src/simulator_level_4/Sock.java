package simulator_level_4;

class Sock {
	String size;
	String color;
	public boolean equals(Object o){ //exemplo do radio-relogio, pois é mais evoluído que um rádio e que um relógio
		Sock s = (Sock) o;
		return color.equals(o);
	}
}
