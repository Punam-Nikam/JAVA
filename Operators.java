public class Operators {
    public static void main(String[] args) {

////////PRACTICE SET 

        float a=7/4*9/2;
        System.out.println(a); //it converts result into int so..result get wrong as 4.0
        // so fix it as 
        float b=7/4.0f*9/2.0f; //by adding f it converts 7 and 4 into float and then it gives correct result as 7.875
        System.out.println(b);   
        
        
        //grade encrypt
        char grade='B';
        grade=(char)(grade+8);
        System.out.println(grade); //it gives result as J because it converts char into int and then add 8 to it and then convert it back to char

        //decrypt
        grade=(char)(grade-8);
        System.out.println(grade); //it gives result as B because it converts char into int
        String v="(v**2-u**2)/a*a*s)";
        System.out.println(v); 


        //like c program ..format can used in java also
        int x=1;
        float y=5;   
        System.out.format("the %d and %f is ",x,y);
    
    }
}
