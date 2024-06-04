package Practica15124;

public class TrazaExamen15124 {
	
	public static void main(String []args) {
		int[]r = {2}; // 1
		r[0] += funcion (r[0], r); // 2
		System.out.println(" +"+r[0]);
		}
	
	
	public static int funcion (int x, int [] r){
	if (x == 0)
	r[0] = 3; // 3
	else {
	if (r[0] >= 2){
	r[0]--; // 4
	x = funcion (x - 1, r); // 5
	}
	else
	r[0] = funcion (r[0] - 1, r); //6
	}
	x += r[0] - 1; // 7
	System.out.println(" :" + r[0] + " * " + x);
	return x;
	}
}
