class Student {
        String name;
        int marks;
}

public class ArrayOfObjects { 
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.name="Punam";
        s1.marks=99;


        Student s2=new Student();
        s2.name="Mayuri";
        s2.marks=98;

        Student s3=new Student();
        s3.name="Shubhi";
        s3.marks=97;

        Student studs[]=new Student[3];
        studs[0]=s1;
        studs[1]=s2;
        studs[2]=s3;

        // for(int i=0;i<3;i++){
        //     System.out.println(studs[i].name + " : " +studs[i].marks);
        // }

        //we can use enhanced for loop here just like forEach loop in C or C++
        for(Student n : studs){
            System.out.println(n.name + " : "+n.marks);
        }

    }

}
