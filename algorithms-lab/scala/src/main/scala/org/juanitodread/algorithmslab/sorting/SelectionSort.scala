/**
 * algorithms-lab
 *
 * Copyright 2016 juanitodread
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
 * This class represents the algorithm of Selection Sort that consists in sort a
 * collection of data by select the lower element in the array.
 *
 * <code>
 * Complexity:
 * ____________________________________________
 * |    BEST    |    AVERAGE    |    WORST    |
 * |____________|_______________|_____________|
 * |    O(n^2)  |    O(n^2)     |    O(n^2)   |
 * |____________|_______________|_____________|
 * </code>
 *
 *
 * @author juanitodread
 * @version 1.0
 *
 * Aug 02, 2016
 */
object SelectionSort extends AbstractSort with Utils {

  def sortIntArray(elements: Array[Int]): Array[Int] = {
    sort(elements, sortInt)
  }

  def sortString(str: String): String = {
    sort(str.toCharArray, sortChar).mkString
  }

  override def sort[T](elements: Array[T], func: (T, T) => Boolean): Array[T] = {
    for (i <- 0 until elements.length) {
      var min = i
      for (j <- min + 1 until elements.length) {
        if (func(elements(j), elements(min))) {
          min = j
        }
      }
      swap(elements, i, min)
    }
    elements
  }

}
