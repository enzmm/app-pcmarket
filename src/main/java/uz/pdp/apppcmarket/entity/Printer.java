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
public class Printer implements Serializable {


    private Integer code;
    private String color;
    private Double price;
    private String type;
    @EmbeddedId
    ProductPK productPk;
}
