/**
 * algorithms-lab
 *
 * Copyright 2015 juanitodread
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.juanitodread.algorithmslab.sorting;

/**
 * This class represents the algorithm of Insertion Sort that consists in sort a
 * collection of data by insertion.
 * 
 * <code>
 * Complexity:
 * ____________________________________________
 * |    BEST    |    AVERAGE    |    WORST    |
 * |____________|_______________|_____________|
 * |    O(n)    |      O(n^2)   |    O(n^2)   |
 * |____________|_______________|_____________|
 * </code>
 *
 * @author juanitodread
 * @version 1.0
 * 
 *          Feb 9, 2015
 */
public class InsertionSort {

    /**
     * This method sorts an array of integers in descendant order.
     * 
     * @param items
     *            The array of integers to sort.
     * @return An array of sorted integers
     */
    public static int[ ] sortInt( int[ ] items ) {
        int j = 0;
        for ( int i = 1; i < items.length; i++ ) {
            j = i;
            while ( j > 0 && items[ j ] < items[ j - 1 ] ) {
                swap( items, j );
                j = j - 1;
            }
        }

        return items;
    }

    /**
     * This method sorts String in descendant order.
     * 
     * @param word
     *            The String to sort.
     * @return A sorted string.
     */
    public static String sortString( String word ) {
        StringBuilder sbWord = new StringBuilder( word );
        int j = 0;
        for ( int i = 1; i < sbWord.length( ); i++ ) {
            j = i;
            while ( j > 0 && sbWord.charAt( j ) < sbWord.charAt( j - 1 ) ) {
                swap( sbWord, j );
                j = j - 1;
            }
        }

        return sbWord.toString( );
    }

    /**
     * Helper method to swap two integers.
     * 
     * @param items
     *            Array of integers
     * @param index
     *            Current position to swap
     */
    private static void swap( int[ ] items, int index ) {
        int aux = items[ index - 1 ];
        items[ index - 1 ] = items[ index ];
        items[ index ] = aux;
    }

    /**
     * Helper method to swap two characters.
     * 
     * @param word
     *            Word to swap
     * @param index
     *            Current position to swap
     */
    private static void swap( StringBuilder word, int index ) {
        char aux = word.charAt( index - 1 );
        word.setCharAt( index - 1, word.charAt( index ) );
        word.setCharAt( index, aux );
    }
}
