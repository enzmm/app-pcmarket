package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Computer;
import uz.pdp.apppcmarket.projection.CustomCategory;
import uz.pdp.apppcmarket.projection.CustomComputer;

@RepositoryRestResource(path = "computer",  excerptProjection = CustomComputer.class)
public interface ComputerRepository extends JpaRepository<Computer,Integer> {
}
