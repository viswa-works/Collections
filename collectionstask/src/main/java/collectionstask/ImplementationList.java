package collectionstask;

import java.util.Arrays;
import java.util.Random;

import org.apache.logging.log4j.LogManager;

public class ImplementationList<Y> {
    int a_size = 0;
    private static final org.apache.logging.log4j.Logger vissu1 =LogManager.getLogger(Accessingclass.class);
    static final int FIXED_SIZE = 10;
    private Object array[];
    Random r=new Random();
    public ImplementationList() {
       array = new Object[FIXED_SIZE];
       for(int i=0;i<10;i++)
       {
       	array[a_size++] =String.valueOf(r.nextInt(100000));
       }
   }

   
   public void adding (Y val) {
       if (a_size == array.length) {
           memoryAllocation();
       }
       array[a_size++] = val;
   }
    
    public Y getting(int pos) {
    	try
 	   {
        if (pos >= a_size || pos < 0) {
           
        }
 	   }
 	   catch(Exception r)
 	   {
 		   System.out.println("Index was not present within the range: " + pos);
 		   vissu1.info("Index was not present within the range: " + pos);
 		    }
        return (Y) array[pos-1];
   }
    
   public Y remove(int pos) {
	   
	   try
	   {
       if (pos >= a_size || pos < 0) {
          
       }
	   }
	   catch(Exception r)
	   {
		  //System.out.println("Index was not present within the range: " + pos);
		   vissu1.error("Index was not present within the range: " + pos);
		    }
       Object item = array[pos];
       int del = array.length - ( pos + 1 ) ;
       System.arraycopy( array, pos + 1, array, pos, del ) ;
       a_size--;
       return (Y) item;
   }
    
   //Get Size of list
   public int size() {
       return a_size;
   }
    
   //Print method
   @Override
   public String toString()
   {
        StringBuilder head = new StringBuilder();
         for(int i = 0; i < a_size ;i++) {
            head.append(array[i].toString());
            if(i<a_size-1){
                head.append("\n");
            }
        }
        return head.toString();
   }
   
   private void memoryAllocation() {
       int newSize = array.length * 4;
       array = Arrays.copyOf(array, newSize);
   }
}



