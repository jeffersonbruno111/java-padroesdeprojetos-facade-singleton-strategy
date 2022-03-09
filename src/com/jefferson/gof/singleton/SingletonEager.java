package com.jefferson.gof.singleton;
/**
 * Singleton "Apressado".
 * 
 * @author jefferson
 *
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return instancia;
	}
	
}
