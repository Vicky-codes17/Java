public class Main {
    public static void main(String[] args) 
    {
        //Value of a,b,c
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2 = 0;
            //Calculate the determinant (b^2 - 4ac)
            double determinant = b * b - 4* a * c;
            //Chek if the determinant is greter than zero
        if(determinant > 0) 
        {
            //Two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root1 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f",root1,root2);
        }
            //Check if the determinant is equal to zero
            else if(determinant == 0)
            {
                //Two real and equal roots & determinant is equal to 0
                root1 = root2 = -b/(2*a);
                System.out.format("root1 = root2 = %.2f", root1);
            }
            else
            {
                    double real = -b/(2*a);
                    double imaginary = Math.sqrt(-determinant) / (2*a);
                System.out.format("root1 = %.2f + %.2fi\n",real,imaginary);
                System.out.format("root2 = %.2f + %.2fi", real,imaginary);
            }
    }

}
