class SubarraywithGivenSum{
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int ans = 12;
        int n = arr.length;

        int left = 0;
        int right = 0;
        int sum = arr[0];

        boolean isFound = false;

        while(right < n){
            if(sum == ans){
                isFound = true;
                break;
            }
            else if(sum < ans){
                right++;
                if(right < n)
                    sum += arr[right];
            }
            else{
                sum -= arr[left];
                left++;
            }
        }

        if(isFound){
            System.out.println("Subarray found from index "+left+" to "+right);
        }
        else{
            System.out.println("Subarray Not Found");
        }
    }
}