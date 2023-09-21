public class Arrays 
{
    public static void main(String[] args) 
    {
        int iterate; 
        String[] strArray = {"Alpha","Bravo","charlie","Delta","Echo"};
        System.out.println(" ");
        for (iterate = 0; iterate < strArray.length; iterate++) {
                System.out.println(strArray[iterate]);
        }
        for (iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
        }
        System.out.println(" ");
        for (iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            if (iterate < strArray.length - 1) {
            System.out.print("-");
            } 
        }  
    }
}