import java.util.Arrays;

public class IndexOfSorted {
	public static void main(String[] args) {
	    
	    int [] cardArray = new int [] {3, 6, 4, 9};
	    System.out.println(indexOf(4, cardArray));
	    
	    int[] numbers = new int[]{1, 3, 4, 67, 9, 21, 27, 32, 24, 14, 78, 2, 3, 4, 7, 30, 13, 6, 17};
	    
	    int minValIndex = 0;
	    for(int i = 0; i < numbers.length; i++) {
	      int minVal = numbers[i];
	      for(int j = i; j < numbers.length; j++) {
	        if(numbers[j] <= minVal) {
	          minVal = numbers[j];
	          minValIndex = j;
	        } 
	      }
	      int temp = numbers[i];
	      numbers[minValIndex] = temp;
	      numbers[i] = minVal;
	    }
	    
	    System.out.println(Arrays.toString(numbers));
	    
	    System.out.println(indexOfSorted(-5, numbers));
	    
	  }
	  
	  public static int indexOf(int card, int[] cards) {
	    int indexOfCard = -1;
	    
	    for (int i=0; i < cards.length; i++) {
	      if (cards [i]==card) {
	        indexOfCard = i;
	      }
	    } 
	    
	    return indexOfCard;
	    
	  }
	  
	  public static int indexOfSorted(int card, int[] cards) {
	    int failure = -1;
	    int oneCheck = 0;
	    if (cards[0] > card || cards[cards.length - 1] < card) {
	      return failure;
	    }
	    
	    int lengthSearch = cards.length;
	    int indexPlace = 0;
	    int direction = 1;
	    
	    while (oneCheck <= 3) {

	    	System.out.println(indexPlace + "   " + lengthSearch + "    " + direction);
	      
	    	if(cards[indexPlace] == card) {
	    		return indexPlace;
	    	} else if(cards[indexPlace] > card) {
	    		direction = -1;
	    	} else {
	    		direction = 1;
	    	}
	    	
	    	indexPlace = indexPlace + (lengthSearch * direction) - (1 * direction);
	    	lengthSearch = (lengthSearch /2) + 1;
	    	if(lengthSearch == 1 || lengthSearch == 2) {
	    		oneCheck++;
	    	}
	    }
	    return failure;
	    
	  }
}
