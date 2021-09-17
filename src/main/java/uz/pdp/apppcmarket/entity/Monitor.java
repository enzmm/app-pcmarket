package uz.pdp.apppcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Monitor implements Serializable {

    private String screen;
    private String screenSize;
    private Double price;

    @EmbeddedId
    ProductPK productPk;
}
