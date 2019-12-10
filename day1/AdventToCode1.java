public class AdventToCode1 {

    private double[] adventCodeOneTest = new double[]{12,14,1969,100756};

    private double[] adventCodeOne = new double[]{
        104489,
        69854,
        93424,
        103763,
        119636,
        130562,
        121744,
        84851,
        143661,
        94519,
        116576,
        148771,
        74038,
        131735,
        95594,
        125198,
        92217,
        84471,
        53518,
        97787,
        55422,
        137807,
        78806,
        74665,
        103930,
        121642,
        123008,
        104598,
        97383,
        129359,
        85372,
        88930,
        106944,
        118404,
        126095,
        67230,
        116697,
        85950,
        148291,
        123171,
        82736,
        52753,
        134746,
        53238,
        74952,
        105933,
        104613,
        115283,
        80320,
        139152,
        76455,
        66729,
        81209,
        130176,
        116843,
        67292,
        74262,
        131694,
        92817,
        51540,
        58957,
        143342,
        76896,
        129631,
        77148,
        129784,
        115307,
        96214,
        110538,
        51492,
        124376,
        78161,
        59821,
        58184,
        132524,
        130714,
        112653,
        137988,
        112269,
        62214,
        115989,
        123073,
        119711,
        82258,
        67695,
        81023,
        70012,
        93438,
        131749,
        103652,
        63557,
        88224,
        117414,
        75579,
        146422,
        139852,
        85116,
        124902,
        143167,
        147781
    };

    void printAdventToCode(){
        for (double index:adventCodeOne ) {
            System.out.println("Advent One input : " + index);
        }
    }
    //For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
    //For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
    // For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
    // For a mass of 1969, the fuel required is 654.
    // For a mass of 100756, the fuel required is 33583.
    void fuelConsumtion(){
        long totalFuel = 0;
        long shipFuel = 0;
        long totalRecursiveFuel = 0;
        for (double index:adventCodeOne) {
             shipFuel =  (long)(Math.floor(index / 3) ) -2 ;
             System.out.println("Advent One Output : " + shipFuel);
             totalFuel += shipFuel;

             //RecursiveFuel
             long recursiveFuel = 0;          
             recursiveFuel = fuelConsumtionRecursive(recursiveFuel,index);
             totalRecursiveFuel += recursiveFuel;
    }
    System.out.println("TOTAL 1: Advent Total Output : " + totalFuel);
    System.out.println("TOTAL 2: Advent Total Recursive Output : " + totalRecursiveFuel);
    }

    // A module of mass 14 requires 2 fuel. This fuel requires no further fuel (2 divided by 3 and rounded down is 0, which would call for a negative fuel), so the total fuel required is still just 2.
    // At first, a module of mass 1969 requires 654 fuel. Then, this fuel requires 216 more fuel (654 / 3 - 2). 216 then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel, which requires no further fuel. So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.
    // The fuel required by a module of mass 100756 and its fuel is: 33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.
    long fuelConsumtionRecursive(long totalFuel, double indexFuel){
        if(indexFuel < 0){
            System.out.println("!!! Advent One Total Output Recursive : " + totalFuel);
            return totalFuel;
        }
        indexFuel =  (long)(Math.floor(indexFuel / 3) ) -2 ;
        System.out.println("Advent One Output Recursive : " + indexFuel);
        if (indexFuel >0)
            totalFuel += indexFuel;
        return fuelConsumtionRecursive(totalFuel, indexFuel);       
    }
}