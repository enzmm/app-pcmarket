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
public class Computer implements Serializable {

    private String ram;
    private String ssd;
    private String videoCard;
    private String hdd;
    private Double price;
    private String screen;

    @EmbeddedId
    ProductPK productPk;

}
