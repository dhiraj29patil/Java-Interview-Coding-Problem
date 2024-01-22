class SearchingElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int element = 7;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] == element){
                System.out.println("Found");
                return;
            }
            else if(arr[mid] < element){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("Not Found");
    }
}