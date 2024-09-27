public class main {
    public static void main(String[] args) {
        
        BST bst = new BST();
    	System.out.println(bst.isAVL());
    	int[] values = new int[]{41,20,11,29,32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
            System.out.println(bst.isAVL());

    	bst = new BST();
    	bst.add(1);
    	System.out.println(bst.isAVL());
    	bst.add(2);
    	System.out.println(bst.isAVL());
    	bst.add(3);
    	System.out.println(bst.isAVL());


		bst = new BST();
    	bst.add(1);
    	System.out.println(bst.isAVL());
    	bst.add(3);
    	System.out.println(bst.isAVL());
    	bst.add(2);
    	System.out.println(bst.isAVL());    	

    	bst = new BST();
    	bst.add(10);
    	System.out.println(bst.isAVL());
    	bst.add(5);
    	System.out.println(bst.isAVL());
    	bst.add(1);
    	System.out.println(bst.isAVL());

    	bst = new BST();
    	bst.add(10);
    	System.out.println(bst.isAVL());
    	bst.add(5);
    	System.out.println(bst.isAVL());
    	bst.add(6);
    	System.out.println(bst.isAVL());

        bst = new BST();
    	values = new int[]{90,13,4,8,37,16,24,44,
    		42,88,51,72,81,84,92};
    	for (int i : values)
    		bst.add(i);
        System.out.println(bst.isAVL());

        bst = new BST();
		values = new int[]{23, 12, 40, 9, 25, 60, 50};
    	for (int i : values)
    		bst.add(i);
        System.out.println(bst.isAVL());

        bst = new BST();
        values = new int[]{1, 2, 3, 9, 12, 6, 5, 48, 59, 99, 67, 56, 4};
        for (int i : values)
            bst.add(i);
        System.out.println(bst.isAVL());
    }
}
