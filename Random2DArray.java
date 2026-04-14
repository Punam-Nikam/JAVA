// import java.math.random;
public class Random2DArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        // double arr[][]=new double[3][4];

        // 0.9025763287586205 0.9263687297885818 0.10826266064759016 0.8315314910724896 
        // 0.5669255049042726 0.04401911914553713 0.11424815900875251 0.2627667218825003
        // 0.8903820917357794 0.4831793530825227 0.4146047020967316 0.5912634195210639/.....this and we have to multiply with 100 for 2 digit nos..and by 10 for 1 digit no.
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
        
                arr[i][j]=(int)(Math.random()*10);   // we have to type cast here becoz if we dont then value will be double like 
                }
            }
/* Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.When this method is first called, it creates a single new pseudorandom-number generator, exactly as if by the expression.new java.util.Random() This new pseudorandom-number generator is used thereafter for all calls to this method and is used nowhere else.  */ 
            
        //display the array
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

//op === >>>> 
// 4 7 1 2 
// 6 3 2 6
// 7 2 8 5