public class BinarySetCount{
  public static void main(String[] args) {
  	int num = Integer.parseInt(args[0]);
    long startAt = System.currentTimeMillis();
    int binarySets = countBinarySet(num);
    long endAt = System.currentTimeMillis();;
    System.out.println("Total Set Count: "+binarySets);
    System.out.println("Time elapsed: "+ (endAt - startAt)+" millis");
  }
  
  // return binary set count for a given number
  private static int binarySetOf(int num){
    int setCount = 0;
    while(num > 0){
        if(num % 2 == 1){
            setCount++;
        }
        num = num / 2;
    }
    return setCount;
  }
  
  // return total binary set count from 1 to given number
  public static int countBinarySet(int num){
    int count = 0;
    for(int i=1; i<=num; i++){
      int c = binarySetOf(i);
      count += c;
      System.out.println("Binary set of "+i+" : "+c);
    }
    return count;
  }
}
