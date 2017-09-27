package chainOfResponsibility;

/**
 * Created by i20762 on 9/15/2017.
 */
public class Director extends Handler {


    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE){
            System.out.println("Purchase Handled by Director");
        }

        else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
