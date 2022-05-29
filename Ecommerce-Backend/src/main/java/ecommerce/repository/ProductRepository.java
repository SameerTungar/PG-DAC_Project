package ecommerce.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.entities.Product;
import ecommerce.entities.Seller;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findBySeller(Seller sellerId, Sort sort);

	List<Product> findByPcat(String pcat, Sort sort);
}
