学习笔记
  字典树(Trie树)
  
  
  ````
  代码模板
  class Trie {
      private boolean isEnd;
      private Trie[] next;
      /** Initialize your data structure here. */
      public Trie() {
          isEnd = false;
          next = new Trie[26];
      }
      
      /** Inserts a word into the trie. */
      public void insert(String word) {
          if (word == null || word.length() == 0) return;
          Trie curr = this;
          char[] words = word.toCharArray();
          for (int i = 0;i < words.length;i++) {
              int n = words[i] - 'a';
              if (curr.next[n] == null) curr.next[n] = new Trie();
              curr = curr.next[n];
          }
          curr.isEnd = true;
      }
      
      /** Returns if the word is in the trie. */
      public boolean search(String word) {
          Trie node = searchPrefix(word);
          return node != null && node.isEnd;
      }
      
      /** Returns if there is any word in the trie that starts with the given prefix. */
      public boolean startsWith(String prefix) {
          Trie node = searchPrefix(prefix);
          return node != null;
      }
  
      private Trie searchPrefix(String word) {
          Trie node = this;
          char[] words = word.toCharArray();
          for (int i = 0;i < words.length;i++) {
              node = node.next[words[i] - 'a'];
              if (node == null) return null;
          }
          return node;
      }
  }
````

````
并查集模板代码
class UnionFind { 
	private int count = 0; 
	private int[] parent; 
	public UnionFind(int n) { 
		count = n; 
		parent = new int[n]; 
		for (int i = 0; i < n; i++) { 
			parent[i] = i;
		}
	} 
	public int find(int p) { 
		while (p != parent[p]) { 
			parent[p] = parent[parent[p]]; 
			p = parent[p]; 
		}
		return p; 
	}
	public void union(int p, int q) { 
		int rootP = find(p); 
		int rootQ = find(q); 
		if (rootP == rootQ) return; 
		parent[rootP] = rootQ; 
		count--;
	}
}
````

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>参考链接</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/" rel="noopener nofollow" target="_blank">二叉树的层次遍历</a></li>
<li><a href="https://leetcode-cn.com/problems/implement-trie-prefix-tree/solution/" rel="noopener nofollow" target="_blank">实现 Trie </a></li>
<li><a href="https://shimo.im/docs/DP53Y6rOwN8MTCQH" rel="noopener nofollow" target="_blank"> Tire 树代码模板</a></li>
</ul></div>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>实战题目</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/implement-trie-prefix-tree/#/description" rel="noopener nofollow" target="_blank">实现 Trie (前缀树) </a>（亚马逊、微软、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/word-search-ii/" rel="noopener nofollow" target="_blank">单词搜索 II </a>（亚马逊、微软、苹果在半年内面试中考过）</li>
<li>分析单词搜索 2 用 Tire 树方式实现的时间复杂度，请同学们提交在学习总结中。</li>
</ul></div>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>参考链接</h2>
<ul>
<li><a href="https://shimo.im/docs/VtcxL0kyp04OBHak" rel="noopener nofollow" target="_blank">并查集代码模板</a></li>
</ul>
<h2>实战题目</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/friend-circles" rel="noopener nofollow" target="_blank">朋友圈</a>（亚马逊、Facebook、字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/number-of-islands/" rel="noopener nofollow" target="_blank">岛屿数量</a>（近半年内，亚马逊在面试中考查此题达到 361 次）</li>
<li><a href="https://leetcode-cn.com/problems/surrounded-regions/" rel="noopener nofollow" target="_blank">被围绕的区域</a>（亚马逊、eBay、谷歌在半年内面试中考过）</li>
</ul></div>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>参考链接</h2>
<ul>
<li><a href="https://shimo.im/docs/UdY2UUKtliYXmk8t" rel="noopener nofollow" target="_blank"> DFS 代码模板</a></li>
<li><a href="https://shimo.im/docs/ZBghMEZWix0Lc2jQ" rel="noopener nofollow" target="_blank"> BFS 代码模板</a></li>
<li><a href="https://nikcheerla.github.io/deeplearningschool/2018/01/01/AlphaZero-Explained/" rel="noopener nofollow" target="_blank"> AlphaZero Explained </a></li>
<li><a href="https://en.wikipedia.org/wiki/Game_complexity" rel="noopener nofollow" target="_blank">棋类复杂度</a></li>
</ul></div>

<div data-v-1e3bbcc6="" data-v-4d3195d1="" class="lesson-section"><div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>参考链接</h2>
<ul>
<li><a href="https://shimo.im/docs/8CzMlrcvbWwFXA8r" rel="noopener nofollow" target="_blank"> A* 代码模板</a></li>
<li><a href="https://dataaspirant.com/2015/04/11/five-most-popular-similarity-measures-implementation-in-python/" rel="noopener nofollow" target="_blank">相似度测量方法</a></li>
<li><a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/discuss/313347/A*-search-in-Python" rel="noopener nofollow" target="_blank">二进制矩阵中的最短路径的 A* 解法</a></li>
<li><a href="https://zxi.mytechroad.com/blog/searching/8-puzzles-bidirectional-astar-vs-bidirectional-bfs/" rel="noopener nofollow" target="_blank"> 8 puzzles 解法比较</a></li>
</ul>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>实战题目</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/climbing-stairs/" rel="noopener nofollow" target="_blank">爬楼梯</a>（阿里巴巴、腾讯、字节跳动在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/generate-parentheses/" rel="noopener nofollow" target="_blank">括号生成</a>（亚马逊、Facebook、字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/n-queens/" rel="noopener nofollow" target="_blank"> N 皇后</a>（亚马逊、苹果、字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/valid-sudoku/description/" rel="noopener nofollow" target="_blank">有效的数独</a>（亚马逊、苹果、微软在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/sudoku-solver/#/description" rel="noopener nofollow" target="_blank">解数独</a>（亚马逊、华为、微软在半年内面试中考过）</li>
</ul></div>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>实战题目</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/word-ladder/" rel="noopener nofollow" target="_blank">单词接龙</a>（亚马逊、Facebook、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/minimum-genetic-mutation/" rel="noopener nofollow" target="_blank">最小基因变化</a>（谷歌、Twitter、腾讯在半年内面试中考过）</li>
</ul>
<ul>
</ul></div>


<h2>实战题目</h2>
<ul>
<li><a href="https://leetcode-cn.com/problems/shortest-path-in-binary-matrix/" rel="noopener nofollow" target="_blank">二进制矩阵中的最短路径</a>（亚马逊、字节跳动、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/sliding-puzzle/" rel="noopener nofollow" target="_blank">滑动谜题</a>（微软、谷歌、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/sudoku-solver/" rel="noopener nofollow" target="_blank">解数独</a>（微软、华为、亚马逊在半年内面试中考过）</li>
</ul></div></div>

<div data-v-1e3bbcc6="" class="article-typo" data-v-4d3195d1=""><h2>参考链接</h2>
<ul>
<li><a href="https://en.wikipedia.org/wiki/Self-balancing_binary_search_tree" rel="noopener nofollow" target="_blank">平衡树</a></li>
</ul></div>