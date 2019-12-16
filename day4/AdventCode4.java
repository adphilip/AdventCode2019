import java.util.Arrays;



class AdventCode4 {
//307237-769058

int[] digitsInfo = new int[6];
int countFew = 0;
int countTwo = 0;

void countNumbers(){

    int count = 0;

//769058 307237
    for(int i=307237;i<=769058;i++){
        digitsInfo[0] = i/100000%10;
        digitsInfo[1] = i/10000%10;
        digitsInfo[2] = i/1000%10;
        digitsInfo[3] = i/100%10;
        digitsInfo[4] = i/10%10;
        digitsInfo[5] = i%10;


        if(digitsInfo[0]<=digitsInfo[1] &&
        digitsInfo[1]<=digitsInfo[2] &&
        digitsInfo[2]<=digitsInfo[3] &&
        digitsInfo[3]<=digitsInfo[4] &&
        digitsInfo[4]<=digitsInfo[5] &&
        ((digitsInfo[0]==digitsInfo[1]) ||
        (digitsInfo[1]==digitsInfo[2]) ||
        (digitsInfo[2]==digitsInfo[3]) ||
        (digitsInfo[3]==digitsInfo[4]) ||
        (digitsInfo[4]==digitsInfo[5]) )
        ) {
            count++;
            
            // duplicate(digitsInfo, i);
            //System.out.println("i =  " + i );

            countRestrictive(digitsInfo, i);

        }
        

        //System.out.println("countFew =  " + countFew );
       // break;
    }

    System.out.println("count =  " + count +"countRestrictive :" + countTwo);
}

public void countRestrictive(int numbers[], int numberOriginal) {

    int[] howManyTimes = new int[10];

    for(int index: numbers){
        switch (index) {
            case 0 :
            howManyTimes[0]++;
            break;
            case 1 :
            howManyTimes[1]++;
            break;
            case 2 :
            howManyTimes[2]++;
            break;
            case 3 :
            howManyTimes[3]++;
            break;
            case 4 :
            howManyTimes[4]++;
            break;
            case 5 :
            howManyTimes[5]++;
            break;
            case 6 :
            howManyTimes[6]++;
            break;
            case 7 :
            howManyTimes[7]++;
            break;
            case 8 :
            howManyTimes[8]++;
            break;
            case 9 :
            howManyTimes[9]++;
            break;
        }
    }

    for(int i = 0; i<=9; i++){
       if(howManyTimes[i] == 2){
           countTwo ++;
           System.out.println("Number restrictive: " + numberOriginal);
           break;
       }
    
    }
}

public void duplicate(int numbers[], int numberOriginal) {

    int temp = 0;
   
    // I chose to do a bubble sort of the array,
// but you are free to use any method you wish (e.g. Arrays.sort)
//System.out.print("1. Duplicates values: ");
for (int i=0; i < numbers.length; ++i) {
    for (int j=1; j < (numbers.length - i); ++j) {
        if (numbers[j-1] > numbers[j]) {
            temp = numbers[j-1];
            numbers[j-1] = numbers[j];
            numbers[j] = temp;
        }
    }
}
// walk through the sorted array and count duplicates
int numDup = 0, dupCount = 0;
int previous = -1;
for (int i=0; i < numbers.length; ++i) {
    if (numbers[i] == previous) {
        ++numDup;
        if (numDup == 1) {
            ++dupCount;
            if (dupCount == 1) {
  //              System.out.print(numbers[i] );
                
            }
            else {
    //            System.out.print(", " + numbers[i]);
                
            }
        }
    }
    else {
        previous = numbers[i];
        numDup = 0;
    }
}

//System.out.println("\n2. Number of duplicates values: " + dupCount + " i =" + numberOriginal );

//System.out.println("i =" + numberOriginal );
//return dupCount;
}


}