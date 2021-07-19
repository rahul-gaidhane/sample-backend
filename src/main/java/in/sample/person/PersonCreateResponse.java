package in.sample.person;

public class PersonCreateResponse {
	
	public static final String MESSAGE = "Person Create Successfully";

	private Long id;
	
	private String message;

	public PersonCreateResponse(Long id) {
		this.id = id;
		this.message = MESSAGE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
