package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    private List<String> noms;

    public IteratorDemo() {
        noms = new ArrayList<>();
        // add 40 names in the list
        for (int i = 1; i <= 40; i++) {
            noms.add("Name" + i);
        }
    }

    public int size(){
        return this.noms.size();
    }

    public String get(int i){
        return this.noms.get(i);
    }

    public static void main(String[] args) {
        IteratorDemo t = new IteratorDemo();
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i));
        }

        for (String nom : t.noms){
            System.out.println(nom);
        }

        Iterator<String> it = t.noms.iterator();
        while (it.hasNext()){
            String nom = it.next();
            System.out.println(nom);
        }



    }
}
