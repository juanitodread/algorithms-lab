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

import org.junit.Assert;
import org.junit.Test;

/**
 * InsertionSort test case
 *
 * @author juanitodread
 * @version 1.0
 * 
 *          Feb 9, 2015
 */
public class InsertionSortTest {

    private int[ ] numbers       = { 2, 4, 2, 6, 7, 3, 5, 7, 1, 8, 2, 10, 0 };
    private int[ ] sortedNumbers = { 0, 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 8, 10 };

    private String word          = "INSERTIONSORT";
    private String sortedWord    = "EIINNOORRSSTT";

    /**
     * Test method for
     * {@link org.juanitodread.algorithmslab.sorting.InsertionSort#sortInt(int[])}
     * . 
     */
    @Test
    public final void testSortInt( ) {
        int[ ] sortedInts = InsertionSort.sortInt( numbers );

        Assert.assertArrayEquals( sortedNumbers, sortedInts );
    }

    /**
     * Test method for
     * {@link org.juanitodread.algorithmslab.sorting.InsertionSort#sortString(java.lang.String)}
     * . 
     */
    @Test
    public final void testSortString( ) {
        String sortedString = InsertionSort.sortString( word );
        Assert.assertEquals( "Words are not equals: ", sortedWord, sortedString );
    }

}
