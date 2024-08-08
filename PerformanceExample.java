// PerformanceExample:

// In this example, StringBuilder typically performs faster than StringBuffer due to the lack of synchronization overhead. Running this code will usually show that StringBuilder takes less time to complete the appending operations compared to StringBuffer.
public class PerformanceExample {
    public static void main(String[] args) {
        int iterations = 100000;

        // StringBuilder example
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Hello");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");

        // StringBuffer example
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("Hello");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");
    }
}
