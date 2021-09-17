package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Computer;

@Projection(types = Computer.class)
public interface CustomComputer {

    String getRam();
    String getSsd();
    String getVideoCard();
    String getHdd();
    Double getPrice();
    String getScreen();
}
