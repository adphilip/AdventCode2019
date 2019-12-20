package day0;

class RunnableLambda {

public static void main(String args[]) throws InterruptedException{

// Runnable runnableOne = new Runnable(){

//     @Override
//     public void run() {
//         for(int i=0; i<3; i++){
//             System.out.println("Heloo" +
//             Thread.currentThread().getName());
//         }
//     }
// }; // pay attention here

Runnable runnableOne = ()-> {
    for(int i=0; i<3; i++){
            System.out.println("Heloo" +
            Thread.currentThread().getName());
     }
};

    Thread tOne = new Thread(runnableOne);
    tOne.start();
    tOne.join(); // wait for execution

    System.out.println("End Runnable!");
}

}