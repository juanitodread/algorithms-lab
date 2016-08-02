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
package org.juanitodread.algorithmslab.scala

import org.juanitodread.algorithmslab.scala.sorting.InsertionSort

/**
 *
 *
 * @author juanitodread
 * @version 1.0
 *
 * Feb 9, 2015
 */
object Main {

  def main( args: Array[ String ] ) {
    val res = InsertionSort.sortInt( Array( 4, 2, 5, 1 ) )
    val res2 = InsertionSort.sortString( "HELLO WORLD SCALA" )
    println( res.deep )
    println( res2 )
  }

}