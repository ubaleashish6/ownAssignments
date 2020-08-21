package javaPrograms;

public class Print1to100WithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNos(45);

	}
	static void printNos(int n) 
    { 
        if(n > 0) 
        { 
            printNos(n - 1); 
            System.out.print(n + " "); 
        } 
        return; 
    } 

}
