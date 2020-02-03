package chapter11.exc5

import scala.collection.mutable.ArrayBuffer

class Table {
  private var table :ArrayBuffer[ArrayBuffer[String]] = new ArrayBuffer[ArrayBuffer[String]]()
  private var row: ArrayBuffer[String] = ArrayBuffer()
  table.addOne(row)

  def | (s:String) :Table = {
    row.addOne(s"<td>$s</td>")
    this
  }

  def || (s: String) :Table = {
    row = ArrayBuffer()
    table.addOne(row)
    this | s
  }

  override def toString: String = table.map(r => r.mkString("<tr>","","</tr>")).mkString("<table>","","</table>")
}

object Table {
  def apply(): Table = new Table()
}