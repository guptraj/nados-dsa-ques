public class mergeSort {

    merge(int [] left,int [] right ){
        int [] ans = new int[left+ right];
        int x = Math.min(left,right);
        int idx=0;
        for(int i=0;i<x-1;i++){
            if(left[i]<right[i]){
            ans[idx]=left[i]
            idx++;}
            else{
                ans[idx]=right[i];
                idx++;
            }
        }
        if(left.length >x){
            for(i=x;left.lenght-1)
            ans=
        }

    }
    mergeSort{
        int mid = start + end /2;
        int [] left = mergeSort(arr,start,mid);
        int [] right = mergeSort(arr,mid+1,end);
       int [] ans= merge(left,right);
       

        
    }
}
