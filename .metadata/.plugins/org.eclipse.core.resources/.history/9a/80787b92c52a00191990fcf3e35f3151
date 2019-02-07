package com.tienda.util;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.tienda.resource.UserResource;


@ApplicationPath("/") //if you use ("/my-app") as a para,then ur url will be "http://localhost:8080/tienda/my-app"
public class TiendaApllication extends Application {

	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classes=new HashSet<Class<?>>();
		classes.add(UserResource.class);
		return classes;
	}
}
