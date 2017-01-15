         Simulate drawing tiles from a scrable bag. Each tile in scrabble has a letter, and a frequency
         of that tile for a total of 100 tiles. The exception to this are the blank tiles, which are
         represented by an underscore.

         Distrubution of tiles can be found at: http://scrabblewizard.com/scrabble-tile-distribution/

         When asked for, output the number of tiles remaining in the Scrabble back in descending order. If the number
         of tiles remaining ties for multiple letters, display the letters in alphabetical order. ie:

         10: E
         9: I
         8: A
         7: O
         5: N, R, T
         4: D, L, U
         3: G, S
         2: F, H, P, V, W
         1: B, C, J, K, M, Q, Y, Z, _
         0: X

         If an attempt is made to withdraw tiles that are no longer there, an error message needs to be sent. Removing
         a tile from the bag subtracts a random tile, and removes it from the total.
