package s6;

public class prime {
    public static void main(String[] args) {
        int i=2,j=2,count=0;
        for(i=2;i<=100;i++){
            count=0;
            for(j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+"\t");
            }
        }
    }
}
