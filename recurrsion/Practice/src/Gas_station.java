public class Gas_station {
    public static void main(String[] args) {
        int [] gas ={1,2,3,4,5};
        int [] cost ={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {

        for(int i =0 ;i<gas.length-1;i++){
            int ans = is_complete(i , gas , cost);
            if(ans !=-1){
                return ans;

            }

        }

        return -1;

    }
   static int is_complete(int start , int [] gas , int [] cost ){
        int tf =0 ;
        int final1 = start;
        while(start < gas.length-1){
            tf=tf+gas[start];
            //on moving from start to start+1
            if((tf-cost[start])>= 0){
                tf=tf-cost[start]+gas[start+1];
                start++;
                if(start>gas.length-1){
                    start =0;

                }
            }
            else{
                break;
            }


        }

       if(start == final1){
           return final1;
       }
        return -1;

    }
}
