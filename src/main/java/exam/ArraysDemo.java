package exam;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        //Create an array
//        int arr[] = new int[10];
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
//        //print all elements in array
//        for (int e : arr) {
//            System.out.println(e);
//        }
//        //access an element in array
//        System.out.println(arr[9]);
//
//        //This will retrun array index out of bound
//        System.out.println(arr[10]);
//        exam.ArraysDemo ad= new exam.ArraysDemo();
//        //ad.arrayReferences();
//        ad.arrayWithReferences();

        String arr[]={"ABC","123"};
        ArraysDemo ad= new ArraysDemo();
        ad.varArgs(arr);

    }

    int[] arr1, type;

    public void arrayReferences() {
        System.out.println(arr1);
        System.out.println(type);

    }

    public void arrayWithReferences(){
//        String strArr[]= {"A","B","C"};
//        System.out.println(strArr.length);
//        String bStrArr[]={"A","B","C"};
//        System.out.println(strArr==bStrArr);
//        System.out.println(strArr.equals(bStrArr));
//        String newRef[]=strArr;
//        System.out.println(strArr==newRef);
//        System.out.println(strArr.equals(newRef));// Just compares the references
//        System.out.println(strArr);
//
//        //Print array
//        System.out.println(Arrays.toString(bStrArr));

        //Sort Arrays
//        int arr[]={5,1,2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        //Searching Arrays
//        int arr[]={1,8,7};
//        Arrays.sort(arr);//Sort Array
//        int result = Arrays.binarySearch(arr, 8);
//        System.out.println(result);
//
        //Comparing Arrays
//        //System.out.println(Arrays.compare(new int[1], new int[1] ));
//        int arr1[]={1,2};
//        int arr2[]={2,2};
//        System.out.println(Arrays.compare(arr1,arr2));

//        char arr1[]={'a','b'};
//        char arr2[]={'a','b'};
//        System.out.println(Arrays.compare(arr1,arr2));

        char arr1[]={'a','b'};
        char arr2[]={'A','b'};
        System.out.println(Arrays.compare(arr1,arr2));
    }

    private void varArgs(String... strArr){
        for(String e:strArr){
            System.out.println(e);
        }

    }
}
