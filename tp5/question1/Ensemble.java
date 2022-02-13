package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        if (t != null && !table.contains(t)) {
            table.add(t);
            return true;
        }
        return false;
    }

    public Ensemble<T> union(Ensemble<T> e) {
        System.out.println("entered union");
        Ensemble<T> unionE = new Ensemble<T>();
        if (table.size() != 0) {
            unionE.addAll(table);
        }
        if (e.size() != 0) {
            unionE.addAll(e);
        }
        return unionE;
    }

    public Ensemble<T> inter(Ensemble<T> e) {
        Ensemble<T> interE = new Ensemble<T>();
        if (table.size() != 0 && e.size() != 0) {
            Iterator itr = iterator();
            while (itr.hasNext()) {
                Object value = itr.next();
                if (e.contains(value)) {
                    interE.add((T) value);
                }
            }
        }
        return interE;
    }

    public Ensemble<T> diff(Ensemble< T> e) {
        Ensemble<T> interE = new Ensemble<T>();
        if (table.size() != 0 && e.size() != 0) {
            Iterator itr = iterator();
            while (itr.hasNext()) {
                Object value = itr.next();
                if (!e.contains(value)) {
                    interE.add((T) value);
                }
            }
        }
        return interE;
    }

    Ensemble<T> diffSym(Ensemble<T> e) {
       Ensemble<T> interE = new Ensemble<T>();
        if (table.size() != 0 && e.size() != 0) {
            Iterator itr = iterator();
            while (itr.hasNext()) {
                Object value = itr.next();
                if (!e.contains(value)) {
                    interE.add((T) value);
                }
            }
            Iterator itr2 = e.iterator();
            while (itr2.hasNext()) {
                Object value = itr2.next();
                if (!table.contains(value)) {
                    interE.add((T) value);
                }
            }
        }
        return interE;
    }

}
