package chapter15.exc2

@deprecated(message = "Don't use this class anymore", since="v1.0.0(06-02-2020)")
class DeprecatedClass @deprecated() (@deprecated @deprecatedName('dp) depr: Int @deprecated) {
  @deprecated var something :Int = 0

  @deprecated
  def message :String = "This is a message"
}
