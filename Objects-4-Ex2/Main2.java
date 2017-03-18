package Static;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kondz on 18.03.2017.
 */
public class Main2 {


    public static void main(String[] args) {

        Kot k1 = new Kot();
        System.out.println(k1.dajGlos());
        List<Glos> lista = new ArrayList<Glos>();
        lista.add(new Kot());
        lista.add(new Kot());
        lista.add(new Pies());
        for (Glos m : lista) {

            System.out.println(m.dajGlos());
        }
        }

}

