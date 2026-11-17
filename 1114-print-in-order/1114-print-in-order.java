class Foo {
    private boolean firstExe = false;
    private boolean secondExe = false;

    public Foo() {

    }

    public synchronized  void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstExe = true;
        notifyAll();
    }

    public synchronized  void second(Runnable printSecond) throws InterruptedException {
        while(firstExe==false) wait();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondExe = true;
        notifyAll();
    }

    public synchronized  void third(Runnable printThird) throws InterruptedException {
        while(secondExe == false) wait();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        
        
    }

   
}
