package day3;

import java.util.*;

class AdventToCode3 {

// R75,D30,R83,U83,L12,D49,R71,U7,L72
// U62,R66,U55,R34,D71,R55,D58,R83

// 135
// "R","U","R","D","R","U","L","D","R","U","R"
// 98,47,26,63,33,87,62,20,33,53,51
// "U","R","D","R","D","R","U","R","U","R"
// 98,91,20,16,67,40,7,15,6,7

String[] operationOne = new String [] {
    //"R","U","R","D","R","U","L","D","R","U","R"
    "R","D","L","U","R","D","R","D","L","D","R","U","L","D","R","U","R","U","L","U","L","D","L","U","L","D",
    "L","D","L","U","R","U","L","U","R","D","L","U","L","D","L","U","L","D","L","D","R","D","L","U","L","D",
    "L","D","R","D","L","U","L","D","L","D","R","D","L","D","R","D","R","D","L","D","L","U","L","U","R","U",
    "R","U","R","D","R","U","L","U","R","U","L","U","R","U","R","U","R","U","R","U","L","D","R","U","L",
    "U","L","D","L","U","L","D","L","U","R","U","L","U","L","D","L","D","R","U","R","U","R","D","L","D","R",
    "D","L","D","R","U","L","D","R","D","R","U","L","U","R","U","R","U","L","U","R","D","L","D","R","D","R",
    "D","R","D","R","D","L","D","L","U","L","D","L","D","L","D","R","D","L","U","L","U","R","U","R","U","R",
    "D","L","U","L","D","L","D","R","U","L","U","L","U","R","D","L","U","L","U","R","U","R","U","L","D","L",
    "U","L","U","L","U","L","D","L","D","R","D","R","U","L","D","R","D","L","U","R","U","R","D","R","D","R",
    "U","L","D","R","U","R","D","L","D","R","D","L","U","R","U","L","U","R","D","L","D","R","D","L","U","L",
    "U","R","U","L","D","R","U","R","D","L","U","L","U","L","D","R","U","L","U","L","D","L","U","R","U","R",
    "D","L","U","L","U","R","U","L","D","L","U","R","D","R","U","R"
 };

int [] stepsOne = new int []{
 //   98,47,26,63,33,87,62,20,33,53,51
1008,256,88,390,429,828,2,452,644,942,387,221,274,837,437,664,952,126,840,425,749,199,48,394,
623,562,760,856,648,666,756,396,588,217,208,492,230,60,178,211,806,423,399,159,176,555,173,946,
360,415,734,441,146,332,135,529,364,742,862,790,399,392,706,740,839,950,822,27,108,873,492,465,
635,771,586,66,703,943,141,396,641,339,460,295,397,799,479,963,211,933,158,248,443,807,115,885,
670,116,24,980,349,363,413,444,453,497,202,300,122,895,210,218,456,293,576,968,612,225,732,34,
800,925,731,520,686,181,102,824,832,527,614,624,734,552,911,352,157,70,958,317,43,902,265,986,305,
264,957,888,66,413,73,642,14,559,414,985,679,965,333,332,261,446,479,430,730,37,936,615,344,215,912,
95,691,383,328,560,806,711,515,448,403,109,589,458,240,375,88,479,93,794,303,783,833,500,406,589,694,
504,484,695,228,813,646,768,60,326,580,840,387,147,50,155,454,574,885,705,727,827,409,335,271,388,
897,563,360,70,777,903,363,202,855,159,35,585,384,540,78,13,979,702,868,868,508,552,735,923,840,
133,355,282,626,699,560,26,902,873,333,492,96,461,261,784,793,723,887,836,790,400,331,389,107,534,377,
831,181,325,328,778,498,109,692,185,284,930,784,843,261,119,751,313,197,911,21,201,881,119,210,700,93,208,116
};

 String[] operationTwo = new String [] {
   //  "U","R","D","R","D","R","U","R","U","R"
     "L","D","L","U","R","D","R","U","L","D","R","U","R","U","R","D","R","D","L","U","L","D","L","D","R","U","R","D",
     "L","U","R","U","R","D","L","D","R","U","L","U","R","U","R","D","R","U","L","D","L","D","L","U","R","U","R",
     "U","L","D","L","U","L","D","R","D","L","D","L","U","L","D","L","U","L","D","L","D","R","U","L","D","L","D","R",
     "U","R","D","R","U","L","U","R","D","L","U","L","U","L","D","R","D","L","D","R","U","R","D","R","D","R","U",
     "R","U","L","U","R","U","R","D","L","D","R","U","R","D","L","D","R","U","L","D","R","D","L","D","R","D","L",
     "U","L","D","R","D","R","D","L","D","L","U","R","D","R","U","R","D","R","D","R","D","R","D","R","D","L","D",
     "L","U","L","U","R","U","R","U","R","U","L","U","L","D","L","U","L","U","L","D","L","U","L","U","L","D","R","D",
     "L","U","R","U","L","D","R","U","L","U","L","U","L","U","L","U","R","D","R","U","R","U","R","D","R","D","R","D",
     "R","U","L","D","L","U","L","U","L","U","R","D","R","D","L","U","R","U","L","U","L","U","R","U","R","U","L","U",
     "L","U","R","D","L","U","L","D","L","D","R","D","L","D","L","D","L","U","R","U","R","U","L","U","R","D","L","U",
     "L","D","R","D","L","U","L","U","L","U","L","D","L","U","R","D","R","U","R","D","R","U","R","D","L"
};
 int [] stepsTwo = new int []{
    //98,91,20,16,67,40,7,15,6,7
    1009,700,634,294,898,947,650,988,623,968,761,490,525,76,633,139,348,855,983,
    553,454,211,240,465,260,285,653,734,346,434,813,599,98,779,58,6,309,437,712,896,
    262,911,400,247,297,915,223,591,755,398,980,177,186,882,418,763,741,60,942,648,430,
    401,30,157,901,179,615,535,586,613,606,239,133,251,549,579,612,307,127,343,43,288,245,
    122,352,527,476,24,805,291,953,469,941,577,384,345,463,50,311,649,746,902,644,913,147,649,
    848,673,93,65,363,734,289,599,738,45,128,508,93,201,51,239,17,496,661,912,165,291,207,308,241,
    388,910,821,714,327,605,880,682,934,334,1,602,54,51,913,575,168,614,603,452,718,689,505,83,385,
    636,692,424,573,686,572,467,698,21,510,497,329,286,733,584,919,499,971,558,511,565,623,502,536,
    483,372,686,420,900,316,37,372,915,641,165,927,137,231,813,416,131,530,486,795,507,757,208,308,
    521,583,758,654,554,467,381,155,47,829,92,158,54,500,17,471,748,571,194,55,921,271,730,207,204,
    806,19,33,218,911,106,220,551,308,268,5,374,657,639,705,294,962,927,892,477,290,378,193,154,859,
    618,690,769,779,752,915,693,586,558,864,523,354,386,236,888,302,75,628,132,306,939,73,687,488,
    21,760,856,96,116,557,639,812,389,364,807,696,781,625,565,728,134,406,785,583,60,819,939
};


int [] outputDataPointsX = new int [] {-1009, -1643, -745, -95, -718, 43, 568, 1201, 1549, 566, 112, -128, 132, 785,
     439, 1252, 1350, 1292, 1601, 889, 1151, 1848, 1625, 870, -110, 76, 494, 0
};

int[] outputDataPointsY = new int[] {-700, -406, -1353, -365, -1333, -843, -767, -906, -1761, -1208, -1419, -1884,
     -1599, -2333, -1899, -1300, -2079, -2085, -1648, -752, 159, -88, 827, 236, -162, 15, 897};

//X=
// -1009, -1643, -745, -95, -718, 43, 568, 1201, 1549, 566, 112, -128, 132, 785, 439, 1252, 1350, 1292, 1601, 889, 1151, 1848, 1625, 870, -110, 76, 494, 0

// Y=
// -700, -406, -1353, -365, -1333, -843, -767, -906, -1761, -1208, -1419, -1884, -1599, -2333, -1899, -1300, -2079, -2085, -1648, -752, 159, -88, 827, 236, -162, 15, 897

List<Integer> cartezianOneX = new ArrayList<>();
List<Integer> cartezianOneY = new ArrayList<>();


List<Integer> cartezianTwoX = new ArrayList<>();
List<Integer> cartezianTwoY = new ArrayList<>();

//3.
void sumOfData(){
    int sumX = 0;
    for(int indexX : outputDataPointsX)
        sumX +=  Math.abs(indexX);
    
        int sumY = 0;
        for(int indexY : outputDataPointsY)
            sumY +=  Math.abs(indexY);

        System.out.println("Suma points este: " + (sumX +sumY));
}

void fullFillData(){
   getPoints(operationOne, stepsOne, cartezianOneX, cartezianOneY);
   getPoints(operationTwo, stepsTwo, cartezianTwoX, cartezianTwoY);
}
//2.
void findMinimumCommon(){
    ArrayList<ArrayList<Integer> > linesDotsOne = create2DArrayList(cartezianOneX, cartezianOneY) ;
 //   System.out.println("Dots One: " + linesDotsOne);
    ArrayList<ArrayList<Integer> > linesDotsTwo = create2DArrayList(cartezianTwoX, cartezianTwoY) ;
 //   System.out.println("Dots One: " + linesDotsTwo);


    for(ArrayList<Integer> indexOne:linesDotsOne)
        for(ArrayList<Integer> indexTwo:linesDotsTwo)
            if(indexOne.equals(indexTwo)){
                int minimumSum = (Math.abs(indexOne.get(0)) + Math.abs(indexOne.get(1)));
                
                System.out.println("Index :" + indexOne + "Sum: " + minimumSum + " iterator: " + linesDotsTwo.indexOf(indexTwo));
                if (minimumSum == 870)
                    return;
            }
                 
    // if (linesDotsOne.get(0).equals(linesDotsTwo.get(10))){
    //     System.out.println ("Compare: True");
    // }
    // else{
    //     System.out.println ("Compare: False");
    // }
    // System.out.println ("Get linesDots: " + linesDotsOne.get(0) + " si  "+ linesDotsTwo.get(0) );
}

ArrayList<ArrayList<Integer> >  create2DArrayList(List<Integer> cartezianX ,List<Integer> cartezianY) { 
        int index = 0;
        /*Declaring 2D ArrayList*/
        ArrayList<ArrayList<Integer> > linesDots = new ArrayList<ArrayList<Integer> >(); 

        for(int i=0 ; i<cartezianX.size()-1;i++){
            int startX = cartezianX.get(i);
            int endX = cartezianX.get(i+1);

            int startY = cartezianY.get(i);
            int endY = cartezianY.get(i+1);

            if(startX == endX){
                if (startY < endY) {
                    for (int j=startY;j<=endY;j++){
                     linesDots.add(index, new ArrayList<>(Arrays.asList(startX,j))); 
                    index++;
                    }
                }
                else {
                    for (int j=startY;j>=endY;j--){
                        linesDots.add(index, new ArrayList<>(Arrays.asList(startX,j))); 
                        index++;
                    }
                }           
            }
            else{
                if(startX < endX) {
                    for (int j=startX;j<=endX;j++){
                        linesDots.add(index, new ArrayList<>(Arrays.asList(j,startY))); 
                        index++;
                    }   
                }
                else {
                    for (int j=startX;j>=endX;j--){
                         linesDots.add(index, new ArrayList<>(Arrays.asList(j,startY))); 
                        index++;
                    }                       
            }    
        }
    }
        return linesDots;
    }

void getPoints(String[] operation, int[] steps , List<Integer> cartezianX ,List<Integer> cartezianY ){
    int bufferCartezianX = 0;
    int bufferCartezianY = 0;
    cartezianX.add(bufferCartezianX);
    cartezianY.add(bufferCartezianY);

    ArrayList<ArrayList<Integer> > linesDots = new ArrayList<ArrayList<Integer> >(); 
    /*one space allocated for 0th row*/
    linesDots.add(new ArrayList<Integer>()); 

    for(int i =0; i<operation.length;i++ ){
        if(cartezianX.size() != 0){ // last value from list
            bufferCartezianX = cartezianX.get(cartezianX.size()-1);
            bufferCartezianY = cartezianY.get(cartezianY.size()-1);
        }
        
        switch (operation[i]){
            case "R": // x dimension +
            bufferCartezianX += steps[i];
            break;
            case "L": // x dimension -
            bufferCartezianX -= steps[i];
            break;
            case "U": // y dimension +
            bufferCartezianY += steps[i];
            break;
            case "D": //z dimension -
            bufferCartezianY -= steps[i];
            break;
        }

        cartezianX.add(bufferCartezianX);
        cartezianY.add(bufferCartezianY);

    }
    
    System.out.println("Buffer Cartezian X" + cartezianX);
    System.out.println("Buffer Cartezian Y" + cartezianY  );


}



}