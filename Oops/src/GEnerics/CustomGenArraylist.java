package GEnerics;

import java.util.Arrays;

public class CustomGenArraylist<T> {
    private Object [] data ;
    private static int DEFAULT_SIZE=2;

    int size =0 ;

    public CustomGenArraylist()
    {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T n){
        if(is_full()){
            resize();

        }
        data[size++]=n;


    }

    boolean is_full(){
        return size==data.length;

    }

    void resize(){
        Object[]  temp = new Object [2*data.length];
// need to copy all the elements
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];

        }
        //again store into data(the original one )
        data = temp;
    }

    public T remove(){
        T removed =(T)(data[--size]);
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
        CustomGenArraylist<String> obj  = new CustomGenArraylist<>();
        obj.add("bb");
        obj.add("fgj");
        obj.add("hbn");
        obj.add("yuuu");
        System.out.println(obj.remove());

    }
}
