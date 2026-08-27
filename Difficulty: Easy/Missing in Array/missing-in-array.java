class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        int check = 1;
        for(int i: arr) {
            if(check == i) {
                check++;
                continue;
            }
            return check;
        } return check;
    }
}