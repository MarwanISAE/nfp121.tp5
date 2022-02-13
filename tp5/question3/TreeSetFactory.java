package question3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory implements Factory{
    public Set create() {
        	return new TreeSet();
        }
}
