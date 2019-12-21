package day2;

class AdventToCode2{

//19690720 - output
int[] puzzleInput = new int [] {
    1,84,78,3,1,1,2,3,1,3,4,3,1,5,0,3,2,6,1,19,1,5,19,23,2,9,23,27,1,6,27,
    31,1,31,9,35,2,35,10,39,1,5,39,43,2,43,9,47,1,5,47,51,1,51,5,55,1,
    55,9,59,2,59,13,63,1,63,9,67,1,9,67,71,2,71,10,75,1,75,6,79,2,10,
    79,83,1,5,83,87,2,87,10,91,1,91,5,95,1,6,95,99,2,99,13,103,1,103,
    6,107,1,107,5,111,2,6,111,115,1,115,13,119,1,119,2,123,1,5,123,0,99,2,0,14,0
};

int[] puzzleInputTest = new int[] {1,1,1,4,99,5,6,0,99 };

// 1,0,0,0,99 becomes 2,0,0,0,99 (1 + 1 = 2).
// 2,3,0,3,99 becomes 2,3,0,6,99 (3 * 2 = 6).
// 2,4,4,5,99,0 becomes 2,4,4,5,99,9801 (99 * 99 = 9801).
// 1,1,1,4,99,5,6,0,99 becomes 30,1,1,4,2,5,6,0,99.

void resolvePuzzleInput(){


    int[]puzzleLocal = puzzleInput.clone();

    for(int i=0; i<puzzleLocal.length;i=i+4){
        int operation = puzzleLocal[i];
        int valueObtained = 0;

        switch (operation) {
        case 1:
            valueObtained = puzzleLocal[puzzleLocal[i+1]] + puzzleLocal[puzzleLocal[i+2]];break;
        case 2:
            valueObtained = puzzleLocal[puzzleLocal[i+1]] * puzzleLocal[puzzleLocal[i+2]];break;
        case 99:
           printPuzzleOutput( puzzleLocal );
        
           //   if(puzzleLocal[0] == 19690720){
            //  int nounVerb = 100 * verb + noun;
            System.out.println("Noun * 100+ Verb: " +  (84*100 + 78));
        // }
            return;
        }    
     //   System.out.println("i+3 = --------------------" +  (i+3));
        puzzleLocal[puzzleLocal[i+3]] = valueObtained; 
    }
}

    void printPuzzleOutput( int[]puzzleLocal ){
        for(int i=0; i<puzzleLocal.length;i=i+1){
                 System.out.print(", " + puzzleLocal[i]);
        }
    }

    //19690720 - output
    void findNounVerb(){

        int[] localArray = puzzleInput.clone();

        for(int verb=0;verb<=99 ;verb++){
            for(int noun=0;noun<=99;noun++){
                localArray [1] = verb;
                localArray [2] = noun;
             resolvePuzzleInput(localArray, verb, noun);      
            }
        }
    }


}