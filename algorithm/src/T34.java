import java.util.Arrays;

public class T34 {

    public static void main(String[] args) {
        int[][] wallets = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] wallets2 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution(wallets2));
    }

    static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            Arrays.sort(size);
        }

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if (maxW < w){
                maxW = w;
            }
            if (maxH < h) {
                maxH = h;
            }
        }

        return maxH * maxW;
    }
}


