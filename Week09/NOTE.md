学习笔记

Rabin-Karp算法

算法思想

1. 假设子串的长度为M（pat），目标字符串的长度为N（txt）
2. 计算子串的hash值hash_pat
3. 计算目标字符串txt中每个长度为M的子串的hash值（共需要计算N-M+1次）
4. 比较hash值：如果hash值不同，字符串必然不匹配；如果hash值相同，还需要使用朴素算法再次判断

<p><strong>参考链接</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/climbing-stairs/" rel="nofollow">爬楼梯</a>（阿里巴巴、腾讯、字节跳动在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/unique-paths/" rel="nofollow">不同路径</a>（亚马逊、微软、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/house-robber/" rel="nofollow">打家劫舍</a>（字节跳动、谷歌、苹果在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/minimum-path-sum/" rel="nofollow">最小路径和</a>（字节跳动、谷歌、亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/" rel="nofollow">股票买卖</a>（字节跳动、亚马逊、Facebook 在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/min-cost-climbing-stairs/" rel="nofollow">使用最小花费爬楼梯</a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/edit-distance/" rel="nofollow">编辑距离</a>（字节跳动、亚马逊、谷歌在半年内面试中考过）</li>
</ul>


<blockquote>
<p><strong>参考链接</strong></p>
<ul>
<li><a href="https://lemire.me/blog/2017/07/07/are-your-strings-immutable/" rel="nofollow">不可变字符串</a></li>
<li><a href="https://shimo.im/docs/5kykuLmt7a4DdjSP" rel="nofollow"> Atoi 代码示例</a></li>
<li><a href="https://www.ruanyifeng.com/blog/2013/05/boyer-moore_string_search_algorithm.html" rel="nofollow"> Boyer-Moore 算法</a></li>
<li><a href="https://blog.csdn.net/u012505432/article/details/52210975" rel="nofollow"> Sunday 算法</a></li>
<li><a href="https://shimo.im/docs/8G0aJqNL86wWrPUE" rel="nofollow">字符串匹配暴力法代码示例</a></li>
<li><a href="https://shimo.im/docs/1wnsM7eaZ6Ab9j9M" rel="nofollow"> Rabin-Karp 代码示例</a></li>
<li><a href="https://www.bilibili.com/video/av11866460?from=search&amp;seid=17425875345653862171" rel="nofollow"> KMP 字符串匹配算法视频</a></li>
<li><a href="http://www.ruanyifeng.com/blog/2013/05/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm.html" rel="nofollow">字符串匹配的 KMP 算法</a></li>
</ul>
<p><strong>字符串基础问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/to-lower-case/" rel="nofollow">转换成小写字母</a>（谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/length-of-last-word/" rel="nofollow">最后一个单词的长度</a>（苹果、谷歌、字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/jewels-and-stones/" rel="nofollow">宝石与石头</a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/" rel="nofollow">字符串中的第一个唯一字符
</a>（亚马逊、微软、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/string-to-integer-atoi/" rel="nofollow">字符串转换整数 (atoi) </a>（亚马逊、微软、Facebook 在半年内面试中考过）</li>
</ul>
<p><strong>字符串操作问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/longest-common-prefix/description/" rel="nofollow">最长公共前缀</a>（亚马逊、谷歌、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/reverse-string" rel="nofollow">反转字符串</a>（亚马逊、谷歌、苹果在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/reverse-string-ii/" rel="nofollow">反转字符串 II </a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/reverse-words-in-a-string/" rel="nofollow">翻转字符串里的单词</a>（微软、字节跳动、苹果在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/" rel="nofollow">反转字符串中的单词 III </a>（微软、字节跳动、华为在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/reverse-only-letters/" rel="nofollow">仅仅反转字母</a>（字节跳动在半年内面试中考过）</li>
</ul>
<p><strong>异位词问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/valid-anagram/" rel="nofollow">有效的字母异位词</a>（Facebook、亚马逊、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/group-anagrams/" rel="nofollow">字母异位词分组</a>（亚马逊在半年内面试中常考）</li>
<li><a href="https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/" rel="nofollow">找到字符串中所有字母异位词</a>（Facebook 在半年内面试中常考）</li>
</ul>
<p><strong>回文串问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/valid-palindrome/" rel="nofollow">验证回文串</a>（Facebook 在半年内面试中常考）</li>
<li><a href="https://leetcode-cn.com/problems/valid-palindrome-ii/" rel="nofollow">验证回文字符串 Ⅱ</a>（Facebook 在半年内面试中常考）</li>
<li><a href="https://leetcode-cn.com/problems/longest-palindromic-substring/" rel="nofollow">最长回文子串</a>（亚马逊、字节跳动、华为在半年内面试中常考）</li>
</ul>
<p><strong>最长子串、子序列问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/longest-common-subsequence/" rel="nofollow">最长公共子序列</a>（亚马逊、字节跳动、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/edit-distance/" rel="nofollow">编辑距离</a>（亚马逊、字节跳动、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/longest-palindromic-substring/" rel="nofollow">最长回文子串</a>（亚马逊、华为、字节跳动在半年内面试常考）</li>
</ul>
<p><strong>字符串 + DP 问题</strong></p>
<ul>
<li><a href="https://leetcode-cn.com/problems/regular-expression-matching/" rel="nofollow">正则表达式匹配</a>（Facebook、微软、字节跳动在半年内面试中考过）</li>
<li>题解：<a href="https://leetcode-cn.com/problems/regular-expression-matching/solution/ji-yu-guan-fang-ti-jie-gen-xiang-xi-de-jiang-jie-b/" rel="nofollow"> https://leetcode-cn.com/problems/regular-expression-matching/solution/ji-yu-guan-fang-ti-jie-gen-xiang-xi-de-jiang-jie-b/ </a></li>
<li><a href="https://leetcode-cn.com/problems/wildcard-matching/" rel="nofollow">通配符匹配</a>（Facebook、微软、字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/distinct-subsequences/" rel="nofollow">不同的子序列</a>（MathWorks 在半年内面试中考过）</li>
</ul>
</blockquote>