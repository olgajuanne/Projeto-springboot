package JavaPuro.Test;

import JavaPuro.Facade.Facade;
import JavaPuro.Singleton.SingletonEager;
import JavaPuro.Singleton.SingletonLazy;
import JavaPuro.Singleton.SingletonLazyHolder;
import JavaPuro.Strategy.Comportamento;
import JavaPuro.Strategy.ComportamentoAgressivo;
import JavaPuro.Strategy.ComportamentoDefensivo;
import JavaPuro.Strategy.ComportamentoNormal;
import JavaPuro.Strategy.Robo;

public class Teste {

  // Singleton
  public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
 
    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    
    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);

    // Strategy

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

    //Facade

    Facade facade = new Facade();
    facade.migrarCliente(" Vanilton", " 1401788");
  }

}
