package lab9;

import java.util.ArrayList;
import java.util.List;

public class ManagePicture {
	private List<Picture> pictureList;

	public ManagePicture() {
		pictureList = new ArrayList<>();
	}

	public void addPicture(Picture picture) {
		pictureList.add(picture);
	}

	public void removePicture(Picture picture) {
		pictureList.remove(picture);
	}

	public List<Picture> getPictureList() {
		return pictureList;
	}

	public String getAllPictureInfo() {
		StringBuilder sb = new StringBuilder();
		for (Picture picture : pictureList) {
			sb.append(picture.toString()).append("\n\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

	}
}
