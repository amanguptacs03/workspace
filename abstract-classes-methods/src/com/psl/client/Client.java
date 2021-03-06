package com.psl.client;

import com.psl.model.Circle;
import com.psl.model.Rectangle;
import com.psl.model.Shape;
import com.psl.model.Triangle;

public class Client {
	
	public static void shapeManager(Shape s){
		s.calculateArea();
		s.calculatePeimeter();
		System.out.println("-----------------------------------------");
		System.out.println(String.format("|%15s","Name |")+String.format("%25s",s.getName()+"|"));
		System.out.println(String.format("|%15s","Area |")+String.format("%25s",s.getArea()+"|"));
		System.out.println(String.format("|%15s","Perimeter |")+String.format("%25s ",s.getPerimeter()+"|"));	
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle(2.5);
		Rectangle r=new Rectangle(12.5, 15.6);
		Triangle t=new Triangle(4,4,5);
		
		
		Shape[] sh={c,r,t};
	for(Shape s : sh)
		shapeManager(s);
	
			
	}

}
