package pr15;

public class VecException extends Throwable {
    private String mes;
    public VecException(String s) {
        this.mes=s;
    }

    public String message(){
        return mes;
    }
}
