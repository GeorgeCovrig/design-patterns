package observer;

public class Person implements InterfaceObserver {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(String email, String sender) {
		System.out.println(name +" received the mail with the content "+ email);

	}


}
