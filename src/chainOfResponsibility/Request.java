package chainOfResponsibility;

/**
 * Created by i20762 on 9/15/2017.
 */
public class Request {
    private RequestType type;
    private Float amt;

    public Request(RequestType type, Float amt) {
        this.type = type;
        this.amt = amt;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public Float getAmt() {
        return amt;
    }

    public void setAmt(Float amt) {
        this.amt = amt;
    }
}
