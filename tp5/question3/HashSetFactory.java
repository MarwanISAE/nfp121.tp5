package question3;

import java.util.Set;
import java.util.HashSet;

public class HashSetFactory implements Factory {

    public Set create() {
    	return new HashSet();
    }
}