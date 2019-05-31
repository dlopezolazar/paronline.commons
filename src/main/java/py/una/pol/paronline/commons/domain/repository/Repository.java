/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.repository;

/**
 *
 * @author dlopez
 * @param <E> Entity
 * @param <T> id type for entity
 */
public interface Repository<E, T> extends ReadOnlyRepository<E, T> {
    
    /**
     * Add a new entity in to repository
     * @param entity
     */
    void add(E entity);

    /**
     * remove a entity from repository
     * @param id
     */
    void remove(T id);

    /**
     * update a entity from repository
     * @param entity
     */
    void update(E entity);
}
