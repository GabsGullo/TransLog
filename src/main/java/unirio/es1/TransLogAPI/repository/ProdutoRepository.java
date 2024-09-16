package unirio.es1.TransLogAPI.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import unirio.es1.TransLogAPI.domain.Produto;

import java.util.Optional;

@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findById(Long id);
}
