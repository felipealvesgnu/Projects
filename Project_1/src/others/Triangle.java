package others;

class Line{
	public class Point{ public int x,y;}
	public Point getPoint(){ return new Point();}
}

class Triangle {
	public Triangle(){
		Line.Point l = (new Line()).getPoint();
	}
}
