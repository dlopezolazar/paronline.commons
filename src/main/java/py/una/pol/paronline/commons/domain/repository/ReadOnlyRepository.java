/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.repository;

import java.util.Collection;
import py.una.pol.paronline.commons.domain.entity.Entity;

/**
 *
 * @author dlopez
 * @param <E> Entity
 * @param <T> id type for entity
 */
public interface ReadOnlyRepository<E, T> {
    
    /**
     * check to contains entity from id
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     * get a entity from repository
     * @param id
     * @return
     */
    Entity<T> get(T id);

    /**
     * get a collection all entity
     * @return
     */
    Collection<E> getAll();
}
