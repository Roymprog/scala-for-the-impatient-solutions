package chapter7 {
  package exc1 {
    class Point(x:Int, y:Int) {

    }
    package packages {
      class unchainedPackages {

      }
    }
  }
}

// Possible because members are imported from intermediate packages in scope
package chapter7 {
  package exc1 {
    package people {
      class Student {
        val s = new Point(0,0)
      }
    }
  }
}

// Not possible because members of intermediate packages are not imported when chaining packages
//package chapter7.exc1.peoples {
//    class Student {
//      val s = new Point(0,0)
//    }
//}