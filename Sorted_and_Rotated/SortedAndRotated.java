class SortedAndRotated{
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2,5};
        int count = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                count++;
            }
        }

        if(arr[arr.length-1] > arr[0]){
            count++;
        }

        if(count <= 1){
            System.out.println("Sorted and Rotated");
        }
        else{
            System.out.println("Not Sorted and Rotated");
        }
    }
}