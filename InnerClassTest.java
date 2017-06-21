
public class InnerClassTest{
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

// Declare an interface with an Inner Class
interface Interface {
  // interface abstract method
  void run();
  
  // inner class definition.
  class InnerClass{
    static{
    	System.out.println("InnerClass static block");
    }
    {
    	System.out.println("InnerClass instance block");
    }
  }
  
}
