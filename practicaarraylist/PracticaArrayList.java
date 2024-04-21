
package practicaarraylist;

import java.util.ArrayList;
import java.util.List;


public class PracticaArrayList {

   
    public static void main(String[] args) {
        List<Personas> lista = new ArrayList <Personas> ();
        lista.add(new Personas("German"));
        lista.add(new Personas("Gerardo"));
        lista.add(new Personas("Geremias"));
        lista.add(new Personas("Geronimo"));
        
        for (int i = 0; i<lista.size(); i++){
            System.out.println("Nombres: "+ lista.get(i).getPersona());
        }
    }
    
}
