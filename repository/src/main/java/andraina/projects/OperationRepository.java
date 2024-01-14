package andraina.projects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import andraina.projects.entity.OperationDo;

@Repository
public interface OperationRepository extends JpaRepository<OperationDo, Long>{

}
