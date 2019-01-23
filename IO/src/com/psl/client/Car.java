package com.psl.client;

import java.io.Serializable;

/*entity/model/java bean*/
public class Car extends Object implements Serializable// by extend object class,no need to write serializable(identity interfaces)
{
	
  /**
	 * 
	 */
	private static final long serialVersionUID = -7552094422326121390L;
/*data member 
   *  attribute 
   *  properties 
   *   in java instance variable					
   */
	private String make,model,color;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	protected String a ;//just accessible by the class in the same package over there,if other package class want to access then they need to inherit this class
	String b;// just accessible by the class in the same package whether they inherit this or not. It cant be accessible by class in another package even that class inherit this class
	
	
	/*containership :-
	 *             -->composition
	 *             -->aggregation
	 */
	private Engine engine;//composition-->bcoz of one only-->Car has a engine
	//private transient Engine engine;
	
	
	/*no arg contructor/no parameter constructor*/
	public Car()
	{
		this("","","");//can use only with the constructor and should be the first statement
	}
	public Car(String make,String model,String color)
	
	{
	this.make=make;
	this.model=model;
	this.color=color;
	}
	
/*member method
 * instance method
 * accessors
 */
	public String getMake() {
		return make;
	}
/*mutator
 */
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
		public String toString() {
		return "This is "+this.make+" "+this.model+" "+this.color;

		}
}
