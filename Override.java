class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
	System.out.println("I'm a parent");
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("I'm a child");
    }
}

class Override { 
    public static void main(String[] args) {
	A A1;
        B B1;
        B1.show(); 

	B B1=new B(1,2,3);
	A1=B1;
	A1.show();
    }
}