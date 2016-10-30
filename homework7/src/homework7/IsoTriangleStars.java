package homework7;

import java.util.*;

public class IsoTriangleStars {
	private int size;

	void start() {
		this.input();
		this.print();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		
  		System.out.print("이등변삼각형 높이입력: ");
  		
  		this.size=s.nextInt();
  		System.out.print("\n");
    }
	
    void print() {
    	int star = this.size;
    	
  	  	for(int i=1;i<=star;i++) {  
  	  		for(int j=1;j<=(star-i);j++)  
  	  			System.out.print(" ");   
  	  		for(int j=1;j<=(i*2)-1;j++) 
  	  			System.out.print("*");    
  	  		
  	  		System.out.print("\n");  
  	  	}  
  	  	
  	  	System.out.print("\n");
    }
}


