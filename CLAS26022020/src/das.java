public class das {
    public static void main (String [] args ) {
        int[][] ages = new int[2][];
        ages[0] = new int[]{2, 78, 23, 45};
        ages[1] = new int[]{13, 34, 34};
        for (int i = 0; i < ages.length; ++i) {
            for (int j = 0; j < ages[i].length; ++j) {
                System.out.print(ages[i][j] + ", ");
            }
            System.out.println();
        }
    }}