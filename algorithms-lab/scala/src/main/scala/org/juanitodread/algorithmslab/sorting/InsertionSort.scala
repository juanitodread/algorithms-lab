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
package org.juanitodread.algorithmslab.sorting

import org.juanitodread.algorithmslab.util.Utils

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
 * Feb 16, 2015
 */
object InsertionSort extends AbstractSort with Utils {

  /**
   * This method sorts an array of integers in descendant order.
   *
   * @param elements The array of integers to sort.
   *
   * @return An array of sorted integers
   */
  def sortIntArray(elements: Array[Int]): Array[Int] = {
    sort(elements, sortInt)
  }

  /**
   * This method sorts String in descendant order.
   *
   * @param str The string to sort.
   *
   * @return A sorted string.
   */
  def sortString(str: String): String = {
    sort(str.toCharArray, sortChar).mkString("")
  }

  /**
   * Helper method to apply insertion sort algorithm over array.
   *
   * @param elements Array of T
   * @param func Function to sort the elements of the items
   *
   * @return A sorted array of T elements
   */
  override def sort[T](elements: Array[T], func: (T, T) => Boolean): Array[T] = {
    var j = 0
    for (i <- 1 until elements.length) {
      j = i
      while (j > 0 && func(elements(j), elements(j - 1))) {
        swap(elements, j, j - 1)
        j = j - 1
      }
    }
    elements
  }

}
