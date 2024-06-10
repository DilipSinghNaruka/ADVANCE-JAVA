public class AD_09_String {
    public static void main(String args[]){
        // String by using literals
        String var = "Jai Shree Ram";
        // System.out.println(var);

        // String by using new keyword ( inside this JVM will create a new String object in normal(non-pool) heap memory)
        String s = new String("JAI SHREE KRISHANA");
        // System.out.println(s);
        // -----------------------------------------------------

        char ch[] = {'R','a','m'};
        String conv = new String(ch);
        // System.out.println(conv);
        // ---------------------------------------------------------
        // ----------------------------------------------------------

        // java some methods ---------------------------------- 
        // length method
        // System.out.println("JAVA LENGTH METHOD CALLED ! ");
        // System.out.println(var.length());
        // System.out.println(conv.length());
        // -------------------------------------------------------
        
        // compare method
        // System.out.println("JAVA Compare METHOD CALLED ! ");
        // System.out.println(var.compareTo("Ram")); // output is -8 because j is 8 time small to R
        // System.out.println(conv.compareToIgnoreCase("Ram")); // output is 0 because both are equal
        // ------------------------------------------------------------------------------------------------


        // length concat()
        // System.out.println("JAVA CONCAT METHOD CALLED ! ");
        // System.out.println(var.concat(s));
        // System.out.println(conv.concat(s));
        // ---------------------------------------------------------------------------

        // // SPLIT method -- this is not running propraly
        // System.out.println("JAVA SPLIT METHOD CALLED ! ");
        // String[]sp = var.split("\\s"); 
        // System.out.println(sp.toString());
        // // System.out.println(conv.equals(s));
        // ----------------------------------------------------------------------------


        // // replace method 
        // System.out.println("JAVA replace METHOD CALLED ! ");
        System.out.println(var.replace("Ram", "Krishana"));
        System.out.println(conv.replace("Ram", "krishana"));
        // ----------------------------------------------------------------------------




    }
    
}
