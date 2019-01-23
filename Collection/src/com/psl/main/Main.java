package com.psl.main;

class X{
	
}
class Y extends X{
	
}
class Z extends Y{
	
}

class GenericClass<T>{
	public void add(T val){   //write
		
	}
	public T get(){            //read
		return null;
	}
}

public class Main {
public static void main(String[] args) {
	GenericClass<? extends X> ref;
	
	ref=new GenericClass<X>();  //possibilty 1
	ref=new GenericClass<Y>();  //2
	ref=new GenericClass<Z>();  //3
	
	
	//ref.add(new X()); ***********************//cTE because it is only allowed for 1 possibility**********************
	
	//ref.add();
	//ref.get();
	
	GenericClass<? super Y> nref;
	
	
	nref=new GenericClass<Y>();  //possibilty 1A
	nref=new GenericClass<X>();          // 2A
	nref=new GenericClass<Object>();     //3A
	
	
	
	nref.add(new Y());        // lower bound,can use the object lower than Y i.e Z
	nref.add(new Z());			//valid
	
	nref.get();
	
	GenericClass c=new GenericClass();    //Raw Type
	
}


public static <T> boolean linearSearch(T val,T date[]){   //generic method in a non generic class
	return false;
	
}
}
