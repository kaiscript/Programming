package DFS;

/**
 * 题目描述
 * 
 * 
 * Given a 2D board and a word, find if the word exists in the grid. The word
 * can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once. For example, Given board = [
 * ["ABCE"], ["SFCS"], ["ADEE"] ] word ="ABCCED", -> returnstrue, word ="SEE",
 * -> returnstrue, word ="ABCB", -> returnsfalse.
 *
 * @author Kaiscript
 *
 *         2016年9月4日下午9:31:51
 */
public class WordSearch {

	public boolean exist(char[][] board, String word) {

		int row = board.length;
		int col = board[0].length;
		char c = word.charAt(0);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(c==board[i][j]){
					if (dfs(board, word, 0, i, j))
						return true;
				}
				
			}
		}

		return false;

	}

	public boolean dfs(char[][] board, String word, int step, int i, int j) {
		if (word.length() == step)
			return true;
		
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(step)!=board[i][j])
			return false;
		
		board[i][j] = '#';
//		if(dfs(board, word, step+1, i-1, j)) return true;
//		if(dfs(board, word, step+1, i, j-1)) return true;
//		if(dfs(board, word, step+1, i+1, j)) return true;
//		if(dfs(board, word, step+1, i, j+1)) return true;
		
		if(dfs(board, word, step+1, i-1, j) || dfs(board, word, step+1, i, j-1) 
				|| dfs(board, word, step+1, i+1, j) || dfs(board, word, step+1, i, j+1)) return true;
		
		board[i][j] = word.charAt(step);
	
		return false;
		
	}

}
