class NoSynchThread extends Thread {
    String msg;

    public NoSynchThread(String s) {
        msg = s;
    }

    public void run() {
        System.out.println(" " + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("]");
    }
}

class NoSynchDemo {
    public static void main(String args[]) {
        NoSynchThread c1 = new NoSynchThread("[1st task");
        NoSynchThread c2 = new NoSynchThread("[2nd task");

        c1.start(); 
        c2.start();
    }
}
