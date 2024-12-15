public class Lambda {
    public static void main(String args[]){
        Runnable r=()->System.out.println("I am new fro java8 version");
        Thread t=new Thread(r);
        t.start();
    }
    
}
/* I am new fro java8 version */
