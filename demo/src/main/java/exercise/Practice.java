package exercise;

public class Practice {
	
	
	  // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
    	 int iS=arr.length;
         int jS=arr[1].length;
         int hiestH=0;
         
         for (int i=0; i<iS-2; i++){
            int curH=0;
         for (int j=0; j<jS-2; j++){
            curH=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
             arr[i+1][j+1]+
             arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
             if (hiestH<curH){
                 hiestH=curH;
             }
         }
         }
		return hiestH;


    }
    
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        
        int sizeA=a.length;
        int[] prefixA=new int[d];
        int[] solution=new int[sizeA];
        
      //  prefixA=a.substring(0,d-1);
        for (int i=0;i<d;i++){
            prefixA[i]=a[i];
        }
        
        for (int j=0;j<sizeA;j++){
            solution[j]=a[j+(d-1)];
        }
        
        for (int k=0;k<prefixA.lenght;k++){
            solution[sizeA-d+k]=prefix[A];
        }
        
     //   return solution=a.substring(d-1,sizeA-1)+prefixA;
        
        return solution;
    }
	


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


