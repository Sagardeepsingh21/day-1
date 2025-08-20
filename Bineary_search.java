import java.util.*;
public class Bineary_search {
    public static int Binarysearch(int number[],int key){
        int start=0;int end=number.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }

            if(number[mid]<key){
                start =mid +1;
            }
            if(number[mid]>key){
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6};
        int key=5;
        

        System.out.println("The number is found at"+Binarysearch(number,key));
    }
}
