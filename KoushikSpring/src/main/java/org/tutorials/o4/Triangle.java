package org.tutorials.o4;

import java.util.List;

public class Triangle {


	private String message = "Tutorial Spring with xml"; 
	
	List<Point> points;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw() {
		points.stream().forEach(t -> {
			System.out.println(t.getX());
			System.out.println(t.getY());
		});
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


}
