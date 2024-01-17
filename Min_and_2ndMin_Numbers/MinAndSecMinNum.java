class MinAndSecMinNum{
    public static void main(String[] args) {
        int[] arr = {3,1,5,7,6,9};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("Minimum Number : "+first);
        System.out.println("Second Minimum : "+second);
    }
}