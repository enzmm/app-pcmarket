package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Monitor;
import uz.pdp.apppcmarket.projection.CustomComputer;
import uz.pdp.apppcmarket.projection.CustomMonitor;

@RepositoryRestResource(path = "monitor", excerptProjection = CustomMonitor.class)
public interface MonitorRepository extends JpaRepository<Monitor,Integer> {
}
