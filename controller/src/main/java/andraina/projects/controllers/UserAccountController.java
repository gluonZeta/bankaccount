package andraina.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import andraina.projects.UserAccountService;
import andraina.projects.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserAccountController {
	
	@Autowired
	UserAccountService userAccountService;
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<?> requestError(Exception e){
		String errorMessage = "The user doesn't have an account or your informations is wrong !!";
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
	}
	
	// To retrive operation history
	@GetMapping("/history")
	public ResponseEntity<?> getOperations(
			@RequestParam String firstname, 
			@RequestParam String code){
		return ResponseEntity.ok(userAccountService.getOperationHistory(firstname, code));
	}
	

	// to do deposit or withdrawal operation
	@GetMapping("/operation")
	public ResponseEntity<?> doOperation(@RequestParam String firstname, 
			@RequestParam String code, 
			@RequestParam String amount,
			@RequestParam String operationType){
		UserDto userDto = userAccountService.operation(firstname, code, amount, operationType);
		return ResponseEntity.ok(userDto);
	}
	
	// To get User Account Information
	@GetMapping("/userAccountInfo")
	public ResponseEntity<?> getUserAccountInformations(
			@RequestParam String firstname, 
			@RequestParam String code) {
		
		UserDto userDto = userAccountService.getUserAccountInformations(firstname, code);
		return ResponseEntity.ok(userDto);
		
	}


}
