public class Greeting2 {
    public static void main(String args[]){
        while(true){
            System.out.println("good morning");
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("good afternoon");
            try{
                Thread.sleep(7000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("good evening");
            try{
                Thread.sleep(9000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("good night");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
                }
    }
    
}
