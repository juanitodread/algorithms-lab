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
package org.juanitodread.algorithmslab.scala.sorting

import org.scalatest.Matchers
import org.scalatest.FlatSpec

/**
 *
 *
 * @author juanitodread
 * @version 1.0
 *
 * Feb 23, 2015
 */
class InsertionSortTest extends FlatSpec with Matchers {

  val sortedNumbers = Array( 0, 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 8, 10 )
  val numbers = Array( 2, 4, 2, 6, 7, 3, 5, 7, 1, 8, 2, 10, 0 )

  val word = "INSERTIONSORT"
  val sortedWord = "EIINNOORRSSTT"

  "This test compares two Int arrays" should "pass" in {
    InsertionSort.sortInt( numbers ) should equal( sortedNumbers )
  }

  "This test compares two Strings arrays" should "pass" in {
    InsertionSort.sortString( word ) should equal( sortedWord )
  }

}