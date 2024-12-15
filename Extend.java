class a extends Thread{
    public void run(){
        System.out.println("Hello i'm thread");
    }
}
public class Extend{
    public static void main(String args[]){
        a r=new a();
        Thread s=new Thread(r);
        s.start();
        s.run();
    }
}
/* Hello i'm thread
Hello i'm thread*/