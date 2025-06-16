public class BlueQ2 {
    /**
     * Returns which has a higher range: a given linked list or a given tree.
     * The range of a data structure is the difference between its highest
     * value and its lowest value.
     * 
     * Returns "list" if the list has a higher range and "tree" if the tree has
     * a higher range. You can assume there will not be a tie, and neither head
     * nor root will be null.
     * 
     * Example:
     *   List:
     *      7 -> 8 -> -2 -> 9 -> 21
     *   Tree:
     *            12
     *          /    \
     *         6      18
     *        / \    /  
     *       4   8  16  
     *   Expected Answer: "list"
     * 
     * Explanation:
     *   The largest number in the list is 21 and -2 is the smallest.
     *   Thus the range of the list is 21 - -2 = 23
     *   The largest number in the tree is 18, and 4 is the smallest.
     *   Thus the range of the tree is 18 - 4 = 14
     *   23 is bigger than 14, so the list has the bigger range.
     *    
     * 
     * @param head the head of the list
     * @param root the root of the tree
     * @return "list" if the list has a bigger range, "tree" otherwise
     */
    public static String biggerRange(ListNode head, TreeNode root) {
        /*
         int treeRange
         int listRange

         loop through the listnode
          int min
           if()
          int max
           if()
           While
         

         */
        int min = head.data;
        int max = head.data;
        while(head != null){
            if (head.data < min) {
                min = head.data;
            }
            if (head.data > max) {
                max = head.data;
            }
            head = head.next;
        }
        int listRange = max - min;
        int treeMax = treeRangeMax(root);
        int treeMin = treeRangeMin(root);
        int treeRange = treeMax - treeMin;
        return listRange > treeRange ? "list" : "tree";
    }
    public static int treeRangeMin(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        int leftMin = treeRangeMin(root.left);
        int rightMin = treeRangeMin(root.right);
        int min = root.data;
        min = Math.min(min, leftMin);
        min = Math.min(min, rightMin);

        return min;
    }
    public static int treeRangeMax(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        int leftMax= treeRangeMax(root.left);
        int rightMax= treeRangeMax(root.right);
        int max = root.data;
        max = Math.max(max, leftMax);
        max = Math.max(max, rightMax);

        return max;
    }
    

}
