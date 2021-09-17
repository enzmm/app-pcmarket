package uz.pdp.apppcmarket.entity;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class ProductPK implements Serializable {
    @OneToOne
    private Product product;
}
