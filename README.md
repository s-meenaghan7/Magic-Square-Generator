# Magic-Square-Generator
Java program that generates a size n-odd magic square and neatly prints to the console.

From https://en.wikipedia.org/wiki/Siamese_method:

"The Siamese method, or De la Loubère method, is a simple method to construct any size of n-odd magic squares (i.e. number squares in which the sums of all rows, columns and diagonals are identical)."

This program uses the Siamese method to generate a magic square, neatly printed to console output. The magic square is 'magic' due to the sum of each row, column, or two main diagonal's elements adding up to the same number. The magic square's sides are of equal length, n, and the length of the square's sides must be an odd number. Each element in the magic square is unique, starting from 1 and incrementing up to n^2. E.g. a magic square of size 5 will have elements numbered from 1 to 25. The magic square can be generated from any progression of numbers (i.e. starting from any number and incrementing up by 1 until all elements of the magic square have been filled) and still be a magic square, but this program starts at 1 for simplicity.
