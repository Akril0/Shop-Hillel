package MyExceptions;

import utils.Constants;

public class QuantityException extends Exception{
    public QuantityException(){
        super(Constants.INCORRECT_QUANTITY_MSG);
    }
    public QuantityException(String str){
        super(str + Constants.NAN_QUANTITY_MSG);
    }
}
