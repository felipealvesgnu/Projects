package simulator_level_4;

class Sock {
	String size;
	String color;
	public boolean equals(Object o){ //examplo do radio-relogio, pois � mais evolu�do que um r�dio e que um rel�gio
		Sock s = (Sock) o;
		return color.equals(o);
	}
}
