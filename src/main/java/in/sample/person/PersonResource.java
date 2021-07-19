package in.sample.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonResource.class);
	
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping
	public ResponseEntity<PersonCreateResponse> create(@RequestBody PersonCreateRequest request) {
		LOGGER.debug("Service to create a person : {}", request);
		
		Person person = PersonMapper.toEntity(request);
		
		Person savedPerson = personRepository.save(person);
		
		PersonCreateResponse response = new PersonCreateResponse(savedPerson.getId());
		
		return new ResponseEntity<PersonCreateResponse>(response, HttpStatus.CREATED);
	}
}
