package exam;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int[] arr1={1,2,3}; // One dimensional array
//        int[][] arr2={{1,2},{3,4}}; //Two dimensional array
//        for(int[] e:arr2)
//            for(int e1:e)
//                System.out.println(e1);
//
//        //Three-dimensional array
//        int[][][] arr3={{{1,2},{3,4}},{{5,6},{7,8}}};
//        for(int[][] e: arr3)
//            for(int[] e1:e)
//                for(int e3:e1)
//                    System.out.println(e3);
        //Sparse Array
        int[][] arr={{1,2},{3},{1,2,3,4}};
        for(int[] e:arr)
            for(int e1:e)
                System.out.println(e1);


    }
}
