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

/**
 * @author juanitodread
 * @version 1.0.0
 *
 *          8/2/16
 */
abstract class AbstractSort {

  protected def sortInt = (x: Int, y: Int) => x < y

  protected def sortString = (x: String, y: String) => x < y

  protected def sortChar = (x: Char, y: Char) => x < y

  /**
   * Method to apply sort algorithm over array.
   *
   * @param elements Array of T
   * @param func Function to sort the elements of the items
   *
   * @return A sorted array of T elements
   */
  def sort[T](elements: Array[T], func: (T, T) => Boolean): Array[T]
}
