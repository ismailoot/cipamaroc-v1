package ma.CipaMaroc.cipamarocboot.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.CipaMaroc.cipamarocboot.bean.SuperCategorie;

@Repository
public interface SuperCategorieDao extends JpaRepository<SuperCategorie, Long> {

}
