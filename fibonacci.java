public class fibonacci{
    public static int of(int n){
   int x=0;     
   if(n==2||n==1){
        x=1;
   }
    else if(n>2){
        x= of(n-1) + of(n-2);
    }
    return x;
}
}
