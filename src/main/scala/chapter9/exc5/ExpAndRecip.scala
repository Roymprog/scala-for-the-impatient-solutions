package chapter9.exc5

import math.pow

object ExpAndRecip extends App {
  for(n <- 0 to 20) {
    val power = pow(2,n)
    println(s"${power.toInt}${" "*(10 - power.toString.length)}${1/power}")
  }
}
