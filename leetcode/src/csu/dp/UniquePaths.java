package csu.dp;

public class UniquePaths {

	/**
	 * �������
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
	 * ״̬ת�Ʒ��� f[i][j] = f[i-1]f[j] +f[i]f[j-1];
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
				// ���f[j] ��ʾ���º��f[j],�빫ʽ�е�f[i][j]���Ӧ
				// �Ҳ�f[j],��ʾ�ϵ�f[j],�빫ʽ�е�[i-1][j] ��Ӧ
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
