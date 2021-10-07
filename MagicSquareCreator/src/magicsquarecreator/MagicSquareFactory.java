
package magicsquarecreator;

/**
 This factory class creates Magic Squares and initializes its values.
 @author Sean
 */
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        
        MagicSquare square = new MagicSquare(size);
        
        // Siamese method algorithm to implement a magic square
        int x = (size - 1) / 2;
        int y = 0;
        int value = 1;
        
        while (value <= size * size) {
            int previousX = x;
            int previousY = y;
            
            square.placeValue(x, y, value);
            ++value;
            
            if (x + 1 == size) {
                x = 0;
            } else {
                ++x;
            }
            
            if (y - 1 < 0) {
                y = size - 1;
            } else {
                --y;
            }
            
            // check for a value at the current position
            // shift from original position to down one block if not 0
            if (square.readValue(x, y) != 0) {
                x = previousX;
                y = previousY + 1;
            }
            
        }
        
        return square;
    }

}
