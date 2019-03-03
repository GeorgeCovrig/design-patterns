package observer;

public class PersonGenerics implements InterfaceObserverGenerics<String> {
	String name;

	public PersonGenerics(String name) {
		this.name = name;
	}

	@Override
	public void update(String email, String sender) {
		System.out.println(name +" received the mail with the content "+ email);

	}



}
