
package magicsquarecreator;

import java.util.ArrayList;
import java.util.Collections;

/**
 This class defines Magic Squares, a two-dimensional array of integers, and its methods.
 @author Sean
 */
public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2)
            size = 2;

        this.square = new int[size][size];
    }
    
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> listOfRows = new ArrayList<>();
        
        for (int row = 0; row < square.length; ++row) {
            
            int sum = 0;
            for (int col = 0; col < square[row].length; ++col)
                sum += square[row][col];
            
            listOfRows.add(sum);
        }
        
        return listOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        
        ArrayList<Integer> listOfColumns = new ArrayList<>();
        
        for (int row = 0; row < square.length; ++row) {
            
            int sum = 0;
            for (int col = 0; col < square.length; ++col)
                sum += square[col][row];
            
            listOfColumns.add(sum);
        }
        
        return listOfColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        
        ArrayList<Integer> listOfDiagonals = new ArrayList<>();
        
        int sum = 0;
        int pos = 0;
        
        for (int i = 0; i < square.length; ++i) {
            
            sum += square[i][pos];
            ++pos;
            
        }
        
        listOfDiagonals.add(sum);
        sum = 0;
        pos = 0;
        
        for (int i = square.length - 1; i > -1; --i) {
            
            sum += square[i][pos];
            ++pos;
            
        }
        
        listOfDiagonals.add(sum);
        
        return listOfDiagonals;
    }

    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
