public class smallestletter {
    public static void main(String[] args) {
    char []letter = {'c','f','j'};
    char target ='f';
    char ans =smallestl(letter,target);
        System.out.println(ans);
    }
    static char smallestl(char [] letter, char target){

        int start=0;
        int end=letter.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(letter[mid]>target){
                end=mid-1;

            }else{
                start=mid+1;
            }

        }
        return letter[start%(letter.length)];
    }
}
