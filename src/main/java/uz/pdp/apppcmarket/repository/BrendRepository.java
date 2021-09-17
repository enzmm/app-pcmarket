package uz.pdp.apppcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.apppcmarket.entity.Brend;
import uz.pdp.apppcmarket.projection.CustomBrend;
import uz.pdp.apppcmarket.projection.CustomCategory;

@RepositoryRestResource(path = "brend", excerptProjection = CustomBrend.class)
public interface BrendRepository extends JpaRepository<Brend, Integer> {
}
