package exercise;

public class Practice {
	
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


