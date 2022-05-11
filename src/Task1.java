public class Task1 {
    public static void main(String[] args) {
        int[][] multiplication = new int[10][10];
        for (int i = 0; i < 10; i++)
        {
            for (int f = 0; f < 10; f++) {
                multiplication[i][f]=(i+1)*(f+1);
                System.out.println((i+1)+" * "+(f+1)+ " = " + multiplication[i][f] );
            }
        }
    }
}
