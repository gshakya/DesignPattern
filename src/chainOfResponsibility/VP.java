package chainOfResponsibility;

/**
 * Created by i20762 on 9/26/2017.
 */
public class VP extends Handler  {
    @Override
    public void handleRequest(Request request) {
         if (request.getType() == RequestType.TRAVEL && request.getAmt() > 5000){
             System.out.println("Request for Travel and Amount of "+request.getAmt()+ " handled by VP");
         }
         else{
             this.getSuccessor().handleRequest(request);
         }
    }
}
