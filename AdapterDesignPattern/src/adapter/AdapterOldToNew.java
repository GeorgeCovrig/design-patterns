package adapter;

import new_.classes.NewVideoFormatImplementation;
import old.classes.VideoStreamingInterface;

public class AdapterOldToNew implements VideoStreamingInterface{
	private NewVideoFormatImplementation newVideoFormatImpl=new NewVideoFormatImplementation();
	@Override
	public String playVideo(String name) {
		int id = findIdentificationByName(name);
		return newVideoFormatImpl.play(id);
	}
	private int findIdentificationByName(String name) {
		if(name.equals("Olaaa")) {
			return 2;
		}
		return 0;
		
	}

}
