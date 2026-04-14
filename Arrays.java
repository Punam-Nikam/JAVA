public class Arrays {
    public static void main(String[] args) {
        //Array is the group of homogeneous(same) type of the data stroed as(list) in memory

        int[] arr=new int[5];
        arr[0]=2;
        arr[1]=5;
        arr[2]=3;
        arr[3]=6;
        arr[4]=9;
       // System.out.println(arr[3]);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        String[] names={"Oggy","Jack","Taflu","AAuow","Oly"};
        // System.out.println(names[2]);
        int j=0;
        while(j<names.length){
            System.out.println(names[j]);
            j++;
        }

    }
}
