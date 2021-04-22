package lab;

import java.util.Scanner;

public class ABGuessNumber {

    public static void main(String[] args) {
        int[] ans = Until.getAns();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入一組不重複的四位數");
            String guess = sc.next();

            int[] nums = {guess.charAt(0) - 48, guess.charAt(1) - 48, guess.charAt(2) - 48, guess.charAt(3) - 48};

            int a = 0, b = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (ans[i] == nums[j]) {
                        b++;
                    }

                }

            }

            for (int i = 0; i < 4; i++) {
                if (ans[i] == nums[i]) {
                    a++;

                }

            }
            b -= a;
            if(a==4)
            {
            break;}
            System.out.printf("%d A %d B\n", a, b);
        } while (true);
    }
}
