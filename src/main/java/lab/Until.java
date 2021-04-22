package lab;

import java.util.Random;

public class Until {

    //取得答案陣列
    public static int[] getAns() {
        Random r = new Random();
        int[] ans = {0, 0, 0, 0};
        for (int i = 0; i < ans.length;) {

            int n = r.nextInt(9) + 1;
            boolean exist = isExist(ans, n);
            if(!exist){
                ans[i] = n;
                i++;
            }

        }
        return ans;
    }

    public static boolean isExist(int[] ans, int n) {
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == n) {
                return true;
            }
        }
        return false;
    }
}
