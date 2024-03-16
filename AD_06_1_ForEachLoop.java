public class AD_06_1_ForEachLoop {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};

        //accessing values using for each
        for (int i : arr) {
            System.out.println(i);
        }

        // Inside this i am using continue statement 
        System.out.println("Continue state below this ");
        for (int i : arr) {
            if(i==30){
                continue;
            }else{
                System.out.println(i);
            }
        }

        // Inside this i am using break statement
        System.out.println("Break statement below this ");
        for(int i:arr){
            if(i==30){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
    
}
