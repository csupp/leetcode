package csu.dp;

public class UniquePaths {

	/**
	 * 深度优先
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int uniquePaths(int m, int n) {
		if (m < 1 || n < 1)
			return 0;
		if (m == 1 && n == 1)
			return 1;

		return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
	}

	/**
	 * 状态转移方程 f[i][j] = f[i-1]f[j] +f[i]f[j-1];
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int uniquePaths_dp(int m, int n) {
		int[] f = new int[n];
		f[0] = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				// 左侧f[j] 表示更新后的f[j],与公式中的f[i][j]相对应
				// 右侧f[j],表示老的f[j],与公式中的[i-1][j] 对应
				f[j] = f[j - 1] + f[j];
			}

		}
		return f[n - 1];

	}
	public static int uniquePaths_dp2(int m,int n){
		Integer[][] map = new Integer[m][n];
		for(int i=0;i<m;i++){
			map[i][0]=1;
		}
		for(int j=0;j<n;j++){
			map[0][j]=1;
		}
		for(int i=1;i<m;i++){
			for (int j=1;j<n;j++){
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
			
		}
		return map[m-1][n-1];
		
	}
	
	
	
	

	public static void main(String[] args) {
	//	System.out.println(uniquePaths(100, 100));
		System.out.println(uniquePaths_dp2(3,3));
	}
}
