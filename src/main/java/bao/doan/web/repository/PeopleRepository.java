package bao.doan.web.repository; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bao.doan.web.model.People;


@Repository("peopleRepository")
public interface PeopleRepository extends JpaRepository<People, Long>{

}
