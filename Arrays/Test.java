import java.util.*;

public class Test {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        
        // // Read number of nodes
         int N=2; //= sc.nextInt();
        
        // // Read array P
        int[] A = {1,0,1};//new int[N + 1];
        int[] P = {1,3};//new int[N + 1];
        // for (int i = 1; i <= N; i++) {
        //     P[i] = sc.nextInt();
        // }
        
        // // Read array A
        // int[] A = new int[N + 1];
        // for (int i = 1; i <= N; i++) {
        //     A[i] = sc.nextInt();
        // }
        // N=2;
        // A={0,1};

        // Build tree adjacency list
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }
        
        for (int i = 2; i <= N; i++) {
            tree.get(P[i]).add(i);
        }
        
        // Result array to store sum of covered ranges from root to each node
        int[] result = new int[N + 1];
        
        // Perform DFS traversal from the root node (1)
        dfs(tree, A, result, 1, new ArrayList<>(), 0);
        
        // Calculate the final sum of the results modulo MOD
        long finalResult = 0;
        for (int i = 1; i <= N; i++) {
            finalResult = (finalResult + result[i]) % MOD;
        }
        
        System.out.println(finalResult);
        
        // sc.close();
    }
    
    private static void dfs(List<List<Integer>> tree, int[] A, int[] result, int node, List<int[]> ranges, int sumCoveredRanges) {
        // Add current node's value to the ranges
        int currentValue = A[node];
        List<int[]> newRanges = mergeRanges(ranges, currentValue);
        
        // Number of ranges for the current node
        int numRanges = newRanges.size();
        sumCoveredRanges = (sumCoveredRanges + numRanges) % MOD;
        
        // Store result for the current node
        result[node] = sumCoveredRanges;
        
        // Traverse children
        for (int child : tree.get(node)) {
            dfs(tree, A, result, child, newRanges, sumCoveredRanges);
        }
    }
    
    private static List<int[]> mergeRanges(List<int[]> ranges, int value) {
        List<int[]> newRanges = new ArrayList<>();
        
        // Merge the current value into existing ranges
        int[] newRange = new int[]{value, value};
        
        for (int[] range : ranges) {
            if (newRange[1] + 1 >= range[0] && range[1] + 1 >= newRange[0]) {
                // Merge ranges if they overlap or are adjacent
                newRange[0] = Math.min(newRange[0], range[0]);
                newRange[1] = Math.max(newRange[1], range[1]);
            } else {
                // Add the existing range if there's no overlap
                newRanges.add(range);
            }
        }
        
        // Add the merged new range
        newRanges.add(newRange);
        
        return newRanges;
    }
}
