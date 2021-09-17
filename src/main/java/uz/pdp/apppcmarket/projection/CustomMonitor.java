package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.Monitor;

@Projection(types = Monitor.class)
public interface CustomMonitor {

    String getScreen();
    String getScreenSize();
    Double getPrice();
}
