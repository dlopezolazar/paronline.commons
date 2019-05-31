/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.service;

import py.una.pol.paronline.commons.domain.repository.Repository;

/**
 *
 * @author dlopez
 * @param <E>
 * @param <T>
 */
public class ReadOnlyBaseService<E, T> {
    
    private Repository<E, T> repository;

    ReadOnlyBaseService(Repository<E, T> repository) {
        this.repository = repository;
    }
    
}
