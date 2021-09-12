package hystannasa.mirea.helloworld;

import java.lang.Exception;

public class IllegalNameException extends Exception {
    IllegalNameException(String str) {
        super(str);
    }
}
