# Phase 1: DSA Foundation — Detailed Roadmap (Month 1–2)

Companion to `roadmap.md`. This expands Phase 1 (DSA) into an 8-week execution plan.

## Reality check before you start

Your base roadmap allocates DSA to Monday + Friday only (2 hrs each = 4 hrs/week). At that rate, 8 weeks = 32 hours total — not enough to responsibly cover 250 problems (that's ~8 min/problem, including the ones you've never seen a pattern for). Two fixes, both reflected below:

1. **Temporarily reallocate during Month 1–2 only.** Since the base roadmap itself says DSA is "priority #1" for these two months, borrow hours from Tue/Wed/Thu (System Design / Distributed Systems / AI — none of which are urgent yet) and pull Saturday's "Build Project" time toward DSA too. Target **~10 hrs/week** during this phase instead of 4. Resume the normal weekly split starting Phase 2 (Month 3).
2. **Recalibrate the count.** 250 problems in 8 weeks isn't realistic even at 10 hrs/week (~80 hrs total). This plan targets **~85 curated problems** (pattern-complete, Blind75/NeetCode150-equivalent coverage) by end of Month 2, then **1–2 problems/day maintenance** through the rest of the year to hit the "300+ by month 12" goal your own roadmap states in its final summary. Depth on patterns beats raw count for interview performance anyway.

## Language track (parallel, lightweight — don't let this eat DSA time)

Java, per the base roadmap's rationale (Google/Uber/Atlassian/Microsoft/Indeed/Amazon/Meta all lean Java-heavy). Learn it *through* solving, not through a separate course:

- Week 1–2: Collections (`ArrayList`, `HashMap`, `HashSet`, `ArrayDeque`, `TreeMap`), autoboxing gotchas
- Week 3–4: `Comparator`/`Comparable`, `PriorityQueue`
- Week 5–6: Generics basics, `Optional`
- Week 7–8: Streams (map/filter/reduce), basic concurrency vocabulary (skip deep dives — that's Phase 3 territory)
- Ongoing: read *Effective Java* in small chunks during your Sunday notes hour

If Java friction is actively slowing down pattern learning in week 1, it's fine to prototype in a language you're fluent in first and port — but don't make that a habit past week 2.

## Weekly rhythm during Phase 1

| Day | Hours | Focus |
|---|---|---|
| Mon | 2 | New pattern + problems |
| Tue | 1.5 | Problems (borrowed from System Design slot) |
| Wed | 1.5 | Problems (borrowed from Distributed Systems slot) |
| Thu | 1 | Problems (borrowed from AI Engineering slot) |
| Fri | 2 | New pattern + problems |
| Sat | 1 | Timed mock (2–3 problems, interview conditions) + review |
| Sun | 1 | Notes: patterns learned, mistakes log, update tracker below |

## Week-by-week breakdown

Check items off as you go — this file doubles as your tracker.

### Week 1 — Arrays & Hashmaps
- [x] [Two Sum](https://leetcode.com/problems/two-sum/)
- [x] [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- [x] [Valid Anagram](https://leetcode.com/problems/valid-anagram/) (brute force works, HashMap version still worth a retry)
- [x] [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
- [x] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) (Kadane's)
- [x] [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)
- [x] [Group Anagrams](https://leetcode.com/problems/group-anagrams/)
- [ ] [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
- [ ] [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)
- [ ] [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)

### Week 2 — Strings & Two Pointers
- [ ] Valid Palindrome
- [ ] Reverse Words in a String
- [ ] Longest Common Prefix
- [ ] 3Sum
- [ ] Container With Most Water
- [ ] Trapping Rain Water
- [ ] Longest Palindromic Substring
- [ ] Group Shifted Strings
- [ ] Valid Parentheses

### Week 3 — Sliding Window & Binary Search
- [ ] Longest Substring Without Repeating Characters
- [ ] Longest Repeating Character Replacement
- [ ] Permutation in String
- [ ] Minimum Window Substring
- [ ] Sliding Window Maximum
- [ ] Binary Search
- [ ] Search in Rotated Sorted Array
- [ ] Find Minimum in Rotated Sorted Array
- [ ] Koko Eating Bananas
- [ ] Search a 2D Matrix
- [ ] Median of Two Sorted Arrays (stretch)

### Week 4 — Stack, Queue, Linked List
- [ ] Min Stack
- [ ] Evaluate Reverse Polish Notation
- [ ] Daily Temperatures
- [ ] Largest Rectangle in Histogram (stretch)
- [ ] Reverse Linked List
- [ ] Merge Two Sorted Lists
- [ ] Reorder List
- [ ] Remove Nth Node From End of List
- [ ] Linked List Cycle
- [ ] Copy List with Random Pointer
- [ ] Add Two Numbers
- [ ] Merge K Sorted Lists

### Week 5 — Trees & BST
- [ ] Binary Tree Inorder/Preorder/Postorder Traversal
- [ ] Maximum Depth of Binary Tree
- [ ] Invert Binary Tree
- [ ] Same Tree
- [ ] Binary Tree Level Order Traversal
- [ ] Binary Tree Right Side View
- [ ] Validate Binary Search Tree
- [ ] Kth Smallest Element in a BST
- [ ] Lowest Common Ancestor of a BST
- [ ] Lowest Common Ancestor of a Binary Tree
- [ ] Construct Binary Tree from Preorder and Inorder Traversal
- [ ] Serialize and Deserialize Binary Tree (stretch)

### Week 6 — Heap & Graphs (BFS/DFS)
- [ ] Kth Largest Element in an Array
- [ ] K Closest Points to Origin
- [ ] Task Scheduler
- [ ] Find Median from Data Stream
- [ ] Number of Islands
- [ ] Clone Graph
- [ ] Course Schedule (topological sort)
- [ ] Pacific Atlantic Water Flow
- [ ] Number of Connected Components in an Undirected Graph
- [ ] Word Ladder (stretch)

### Week 7 — Backtracking + Graph Algorithms
- [ ] Subsets
- [ ] Combination Sum
- [ ] Permutations
- [ ] Word Search
- [ ] Palindrome Partitioning
- [ ] Letter Combinations of a Phone Number
- [ ] N-Queens (stretch)
- [ ] Network Delay Time (Dijkstra's)
- [ ] Redundant Connection (Union-Find)
- [ ] Graph Valid Tree

### Week 8 — Dynamic Programming
- [ ] Climbing Stairs
- [ ] House Robber
- [ ] House Robber II
- [ ] Coin Change
- [ ] Longest Increasing Subsequence
- [ ] Word Break
- [ ] Decode Ways
- [ ] Unique Paths
- [ ] Longest Common Subsequence
- [ ] Edit Distance
- [ ] Best Time to Buy and Sell Stock with Cooldown
- [ ] Partition Equal Subset Sum

## Exit checklist — before moving to Phase 2 (System Design)

- [ ] All 10 core topics touched (arrays through DP) with ≥80% of the list above solved without looking up the pattern
- [ ] Can explain, out loud, when to reach for each pattern (sliding window vs two pointers vs DP) without prompting
- [ ] Mistakes log from Sunday reviews shows repeat errors shrinking, not the same bug every week
- [ ] Comfortable writing correct Java (no pseudocode-in-Java) under a 25-min timer
- [ ] At least 4 timed mocks completed (Saturday slot) at interview pace

From Month 3 onward: drop to 1–2 problems/day maintenance (mixed old + new patterns) to keep skills warm while System Design becomes the primary focus, ramping back up in Phase 7 (Month 11, dedicated interview prep).

## Resources

- **Pattern teaching: Claude, in this chat.** At the start of each week (or whenever you hit an unfamiliar pattern), ask Claude to explain it and walk one example — then attempt the rest of that week's checklist solo before coming back for review/hints. Don't ask for full solutions as a first move; the interview gives you no AI help, so the solo-attempt rep is the part that actually transfers.
- *Effective Java* (Joshua Bloch) — read in parallel per the Java track above
- LeetCode — primary problem source; use company tags (Google, Amazon, Meta, Uber) once you're past week 4 to bias toward what you'll actually be asked
