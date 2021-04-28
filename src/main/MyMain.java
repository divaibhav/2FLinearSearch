package main;

public class MyMain {
    public static void main(String[] args) {

    }
    public boolean search(int[] arr, int searchElement){
        boolean response = false;
        //traverse the arr using loop
        for (int i = 0; i < arr.length; i++) {
            //compare each element with searchElement
            if(arr[i] == (searchElement)){
                //if found
                response = true;
                break;
            }
        }
        return response;
    }
    //find the index of searchElement in given arr, if not present return -1
    public int findIndex(int[] arr, int searchElement){
        return -1;
    }
    //find the index of nth occurrence of givenElement in the arr
    //if  givenElement didn't have n occurrence return -1,
    // if givenElement not present in arr return -1
    public int findNthIndex(int[] arr, int givenElement, int n){
        return -1;
    }
}
