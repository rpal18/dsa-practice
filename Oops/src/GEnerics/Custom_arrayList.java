package GEnerics;

import java.util.Arrays;

// for this time it is not generic
public class Custom_arrayList {
    private int [] data ;
    private static int DEFAULT_SIZE=2;

    int size =0 ;

     public Custom_arrayList()
     {
         this.data = new int [DEFAULT_SIZE];
     }
    public void add(int n){
        if(is_full()){
            resize();

        }
        data[size++]=n;


    }

    boolean is_full(){
        return size==data.length;

    }

    void resize(){
       int[]  temp = new int [2*data.length];
// need to copy all the elements
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        //again store into data(the original one )
        data = temp;
    }

    public int remove(){
       int removed =data[--size];
        data[size]=0;
       return removed;
    }

    @Override
    public String toString() {
        return "Custom_arrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Custom_arrayList obj = new Custom_arrayList();
        obj.add(88);
        obj.add(67);
        obj.add(34);
        System.out.println(obj);
        System.out.println(obj.remove());
        System.out.println(obj);
    }
}
