package andraina.projects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import andraina.projects.entity.AccountDo;

@Repository
public interface AccountRepository extends JpaRepository<AccountDo, Long>{

}
