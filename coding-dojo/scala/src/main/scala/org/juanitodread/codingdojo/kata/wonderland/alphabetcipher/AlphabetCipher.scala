package org.juanitodread.codingdojo.kata.wonderland.alphabetcipher

/**
 * @author juansand
 */
object AlphabetCipher {

  val Start = 97
  val End = 122
  val Size = End - Start

  def buildKeycode(keycode: String, text: String): String = {
    val code = keycode * (text.length / keycode.length + 1)
    code.substring(0, text.length)
  }

  def encode(keycode: String, text: String) = process(keycode, text, encode1)

  def decode(keycode: String, text: String) = process(keycode, text, decode1)

  private def process(keycode: String,
    text: String,
    apply: (Char, Char) => Char): String = {
    keycode.zip(text).map(x => apply(x._1, x._2)).mkString("")
  }

  private def encode1(col: Char, row: Char): Char = {
    val res = col.toInt + row.toInt - Start
    if (res > End) (res - Size - 1).toChar else res.toChar
  }

  private def decode1(col: Char, row: Char): Char = {
    val res = row.toInt - col.toInt + Start
    if (res < Start) (res + Size + 1).toChar else res.toChar
  }
}
