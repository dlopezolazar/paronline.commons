/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.entity;

/**
 *
 * @author dlopez
 * @param <T>
 */
public abstract class BaseEntity<T> extends Entity<T> {
    
     private boolean modified;

    /**
     *
     * @param id
     * @param nombre
     */
    public BaseEntity(T id, String nombre) {
        super.id = id;
        super.nombre = nombre;
        modified = false;
    }

    /**
     *
     * @return
     */
    public boolean isModified() {
        return modified;
    }
    
}
