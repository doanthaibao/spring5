package bao.doan.repository; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
import bao.doan.model.People;


@Repository("peopleRepository")
public interface PeopleRepository extends JpaRepository<People, Long>{

}
