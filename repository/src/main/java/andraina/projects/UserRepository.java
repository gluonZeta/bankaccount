package andraina.projects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import andraina.projects.entity.UserDo;

@Repository
public interface UserRepository extends JpaRepository<UserDo, Long> {
	UserDo findByFirstnameAndCode(String firstname, String code);
}
