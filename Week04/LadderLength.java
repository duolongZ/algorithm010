import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author:huangzhen
 * @createTime:2020/7/5 21:34
 * @description: 单词接龙
 */
public class LadderLength {


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // 先将 wordList 放到哈希表里，便于判断某个单词是否在 wordList 里
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }

        // 标准写法，总的 visited 数组
        Set<String> visited = new HashSet<>();

        // 分别用左边和右边扩散的哈希表代替单向 BFS 里的队列
        Set<String> beginVisited = new HashSet<>();
        beginVisited.add(beginWord);

        Set<String> endVisited = new HashSet<>();
        endVisited.add(endWord);

        int len = beginWord.length();
        int step = 1;
        while (!beginVisited.isEmpty() && !endVisited.isEmpty()) {
            // 打开以方便调试
            System.out.println("beginVisited => " + beginVisited);
            System.out.println("  endVisited => " + endVisited + "\n");

            // 优先选择小的哈希表进行扩散，考虑到的情况更少
            if (beginVisited.size() > endVisited.size()) {
                Set<String> temp = beginVisited;
                beginVisited = endVisited;
                endVisited = temp;
            }
            System.out.println("beginVisited  reserver=> " + beginVisited);
            System.out.println("  endVisited reserver=> " + endVisited + "\n");
            // 逻辑到这里，保证 beginVisited 是相对较小的集合
            // nextLevelVisited 在扩散完成以后，会成为新的 beginVisited
            Set<String> nextLevelVisited = new HashSet<>();
            for (String word : beginVisited) {
                char[] charArray = word.toCharArray();
                for (int i = 0; i < len; i++) {
                    char originChar = charArray[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (originChar == c) {
                            continue;
                        }
                        charArray[i] = c;
                        String nextWord = String.valueOf(charArray);
                        System.out.println("=====>" + nextWord);
                        if (wordSet.contains(nextWord)) {
                            if (endVisited.contains(nextWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                nextLevelVisited.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    // 恢复，下次再用
                    charArray[i] = originChar;
                }
            }
            System.out.println("visited===>>>" + visited);
            // 这一行代表表示从 begin 这一侧向外扩散了一层
            beginVisited = nextLevelVisited;
            step++;
        }
        return 0;
    }

    public int ladderLengthNo2(String beginWord, String endWord, List<String> wordList) {
        // 先将 wordList 放到哈希表里，便于判断某个单词是否在 wordList 里
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordList.size() == 0 || !wordList.contains(endWord)) {
            return 0;
        }
        // 标准写法，总的 visited 数组
        Set<String> visited = new HashSet<>();

        Set<String> beginVisited = new HashSet<>();
        beginVisited.add(beginWord);
        Set<String> endVisited = new HashSet<>();
        endVisited.add(endWord);

        int len = beginWord.length();
        int stp = 1;
        while (!beginVisited.isEmpty() && !endVisited.isEmpty()) {
            Set<String> nextLevelVisited = new HashSet<>();
            for (String word : beginVisited) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < len; i++) {
                    char aChar = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (aChar == c) {
                            continue;
                        }
                        chars[i] = c;
                        String nextWord = String.valueOf(chars);
                        if (wordSet.contains(nextWord)){
                            if (endVisited.contains(nextWord)){
                                return stp+1;
                            }
                            if (!visited.contains(nextWord)){
                                visited.add(nextWord);
                                nextLevelVisited.add(nextWord);
                            }
                        }

                    }
                    //恢复,下次使用
                    chars[i] = aChar;
                }
            }
            beginVisited = nextLevelVisited;
            stp++;
        }

        return 0;
    }
}
