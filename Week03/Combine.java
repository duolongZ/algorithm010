import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author huangzhen
 * @date 2020/6/28 22:34
 * 组合
 */
public class Combine {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || n < k) {
            return result;
        }
        findCombinations(n, k, 1, new Stack<>());
        return result;
    }

    private void findCombinations(int n, int k, int index, Stack<Integer> p) {
        if (p.size() == k) {
            result.add(new ArrayList<>(p));
            return;
        }
        for (int i = index; i <= n - (k - p.size()) + 1; i++) {
            p.push(i);
            findCombinations(n, k, i + 1, p);
            p.pop();
        }

    }

    public static void main(String[] args) {
        Combine combine = new Combine();
        List<List<Integer>> combine1 = combine.combine(4, 2);
        System.out.println(combine1);
    }
}
