class Foo {
    private boolean firstExe = false;
    private boolean secondExe = false;

    public Foo() {

    }

    public synchronized  void first(Runnable printFirst) throws InterruptedException {      
        printFirst.run();
        firstExe = true;
        notifyAll();
    }

    public synchronized  void second(Runnable printSecond) throws InterruptedException {
        while(!firstExe) wait();
        printSecond.run();
        secondExe = true;
        notifyAll();
    }

    public synchronized  void third(Runnable printThird) throws InterruptedException {
        while(!secondExe) wait();
        printThird.run();        
    }  
}
