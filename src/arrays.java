public class Arrays {

  // this is the function which divides odd numbers of array
public static void oddArray(int[] arr){ 
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
System.out.println(result);
}
// Reverse an array
public void reverseArray(int[] numbers, int start, int end) {
  while(start<end){
    int temp = numbers[start];
    numbers[start] = numbers[end];
    numbers[end] = temp;
    start++;
    end--;
    
  }
  System.out.println(numbers);
}
// finding minimum value in array
public int  findingMinimumArray(int arr[]) {
  int min = arr[0];
  for(int i = 1; i<arr.length; i++){
    if(arr[i]<min){
      min = arr[i];
    }
  }
  return min;
}




}
