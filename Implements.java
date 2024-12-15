class a implements Runnable{
    public void run(){
        System.out.println("Hello i'm thread");
    }
}
public class Implements{
    public static void main(String args[]){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}
/*Hello i'm thread
Hello i'm thread */