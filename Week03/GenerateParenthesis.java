import java.util.ArrayList;
import java.util.List;

/**
 * @author huangzhen
 * @date 2020/6/27 22:34
 * 括号生成
 */
public class GenerateParenthesis {

    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(0, 0, n, "");
        return result;
    }


    private void generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            result.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, s + "(");
        }

        if (right < left) {
            generate(left, right + 1, n, s + ")");
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        Long startTime = System.currentTimeMillis();
        List<String> strings = generateParenthesis.generateParenthesis(3);
        System.out.println(strings);
        System.out.println(strings.size());
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
