package camrod.papeleriaboli.repository;
import camrod.papeleriaboli.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}