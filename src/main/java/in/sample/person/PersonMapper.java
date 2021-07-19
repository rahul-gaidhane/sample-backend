package in.sample.person;

public class PersonMapper {

	public static Person toEntity(PersonCreateRequest request) {
		
		Person person = new Person();
		person.setAge(request.getAge());
		person.setGender(request.getGender());
		person.setName(request.getName());
		
		return person;
	}
}
