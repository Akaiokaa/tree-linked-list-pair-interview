public class BlueQ2 {
    public static void main(String[] args) {
        ;
        System.out.println(listRange(new ListNode(1, new ListNode(100, new ListNode(10000)))));
    }
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
        return null;
    }
    //
    public static int listRange(ListNode root){
        if(root == null) return 0;
        int min = root.data;
        int max = root.data;
        // 1 2 3 
        while(root != null && root.next != null){
            if (max < root.next.data) {
                max = root.next.data;
            }
            if (max > root.next.data) {
                min = root.next.data;
            }
            root = root.next;
        }
    

        return max - min;
    }
    public static int treeRange(TreeNode root){
        return 0;
    }
    

}
