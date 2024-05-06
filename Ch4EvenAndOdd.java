
    class Even implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < 20; i++) {
                if (i%2!=0) {
                    System.out.println("Even number : "+i);
                }
            }
        }
    }
    
    class Odd implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < 20; i++) {
                if (i%2==0) {
                    System.out.println("Odd number : "+i);
                }
            }
        }
    }
    
    public class Ch4EvenAndOdd {
        public static void main(String[] args) {
            Thread Even = new Thread(new Even());
            Thread Odd = new Thread(new Odd());
    
            Even.start();
            Odd.start();
        }
    }
