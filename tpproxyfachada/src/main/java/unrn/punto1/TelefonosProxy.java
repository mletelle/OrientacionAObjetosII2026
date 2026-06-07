package unrn.punto1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class TelefonosProxy implements Set<Telefono> {
    private PersonaDao dao;
    private int idPersona;
    private Set<Telefono> telefonos;

    public TelefonosProxy(PersonaDao dao, int idPersona) {
        this.dao = dao;
        this.idPersona = idPersona;
    }

    private Set<Telefono> telefonos() {
        if (telefonos == null) {
            telefonos = dao.telefonosPorIdPersona(idPersona);
        }
        return telefonos;
    }

    @Override
    public int size() {
        return telefonos().size();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return telefonos().toArray(a);
    }

    /***/
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Telefono> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Telefono telefono) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Telefono> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}