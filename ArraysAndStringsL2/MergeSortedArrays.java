
/**
 * Merge two sorted arrays into a single sorted array.
 * Time Complexity: O(n + m) where n and m are the lengths of the two arrays
 * Space Complexity: O(n + m) for the result array
 * Author: RaviKumar K
 */
class MergeSortedArrays{
	

	public static int[] mergesortedarr(int[] arr1, int[] arr2) {


		if(arr1 == null && arr2 == null) {

		   return null;

		}

		if(arr1 == null) {
		   return arr2;
		}

		if(arr2 == null) {

		  return arr1;
		}

		int len1 = arr1.length;
		int len2 = arr2.length;

		//Result array

		int[] res = new int[len1+len2];

		int k=0;
		int i=0;
		int j=0;

		while(i<len1 && j<len2){

			if(arr1[i]<arr2[j]) {

				res[k] = arr1[i];
				i++;
				k++;
			}else {
			    res[k] = arr2[j];
			    k++;
			    j++;
			}
		}

		if(i<len1) {

		  while(i<len1) {
		    res[k] = arr1[i];
		    k++;
		    i++;
		  }
		}

		if(j<len2) {

			res[k] = arr2[j];
			k++;
			j++;
		}

		return res;

	}

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        
        int[] mergedArray = mergesortedarr(array1, array2);
        
        System.out.print("Merged Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

	
}