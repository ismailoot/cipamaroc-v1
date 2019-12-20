package ma.CipaMaroc.cipamarocboot.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.CipaMaroc.cipamarocboot.bean.TypePaiement;

@Repository
public interface TypePaiementDao extends JpaRepository<TypePaiement, Long>{

}
