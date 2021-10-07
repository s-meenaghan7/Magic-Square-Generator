
package magicsquarecreator;

/**
 This program creates and prints Magic Squares to the console.
 @author Sean
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        The int parameter in createMagicSquare() determines the size
        of the square.
        
        The basic properties of the Magic Square are that the rows, columns, 
        and diagonals of the magic square will add up to the same number.
        
        The number used to determine the size of the Magic Square MUST be odd.
        */
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(5));
    }
    
}
