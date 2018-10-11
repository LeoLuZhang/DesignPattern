package templatemethod;

public class LEOTEST {

    public static void main(String[] args) {

        Worker it1 = new ITWorker("Leo1");
        it1.workOneDay();
        Worker it2 = new ITWorker("Leo2");
        it2.workOneDay();
        Worker hr = new ITWorker("Leo3");
        hr.workOneDay();
        Worker qa = new ITWorker("Leo4");
        qa.workOneDay();
        Worker pm = new ITWorker("Leo4");
        pm.workOneDay();

    }

}
