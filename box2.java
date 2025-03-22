class Box {
	double length, width, height;
	
	Box(double l, double w, double h) {
        	length = l;
        	width = w;
		height = h;
	}
	Box(Box ob){
        	length = ob.length;
        	width = ob.width;
		height = ob.height;
	}

}

public class box2 {
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