package andraina.projects.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import andraina.projects.UserAccountServicImpl;
import andraina.projects.UserAccountService;
import andraina.projects.UserRepository;
import andraina.projects.entity.AccountDo;
import andraina.projects.entity.UserDo;

@SpringBootTest
@ContextConfiguration(classes = {UserAccountServicImpl.class})
class UserAccountServicImplTest {
	
	@Autowired
	private UserAccountService userAccountService;
	
	@MockBean
	private UserRepository userRepository;
	
	@BeforeEach
	void setUp() {
		UserDo userDo = new UserDo("BONZ", "Henry", "1234");
		AccountDo accountDo = new AccountDo(2400l,userDo);
		userDo.setAccountDo(accountDo);
		Mockito.when(userRepository.findByFirstnameAndCode("Henry", "1234")).thenReturn(userDo);
	}

	

}
