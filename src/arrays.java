public class Arrays {

public static void oddArray(int[] arr){ // this is the function which divides odd numbers of array
  int oddCount = 0;
  for (int i = 0; i < arr.length; i++) {
    if (arr[i]%2==1) {
      oddCount ++;
    }
  }
  int idx = 0;
  int[] result = new int[oddCount] ;
 for (int i = 0; i < arr.length; i++) {
  if (arr[i]%2==1) {
    result[idx] = arr[i];
    idx++;
  }
 }

}

}
