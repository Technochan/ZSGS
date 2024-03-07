package zoho_graduate_Studies;

import java.util.ArrayList;
import java.util.List;

public class question30 {
	public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        List<List<Integer>> ans = check(mat, 0, 0);

        for (List<Integer> innerList : ans) {
                System.out.print(innerList );
            System.out.println();
        }
    }

    public static List<List<Integer>> check(int[][] mat, int rowValue, int colValue) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int row = rowValue;
        int col = colValue;

        while (row < mat.length && col >= 0) {
            arr.add(mat[row++][col--]);
        }

        res.add(arr);
        if (colValue < mat.length - 1) {
            res.addAll(check(mat, 0, colValue + 1));
        } else if (rowValue < mat.length - 1) {
            res.addAll(check(mat, rowValue + 1, mat.length - 1));
        }
        return res;
    }
}
