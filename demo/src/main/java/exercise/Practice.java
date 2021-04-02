package exercise;

public class Practice {
	


	    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        
        int aCount=0;
        int sL=s.length(); 
        
        if (n<=sL){       
        for(long cur=0;cur<n;cur++){         
            if (s.charAt((int) cur)=='a'){
                aCount++;
            }                           
        }        
        return aCount; 
        }
        else{
        for(long cur=0;cur<sL;cur++){            
            if (s.charAt((int) cur)=='a'){
                aCount++;
            }            
        }
        long howMuchTimes=  n/sL;         
        long howManyTimesA=howMuchTimes*aCount;
        long howManyMore =n-sL*howMuchTimes;
        int aCountTwo=0;
            
            for(long cur=0;cur<howManyMore;cur++){            
                if (s.charAt((int) cur)=='a'){
                aCountTwo++;
            } 
            
        }
        return aCountTwo+howManyTimesA;
    }
    }
	
    public static int countingValleys(int steps, String path) {
    // Write your code here

    int up =0;
    int down=0;
    int valleys=0;
    
    for (int cur=0;cur<path.length();cur++){
    
       if(path.charAt(cur)=='U'&&up>=0){
           up++;
       }
       
        if(path.charAt(cur)=='U'&&down<0){
            down++;
            if(down==0){
                valleys++;
            }
        }   
        
        if (path.charAt(cur)=='D'&&up>0){
            up--;
        }
        
        if (path.charAt(cur)=='U'&&down>0){
            down--;
        }
    
    }
    return valleys;
    }

}


