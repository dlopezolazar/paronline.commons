/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.service;

import java.util.Collection;
import py.una.pol.paronline.commons.domain.repository.Repository;

/**
 *
 * @author dlopez
 * @param <E>
 * @param <T>
 */
public abstract class BaseService<E, T> extends ReadOnlyBaseService<E, T> {
    
    private Repository<E, T> _repository;

    public BaseService(Repository<E, T> repository) {
        super(repository);
        _repository = repository;
    }

    /**
     *
     * @param entity
     * @throws Exception
     */
    public void add(E entity) throws Exception {
        _repository.add(entity);
    }

    /**
     *
     * @return
     */
    public Collection<E> getAll() {
        return _repository.getAll();
    }
    
}
