package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Brend;

@Projection(types = Brend.class)
public interface CustomBrend {
    Integer getId();
    String getName();
}
