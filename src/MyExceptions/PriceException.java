package MyExceptions;

import utils.Constants;

public class PriceException extends Exception{
    public PriceException(){
        super(Constants.INCORRECT_PRICE_MSG);
    }
    public PriceException(String str){
        super(str + Constants.NAN_PRICE_MSG);
    }
}
