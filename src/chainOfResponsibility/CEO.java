package chainOfResponsibility;

/**
 * Created by i20762 on 9/26/2017.
 */
public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TRAVEL && request.getAmt() <= 5000){
            System.out.println("Request Handled by CEO of Amount "+ request.getAmt());
        }

        else {
            System.out.println("Request can't be assigned");
        }
    }
}
