package practice.algorithms;

public class KMPAlgorithm {

    public static void main(String[] args) {
        String input="abracadabra";
        String pattern="cada";
        int index=search(input,pattern);
        System.out.println("Index is "+index);
    }

    private static int search(String input, String pattern) {
        int[] lsp = computeLspTable(pattern);

        int j = 0;  // Number of chars matched in pattern
        for (int i = 0; i < input.length(); i++) {
            while (j > 0 && input.charAt(i) != pattern.charAt(j)) {
                // Fall back in the pattern
                j = lsp[j - 1];  // Strictly decreasing
            }
            if (input.charAt(i) == pattern.charAt(j)) {
                // Next char matched, increment position
                j++;
                if (j == pattern.length())
                    return i - (j - 1);
            }
        }
        return -1;  // Not found
    }

    private static int[] computeLspTable(String pattern) {
        int[] lsp = new int[pattern.length()];
        lsp[0] = 0;  // Base case
        for (int i = 1; i < pattern.length(); i++) {
            // Start by assuming we're extending the previous LSP
            int j = lsp[i - 1];
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j))
                j = lsp[j - 1];
            if (pattern.charAt(i) == pattern.charAt(j))
                j++;
            lsp[i] = j;
        }
        return lsp;
    }


}
