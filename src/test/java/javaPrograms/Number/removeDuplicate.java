package javaPrograms.Number;

public class removeDuplicate {

    public static void main(String[] args){
        int[] ar = {10,1,1,9,1,9,8,8};
        int[] newArr = new int[ar.length];
        int index = 0;

        for(int i = 0; i < ar.length; i++){
            boolean flag = false;

            for(int j = 0; j < i; j++){     // check ONLY previous values
                if(ar[i] == ar[j]) {
                    flag = true;            // duplicate found
                    break;
                }
            }

            if(!flag){                      // not duplicate → store
                newArr[index] = ar[i];
                index++;
            }
        }

        for (int k = 0; k < index; k++) {
            System.out.print(newArr[k] + " ");
        }
    }
}
