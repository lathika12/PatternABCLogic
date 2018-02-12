public class PatternLogic {

    public static void main(String args[]){
        System.out.println("Hello World");

        int[] a = {9,0,1,8,1};
        int[] g = {8,7,8,8,9};

        int A=0,B=0,C=0;
        int aa=0,bb=0,cc=0;

        for(int i = 0 ; i < 5 ; i++){
            for(int k = 0 ; k < 5 ; k++){
                if( a[i] == g[k] ){
                    if(i==k) A++;
                    else B++;
                }else{
                    C++;
                }
            }
            if(C!=5){
                if(A==1){
                    aa++;
                }else if(B>=1){
                    bb++;
                }
            }else {
                cc++;
            }
            A=0;
            B=0;
            C=0;
        }

        System.out.println("ABC : " + A +"" + B +""+ C + "aa : " + aa + "bb: " + bb + "cc : " + cc);

    }
}
