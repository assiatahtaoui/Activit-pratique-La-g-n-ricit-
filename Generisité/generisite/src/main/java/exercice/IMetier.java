package exercice;

import java.util.List;

public interface IMetier <T> {
    void add(T produit);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}
