object EvaluatingeX {
  def fact(n: Int): Int = if (n <= 1) 1 else n * fact(n - 1)

  def main(args: Array[String]): Unit = {
    print(List.range(1, 20).foreach(index => scala.math.pow(20, index) / fact(index)))
  }
}
