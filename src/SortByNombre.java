import java.util.Comparator;

public class SortByNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante a, Estudiante b) {
        int res = String.CASE_INSENSITIVE_ORDER.compare(a.getNombre(),b.getNombre());
        if (res == 0){
            res = a.getNombre().compareTo(b.getNombre());
        }
        return res;
    }
}
