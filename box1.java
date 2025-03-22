class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    boolean equals(Box o) {
        return (o.length == this.length && o.width == this.width && o.height == this.height);
    }
}

public class box1 {
    public static void main(String[] args) {
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(3, 4, 6);
        Box box3 = new Box(1, 2, 3);

        if (box3.equals(box1))
            System.out.println("Box 1 and Box 3 are the same");
        else
            System.out.println("Box 1 and Box 3 are different");

        if (box2.equals(box3))
            System.out.println("Box 2 and Box 3 are the same");
        else
            System.out.println("Box 2 and Box 3 are different");
    }
}