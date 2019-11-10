package project;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieTask2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for (int i = 0; i < inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int sum = 1;
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        outer:
        for (int j = 1; sum > 0; j++) {
            for (int i = 0; i < inhabitants.length; i++) {
                if (i < inhabitants.length - 1 && i > 0) {
                    if (inhabitants[i] != 0 && (inhabitants[i + 1] == 0 || inhabitants[i - 1] == 0)) {
                        inhabitants[i] /= 2;
                    }
                }
                else if (i == 0) {
                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                        inhabitants[i] /= 2;
                    }
                }
                else if (i == inhabitants.length - 1) {
                    if (inhabitants[i] != 0 && inhabitants[i - 1] == 0) {
                        inhabitants[i] /= 2;
                    }
                }
            }
            System.out.println("Day " + j + " " + Arrays.toString(inhabitants));
            sum = 0;
            for (int inhabitant : inhabitants) {
                sum += inhabitant;
            }
            if (sum == 0) {
                break outer;
            }
        }
    }
}

