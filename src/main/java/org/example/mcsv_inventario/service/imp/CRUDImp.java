package org.example.mcsv_inventario.service.imp;
import org.example.mcsv_inventario.repo.GenericRepo;
import org.example.mcsv_inventario.service.ICRUD;

import java.util.List;


public abstract class CRUDImp<T, ID> implements ICRUD<T, ID> {

    protected abstract GenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) {
        return getRepo().save(t);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public void delete(ID id) {
        getRepo().deleteById(id);
    }
}
