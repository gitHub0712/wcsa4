package MethodShadowing;




public class Driver2 {
	
	
     public static void main(String[] args) {
    	 
    	 
    	 Parent p1 = new Parent();
    	 p1.m1();
    	 
    	 
    	 Child ch1 = new Child();
    	 ch1 .m1();
    	 
    	 
    	 Parent p2 = ch1;
    	 p2.m1();
    	 
    	 
    	 Child ch2= (Child)ch1;
    	 
    	 
    	 
    	 Parent p3 = new Child();
    	 p3.m1();
		
	}

}
