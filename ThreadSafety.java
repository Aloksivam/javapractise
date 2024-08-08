// In the StringBuilder section, since it is not thread-safe, the final length of the StringBuilder object might not be exactly 2 * iterations due to race conditions.
// In the StringBuffer section, the final length of the StringBuffer object should be exactly 2 * iterations because StringBuffer is synchronized and thread-safe, preventing race conditions.
public class ThreadSafety{
    public static void main(String[] args) throws InterruptedException {
        int iterations = 10000;

        // StringBuilder example
        StringBuilder sb = new StringBuilder();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < iterations; i++) {
                sb.append("A");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < iterations; i++) {
                sb.append("B");
            }
        });
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        
        System.out.println("StringBuilder length: " + sb.length()); // May not be 2 * iterations

        // StringBuffer example
        StringBuffer sbf = new StringBuffer();
        thread1 = new Thread(() -> {
            for (int i = 0; i < iterations; i++) {
                sbf.append("A");
            }
        });
        thread2 = new Thread(() -> {
            for (int i = 0; i < iterations; i++) {
                sbf.append("B");
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("StringBuffer length: " + sbf.length()); // Should be 2 * iterations
    }
}
