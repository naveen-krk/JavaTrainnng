package exercise2;

public class exp8 {
  public static void main(String[] args) {
      Singleton s ;//reference creation
      s= Singleton.createInstance();
      // s.createInstance();
  }
}
class Singleton{
  private static Singleton Obj = null;//creating a private inner object
  private Singleton(){//private constructor
  }
  public static Singleton createInstance(){//public function that accesses private object
      if(Obj == null){//checking Object initialization
          Obj = new Singleton();
      }
      Obj.getMessage();
      return Obj;
  }
  private void getMessage(){
      System.out.println("Object created only once");
  }
}

