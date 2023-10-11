public class max_ones_with_k_changes{

    public static void getMaxOnes(int[] arr,int k){
        int max_num= 0, count = 0, kch = k;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1 && kch >= 0){
                count +=1;
            }
            else if(arr[i] == 0){
                if(kch > 0){
                    count++;
                    kch--;
                }
                else if(kch == 0){
                    if (count > max_num){
                        max_num = count;
                        count = 0;
                        kch = k;
                    }
                    else{
                        kch = k;
                        count = 0;
                    }
                }
            }
        }
        System.out.println(max_num);
    }
public static void main(String[] args){
    int[] ar = {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1};
    getMaxOnes(ar, 3);
    }
}