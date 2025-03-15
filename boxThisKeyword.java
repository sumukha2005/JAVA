//Demonstration of this keyword

class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
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

public class boxThisKeyword{
    public static void main(String[] args) {
        Box[] boxes = new Box[2];
        boxes[0] = new Box(3.0, 4.0, 5.0);
        boxes[1] = new Box(6.0, 7.0, 8.0);



        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Details of Box " + (i + 1) + ":");
            boxes[i].displayDetails();
        }
    }
}