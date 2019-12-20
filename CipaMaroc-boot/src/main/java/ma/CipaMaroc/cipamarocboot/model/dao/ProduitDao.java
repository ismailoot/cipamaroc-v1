package ma.CipaMaroc.cipamarocboot.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.CipaMaroc.cipamarocboot.bean.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

}
