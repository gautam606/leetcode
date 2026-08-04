class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>flist=new ArrayList<>();
        int m=Integer.MAX_VALUE,n=Integer.MIN_VALUE;
        for(int a:nums)
        {
            list.add(a);
        }
        for(int i=0;i< nums.length;i++)
        {
            m=Integer.min(m,nums[i]);
        }
        for(int i=0;i< nums.length;i++)
        {
            n=Integer.max(n,nums[i]);
        }
        for(int i=m;i<n;i++)
        {
            if(!list.contains(i))
            {
                flist.add(i);
            }
        }
        return flist;
    }
}