package MyExceptions;

import utils.Constants;

public class EmptyNameException extends Exception{
    public EmptyNameException (){
        super(Constants.EMPTY_NAME_MSG);
    }
}
