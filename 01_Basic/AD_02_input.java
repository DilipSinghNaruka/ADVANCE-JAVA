import java.util.Scanner;

class AD_02_input{
    public static void main( String arg[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your String Input here :-");
        String inputStr = obj.nextLine();

        System.out.println("Enter Your Bool Input here :-");
        Boolean inputBool = obj.nextBoolean();

        System.out.println("Enter Your Byte Input here :-");
        byte inputByte = obj.nextByte();


        System.out.println("Enter Your Double Input here :-");
        Double inputDouble = obj.nextDouble();

        System.out.println("Enter Your Float Input here :-");
        Float inputFloat = obj.nextFloat();

        System.out.println("Enter Your Int Input here :-");
        int inputInt = obj.nextInt();

        System.out.println("Enter Your Long Input here :-");
        Long inputLong = obj.nextLong();


        System.out.println("Enter Your Short Input here :-");
        short inputshort = obj.nextShort();




        System.out.println("This is you are Type in String :- "+inputStr);
        System.out.println("This is you are Type in Bool :- "+inputBool);
        System.out.println("This is you are Type in Byte :- "+inputByte);
        System.out.println("This is you are Type in Double :- "+inputDouble);
        System.out.println("This is you are Type in Float :- "+inputFloat);
        System.out.println("This is you are Type in Int :- "+inputInt);
        System.out.println("This is you are Type in Long :- "+inputLong);
        System.out.println("This is you are Type in Short :- "+inputshort);
    }

}