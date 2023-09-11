import java.util.Comparator;

public class SortByCodigo implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante a, Estudiante b) {
        return a.getCodigo() - b.getCodigo();
    }
}
