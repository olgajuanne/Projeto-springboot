package JavaPuro.Singleton;

//  - Singleton "Lazy Holder"

//  - @author olgajuanne

public class SingletonLazyHolder {

  private static class InstanceHolder {
    public static SingletonLazyHolder instancia = new SingletonLazyHolder();
  } 

  public SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getInstancia() {
      return InstanceHolder.instancia;
  }
}
  

