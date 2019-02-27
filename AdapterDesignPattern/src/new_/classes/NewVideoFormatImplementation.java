package new_.classes;

public class NewVideoFormatImplementation implements NewVideoFormatInterface{

	@Override
	public String play(int identificationNumber) {
		return "Video played from new video provider"+identificationNumber;
	}

}
