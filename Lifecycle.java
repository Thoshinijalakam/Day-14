public class Lifecycle {
    public static void main(String args[]){
        System.out.println("Thread Started...");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Iterrupted");
        }
        System.out.println("Thread resumed");
    }    
}
/* Thread Started...
Thread resumed */