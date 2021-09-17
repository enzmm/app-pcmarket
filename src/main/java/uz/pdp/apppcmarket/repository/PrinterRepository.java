package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Printer;
import uz.pdp.apppcmarket.projection.CustomComputer;
import uz.pdp.apppcmarket.projection.CustomPrinter;

@RepositoryRestResource(path = "printer", excerptProjection = CustomPrinter.class)
public interface PrinterRepository extends JpaRepository<Printer, Integer> {
}
