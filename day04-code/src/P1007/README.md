##1007 Maximum Subsequence Sum (25 分)
Given a sequence of K integers { N
​<sub>1</sub>
​​ , N
​<sub>2</sub>
​​ , ..., N
​<sub>K</sub>
​​  }. A continuous subsequence is defined to be { N
​<sub>i</sub>
​​ , N
​<sub>i+1</sub>
​​ , ..., N
​<sub>j</sub>
​​  } where 1≤i≤j≤K. The Maximum Subsequence is the continuous subsequence which has the largest sum of its elements. For example, given sequence { -2, 11, -4, 13, -5, -2 }, its maximum subsequence is { 11, -4, 13 } with the largest sum being 20.

Now you are supposed to find the largest sum, together with the first and the last numbers of the maximum subsequence.

##Input Specification:
Each input file contains one test case. Each case occupies two lines. The first line contains a positive integer K (≤10000). The second line contains K numbers, separated by a space.

##Output Specification:
For each test case, output in one line the largest sum, together with the first and the last numbers of the maximum subsequence. The numbers must be separated by one space, but there must be no extra space at the end of a line. In case that the maximum subsequence is not unique, output the one with the smallest indices i and j (as shown by the sample case). If all the K numbers are negative, then its maximum sum is defined to be 0, and you are supposed to output the first and the last numbers of the whole sequence.

##Sample Input:
>10  
-10 1 2 3 4 -5 -23 3 7 -21
##Sample Output:
>10 1 4
-----
##分析
这是动态规划中的一种情况。可以达到在线的处理经度。 滑动窗口。
1. 找到数列中的第一个正数，如果没有的正数的话，return 0 0，length（）；
2. 如果找到了第一个正数  
    1. 取一个全为正数的最小区间，命名为区间1。
    2. 在区间1的左边继续取区间，命名为区间2.
        1. 如果sum<sub>区间1</sub>+sum<sub>区间2</sub><0:记录区间1，然后从区间二的末端开始。
        2. 如果sum<sub>区间1</sub>+sum<sub>区间2</sub>>sum<sub>区间1</sub>，设区间1等于区间1加区间2。
    