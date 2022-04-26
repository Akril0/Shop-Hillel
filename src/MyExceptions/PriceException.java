package MyExceptions;

import utils.Constants;

public class PriceException extends Exception{
    public PriceException(){
        System.out.println(Constants.INCORRECT_PRICE_MSG);
    }
    public PriceException(String str){
        System.out.println(str + Constants.NAN_PRICE_MSG);
    }
}
