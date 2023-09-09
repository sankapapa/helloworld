public class MyFirstThread extends First{
    public static void main(String[] args){

        CleanningTask sanjeevaCleanningTask=new CleanningTask();
        CookingTask sanjeevCookingTask =new CookingTask();
        WashingTask sanjeevaWasingTask=new WashingTask();

        Thread cleaningWorker=new Thread(sanjeevaCleanningTask,"cleanningworkerThread");
        Thread cookingWorker=new Thread(sanjeevCookingTask, "cookingworkerThread");
        Thread washingWorker=new Thread(sanjeevaWasingTask, "washingworkerThread");
        cleaningWorker.start();
        cookingWorker.start();
        washingWorker.start();
 
 
        System.out.println("I am done all my tasks");

    }
 


    
}
