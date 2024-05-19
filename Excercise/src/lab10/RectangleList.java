package lab10;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RectangleList {
	private List<Rectangle> rectangles;

	public RectangleList() {
		rectangles = new ArrayList<>();
	}

	// Thêm hình chữ nhật vào danh sách
	public void addRectangle(Rectangle rectangle) {
		rectangles.add(rectangle);
	}

	// Trả về danh sách các hình chữ nhật
	public List<Rectangle> getRectangles() {
		return rectangles;
	}
}
