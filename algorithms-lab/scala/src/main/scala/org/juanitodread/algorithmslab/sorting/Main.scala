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

/**
 * Main application
 *
 * @author juanitodread
 * @version 1.0
 *
 * Feb 9, 2015
 */
object Main {

  def main(args: Array[String]) {
    val intArr = Array(2, 5, 1, 23, 4, 6, 4, 2, -2, 4)
    val str = "helloworldscala"

    println(":::: Insertion Sort::::")
    val res = InsertionSort.sortIntArray(intArr)
    val res2 = InsertionSort.sortString(str)
    println(res.deep)
    println(res2)

    println("\n:::: Selection Sort::::")
    println(SelectionSort.sortIntArray(intArr).deep)
    println(SelectionSort.sortString(str))
  }

}
