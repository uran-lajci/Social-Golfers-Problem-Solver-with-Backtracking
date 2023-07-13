package SocialGolferProblem;

import java.util.List;

public class Utils {
    public static void printState(int[][] state) {
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
    }

    public static void printWeek(List<List<Integer>> week, int weekNumber) {
        System.out.println("\nGroups of week " + weekNumber);
        for (int i = 0; i < week.size(); i++) {
            for (int j = 0; j < week.get(i).size(); j++) {
                System.out.print(week.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void updateState(int[][] state, List<Integer> group) {
        for (int i = 0; i < group.size(); i++) {
            for (int j = 0; j < group.size(); j++) {
                state[group.get(i)][group.get(j)] = 1;
            }
        }
    }

    public static void returnToPreviousState(int[][] state, List<Integer> group) {
        for (int i = 0; i < group.size(); i++) {
            for (int j = 0; j < group.size(); j++) {
                state[group.get(i)][group.get(j)] = 0;
            }
        }
    }
}
