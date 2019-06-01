/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.una.pol.paronline.commons.domain.entity.transactions;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import py.una.pol.paronline.commons.domain.entity.BaseEntity;

/**
 *
 * @author dlopez
 */
@Data
public class Transaction extends BaseEntity<Integer>{
    
    private Date date;
    private Integer client;
    private BigDecimal total;
    private String address;
    private Integer paymentMethod;
    private String cardNumber;
    private String state;
    
    
    public Transaction(Integer id, String nombre) {
        super(id, nombre);
    }

    public Transaction(Integer id, String nombre, Date date, Integer client, BigDecimal total, String address, Integer paymentMethod, String cardNumber, String state ) {
        super(id, nombre);
        this.date = date;
        this.client = client;
        this.total = total;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.state = state;
    }
    
    
    
}
