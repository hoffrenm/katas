public class MineralFormation {
    public static String formation(int[][] array) {
        boolean hasStalagmite = false;
        boolean hasStalactite = false;

        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] == 1) hasStalactite = true;
            if (array[array.length - 1][i] == 1) hasStalagmite = true;
        }

        if (hasStalagmite && hasStalactite) return "both";

        return hasStalagmite ? "stalagmites" : "stalactites";
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}};
        System.out.println(formation(arr)); // stalactites

        arr = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}};
        System.out.println(formation(arr)); // stalagmites

        arr = new int[][]{
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {0, 1, 1, 1}};
        System.out.println(formation(arr)); // both
    }
}
