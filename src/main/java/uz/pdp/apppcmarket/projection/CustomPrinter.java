package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Printer;

@Projection(types = Printer.class)
public interface CustomPrinter {

    Integer getCode();
    String getColor();
    Double getPrice();
    String getType();
}
