interface Animal {
    void makesound();
    void eat();
}

class Dog implements Animal {
    public void makesound() {
        System.out.println("Bow...Bow!");
    }

    public void eat() {
        System.out.println("Dog is eating...");
    }
}
