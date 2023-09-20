
class T_Soojebi extends Thread{
  public void run(){
    System.out.println("Run");
  }
}
public class soojebi2{
  public static void main(String[] args){
    Thread t1 = new T_Soojebi( );
    Thread t2 = new Thread(new T_Soojebi( ));
    t1.start();
    t2.start();
    System.out.println("Main");
  }
}
