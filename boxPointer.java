class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    void displayDetails() {
        System.out.println("Box Dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println();
    }
}

public class boxPointer{
    public static void main(String[] args) {
        Box[] boxes = new Box[5];
        boxes[0] = new Box(3.0, 4.0, 5.0);
        boxes[1] = new Box(6.0, 7.0, 8.0);
        boxes[2] = new Box();
        boxes[3] = new Box(2.0, 3.0, 4.0);
	boxes[4] = boxes[0];


        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Details of Box " + (i + 1) + ":");
            boxes[i].displayDetails();
        }
    }
}