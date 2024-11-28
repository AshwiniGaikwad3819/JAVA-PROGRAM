//Interfac
  interface I1 {
    public void show();
  }
    interface I2{
        public void display();
    }
    class Test implements I1,I2{

        @Override
        public void show(){
            System.out.print("Hello java");
        }
        @Override
        public void display(){
            System.out.print("Hello Ashwini");
        }
        public class main{
            
        }
          public static void main(String[] args) {
              Test t=new Test();
              t.show();
              t.display();
          }
        }

    
    
    

