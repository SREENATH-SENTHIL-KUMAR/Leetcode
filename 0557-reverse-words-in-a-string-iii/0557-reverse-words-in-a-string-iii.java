class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int ss=0;
        for(int i=0;i<=arr.length;i++){
            if(i==arr.length || arr[i]==' '){
                reverse(arr,ss,i-1);
                ss=i+1;
            }
        }
        return new String(arr);
    }
    public static void reverse(char[] arr,int l,int r){
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}