package chapter10.exc1

import java.awt.geom.Ellipse2D

trait RectangleLike {
  def translate(dx:Int, dy:Int) :Unit = {
    setFrame(getX + dx, getY + dx, getWidth, getHeight)
  }

  def grow(w:Int, h:Int) :Unit = {
    setFrame(getX, getY, getWidth + w, getHeight + h)
  }

  def getX: Double

  def getY: Double

  def getWidth:Double

  def getHeight :Double

  def setFrame(x: Double, y:Double, w:Double, h:Double):Unit
}



object RectangleLikeRunner extends App {
  val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike
  egg.translate(10,-10)
  egg.grow(10,20)
  print(egg.getBounds)
}
