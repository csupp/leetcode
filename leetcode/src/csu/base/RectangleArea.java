package csu.base;

public class RectangleArea {
    public int computeArea(int A,int B, int C,int D, int E, int F ,int G,int H){
    	int commArea=0;
    	int total = (C-A)*(D-B)+(G-E)*(H-F);
    	int comm_h_top = Math.min(D,H),comm_h_bottom = Math.max(B,F);
    	int comm_l_left = Math.max(A, E), comm_l_right = Math.min(C, G);
    	if(comm_h_top>comm_h_bottom&&comm_l_right>comm_l_left){
    		commArea  = (comm_h_top-comm_h_bottom)*(comm_l_right-comm_l_left);
    	}
    	return total-commArea;
    }
}
