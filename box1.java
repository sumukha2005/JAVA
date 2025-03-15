class Box {
    double length, width, height;

   
    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    
    double calculateVolume() {
        return length * width * height;
    }
    
    double calculateSurfaceArea(){
	return 2*(length*width + length*height + width*height);	
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

public class box1{
    public static void main(String[] args) {
      
        Box[] boxes = new Box[2]; 
	boxes[0] = new Box(3.0, 4.0, 5.0);  
        boxes[1] = new Box(6.0, 7.0, 8.0);  


        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Details of Box " + i + 1 + ":");
            boxes[i].displayDetails();
        }
    }
}
