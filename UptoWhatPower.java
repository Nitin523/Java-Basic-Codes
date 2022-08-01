// Given two numbers we have to find the power of the number a for which 
// a to the power n equals b where b is power output
// if not possible return -1



public class UptoWhatPower {
    public static void main(String[] args) {
      int a=9,b=729;
      
      int n=0;
      int count=1;
      while(count!=b){
        n++;
        count=count*a;
        if(count>b){
          n=-1;
          break;
        }
      }
      System.out.print(n);
      
    }
  }
  