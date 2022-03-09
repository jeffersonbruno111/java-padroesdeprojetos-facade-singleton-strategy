package com.jefferson.gof;

import com.jefferson.gof.facade.Facade;
import com.jefferson.gof.singleton.SingletonEager;
import com.jefferson.gof.singleton.SingletonLazy;
import com.jefferson.gof.singleton.SingletonLazyHolder;
import com.jefferson.gof.strategy.Comportamento;
import com.jefferson.gof.strategy.ComportamentoAgressivo;
import com.jefferson.gof.strategy.ComportamentoDefensivo;
import com.jefferson.gof.strategy.ComportamentoNormal;
import com.jefferson.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {

		//Testes relacionados ao Design Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		//Testes relacionados ao Design Pattern Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Testes relacionados ao Design Pattern Facade
		Facade migracao = new Facade();
		migracao.migrarCliente("Jefferson", "1234");
		
	}

}
