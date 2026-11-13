class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        dfs(root,target,sum,arr,list);
        return list;
    }
    public void dfs(TreeNode root,int target,int sum,ArrayList<Integer> arr,List<List<Integer>> list){
        if(root==null) return;
        sum = sum + root.val;
        arr.add(root.val);
        if(root.left==null && root.right==null )
        {
            if(sum==target) list.add(new ArrayList<>(arr));

        }
        dfs(root.left,target,sum,arr,list);
        dfs(root.right,target,sum,arr,list);
        arr.remove(arr.size()-1);
    }
}