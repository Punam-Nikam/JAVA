public class StringMethods {
    public static void main(String[] args) {
        String name="PunAm";
        System.out.println("My name is "+name);
        //length of string
        System.out.println(name.length());
        //lowercase
        System.out.println(name.toLowerCase());
        //uppercase
        System.out.println(name.toUpperCase());
        
        //String are immutable...original strings does not change
        //so we can change the string by storing it in another variable
        //i.e.=> String newVar = name.toLowerCase();

        //trim
        String nonTrimmedString="   Punam   ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        //substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4)); //it gives result from index 1 to 3
        System.out.println(name.substring(0,5)); //it gives result from index 0 to 3
        System.out.println(name.substring(0,4)); //it gives result from index 0 to 3


        //replace
        System.out.println(name.replace('n', 'N')); //it replaces n with m and
        System.out.println(name.replace("nA", "na"));
    
        //startsWith and endsWith
        System.out.println(name.startsWith("Pu")); //it gives true because name starts with Pu
        System.out.println(name.endsWith("am")); //it gives true because name ends with am
   

        //indexOf
        System.out.println(name.indexOf('a')); //it gives index of first occurrence of a..if not exists then it gives -1
        System.out.println(name.indexOf('n')); //it gives index of first occurrence of n
        
        //charAt
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(1));

        
        String modifiedName="Harryrry";
        System.out.println(modifiedName.indexOf("rry3444444"));
        System.out.println(modifiedName.indexOf("rry",4)); //it gives index of first occurrence of rry after index 4

        System.out.println(modifiedName.lastIndexOf("rry")); //it gives index of last occurrence of rry
        System.out.println(modifiedName.lastIndexOf("Harr",6)); //it gives index of last occurrence of rry before index 6

        //equals and equalsIgnoreCase
        String name1="Punam";
        System.out.println(name.equals(name1)); //it gives false because name and name1 are not equal
        System.out.println(name.equalsIgnoreCase(name1)); //it gives true because name and name1 are equal ignoring case


        //escape sequence characters
        System.out.println("I am escape sequence character \t tab");
        System.out.println("I am escape sequence character '\n' new line");
        System.out.println("I am escape sequence character '\\' backslash");
        System.out.println("im double quote \" double quote");
    }

}
