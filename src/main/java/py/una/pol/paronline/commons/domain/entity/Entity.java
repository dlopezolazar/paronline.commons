/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.entity;

import lombok.Data;

/**
 *
 * @author dlopez
 */
@Data
public class Entity<T> {
    
    public T id;
    public String nombre;
}
