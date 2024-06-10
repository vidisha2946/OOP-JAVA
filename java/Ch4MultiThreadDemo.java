// Write a java program to create two threads and execute simultaneously
    class MyThread extends Thread {
        private String name;
    
        public MyThread(String name) {
            this.name = name;
        }
    
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + name + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    public class Ch4MultiThreadDemo {
        public static void main(String[] args) {
            MyThread thread1 = new MyThread("A");
            MyThread thread2 = new MyThread("B");
    
            thread1.start();
            thread2.start();
        }
    }
