package ma.CipaMaroc.cipamarocboot.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.CipaMaroc.cipamarocboot.bean.Paiement;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long>{

}
