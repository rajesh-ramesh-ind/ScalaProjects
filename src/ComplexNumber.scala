object ComplexNumber {
  def main(args: Array[String]): Unit = {
    val x = (1, 2)
    val y = (2, 3)
    print(createFunction("*")(x, y))
  }

  def createFunction(sym: String): ((Int, Int), (Int, Int)) => (Int, Int) = {
    sym match {
      case "+" => (x: (Int, Int), y: (Int, Int)) => (x._1 + x._2, y._1 + y._2)
      case "-" => (x: (Int, Int), y: (Int, Int)) => (x._1 - x._2, y._1 - y._2)
      case "*" => (x: (Int, Int), y: (Int, Int)) => (x._1 * x._2, y._1 * y._2)
      case "/" => (x: (Int, Int), y: (Int, Int)) => (x._1 / x._2, y._1 / y._2)
    }
  }
}
