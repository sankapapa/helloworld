public class MySecondThread extends Second {
    public static void main(String[] args){

        CottonTask pavanCottonTask=new CottonTask();
        GroundnutTask pavaGroundnutTask =new GroundnutTask();
        MirchiTask pavanMirchiTask=new MirchiTask();
        RiceTask pavanrRiceTask=new RiceTask();
        WheatTask pavanWheatTask=new WheatTask();

        Thread cottonworker=new Thread(pavanCottonTask,"cotton worker thread");
        Thread groundnutworker=new Thread(pavaGroundnutTask, "groundnut worker thread");
        Thread mirchiworker=new Thread(pavanMirchiTask, "mirchi worker thread");
        Thread riceworker=new Thread(pavanrRiceTask,"rice worker thread");
        Thread wheatworker=new Thread(pavanWheatTask,"wheat worker thread");

        cottonworker.start();
        groundnutworker.start();
        mirchiworker.start();
        riceworker.start();
        wheatworker.start();
 
 
        System.out.println("I am done all my tasks");

    }
}
