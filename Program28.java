public class Program28 {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        try{

            if(age<18){
                System.out.println("Hello "+name+ " Your are "+age+" years old and You are Teenager!");
            }
            else if(age>=18 && age<30){
                System.out.println("Hello "+name+ " Your are "+age+" years old and You are young aged!");
            }
            else if(age>=30 && age<50){
                System.out.println("Hello "+name+ " Your are "+age+" years old and You are middle-aged!");
            }
            else if(age>=50){
                System.out.println("Hello "+name+ " Your are "+age+" years old and You are a old-person!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
