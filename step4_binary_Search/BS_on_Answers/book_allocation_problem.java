package step4_binary_Search.BS_on_Answers;

public class book_allocation_problem {
    public int findPages(int[] nums, int m){
        if(m >nums.length){
            return -1;
        }

        int low = 0;
        int high = 0;
        for(int num: nums){
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;

            int count = 1;
            int pages = 0;
            for(int num: nums){
                if(pages + num <= mid){
                    pages += num;
                }
                else{
                    count++;
                    pages = num;
                }
            }

            if(count <= m){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        book_allocation_problem obj = new book_allocation_problem();
        int[] nums = {12, 34, 67, 90};
        int m = 2;
        int result = obj.findPages(nums, m);
        System.out.println(result);
    }
}
