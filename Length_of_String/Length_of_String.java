public class Length_of_String{
    public static void main(String[] args){
        String str = "dhiraj";

        int length = 0;

        for(char ch : str.toCharArray()){
            length++;
        }

        System.out.println("Length of String : "+length);
    }
}