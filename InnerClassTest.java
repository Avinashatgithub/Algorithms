interface Interface {
  void run();
  class InnerClass{
    static{
    	System.out.println("InnerClass static block");
    }
    {
    	System.out.println("InnerClass instance block");
    }
  }
  
}

public class Test{
  public static void main(String[] args) {
    Interface inf = new Interface(){
      public void run(){
      	System.out.println("Running............");
        InnerClass c = new InnerClass();
      }
    };
    
    inf.run();
  }
}
