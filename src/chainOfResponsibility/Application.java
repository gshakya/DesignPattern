package chainOfResponsibility;

/**
 * Created by i20762 on 9/26/2017.
 */
public class Application {

    public static void main(String[] args) {
        Director gunjan = new Director();
        VP poojan = new VP();
        CEO sudhir = new CEO();

        gunjan.setSuccessor(poojan);
        poojan.setSuccessor(sudhir);

        Request request = new Request(RequestType.PURCHASE, (float) 2000);

        gunjan.handleRequest(request);
        request = new Request(RequestType.TRAVEL, (float) 6000);
        gunjan.handleRequest(request);
        request = new Request(RequestType.TRAVEL, (float) 5000);
        gunjan.handleRequest(request);


    }
}
