
public class UptoWhatPower {
    public static void main(String[] args) {
      int a=9,b=729;
      
      int ans=0;
      int count=1;
      while(count!=b){
        ans++;
        count=count*a;
        if(count>b){
          ans=-1;
          break;
        }
      }
      System.out.print(ans);
      
    }
  }
  