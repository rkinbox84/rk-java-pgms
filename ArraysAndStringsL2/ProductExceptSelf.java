class ProductExceptSelf {
	
	public void mulArrayElem(int[] inpArray){

		if(inpArray == null || inpArray.length == 0) {

			return;

		}

		//initialise left and right products
		int[] left = new int[inpArray.length];
		int[] right = new int[inpArray.length];

		//calculate left products

		left[0] = 1;
		

		for (int i=1; i < inpArray.length; i++) {
			left[i] = left[i-1] * inpArray[i-1];

		}

		right[inpArray.length-1] = 1;

		for(int j=inpArray.length-2 ; j > -1; j--) {

		   right[j] = right[j+1] * inpArray[j+1];
		}

		//Multiply and get answer

		int[] res = new int[inpArray.length];

		for(int k=0; k< inpArray.length; k++) {

			res[k] = left[k] * right [k];
		}

        for (int i : res) {
            System.out.println(i);
        }


	}

    public static void main(String[] args) {
        ProductExceptSelf pes = new ProductExceptSelf();
        int[] input = {1, 2, 3, 0};
        pes.mulArrayElem(input);
    }
}