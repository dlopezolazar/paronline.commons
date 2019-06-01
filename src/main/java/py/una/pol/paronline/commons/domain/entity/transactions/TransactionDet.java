/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.entity.transactions;

import java.math.BigDecimal;
import lombok.Data;
import py.una.pol.paronline.commons.domain.entity.Entity;

/**
 *
 * @author dlopez
 */
@Data
public class TransactionDet extends Entity<Integer>{
    
    private Integer transaction;
    private Integer item;
    private Integer product;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal subTotal;
    

    public TransactionDet(Integer transaction, Integer item, Integer product, Integer quantity, BigDecimal price, BigDecimal subTotal) {
        this.transaction = transaction;
        this.item = item;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.subTotal = subTotal;
    }
    
    
}
