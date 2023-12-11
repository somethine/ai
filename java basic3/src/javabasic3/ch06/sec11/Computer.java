package javabasic3.ch06.sec11;

public class Computer {
     int sum(int ... Values) {
    	 
    	 int sumVAr=0;
    	 for(int i=0; i <Values.length; i++) {
    		 sumVAr += Values[i];
    		 
    	 }
     
         return sumVAr;
     
     
     }
     
     double doublesum;
     
     double avg(double ... values) {
         for(int i=0; i<values.length; i++) {   
         doublesum+= values[i];
         }   
    	 
    	 return doublesum/ values.length;
    	 
     }

}
