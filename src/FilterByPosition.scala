object FilterByPosition {
  def main(args: Array[String]): Unit = {
    val arr: List[Int] = Range(0, 50, 2).toList
    print(arr.zipWithIndex.filter(_._2 % 2 != 0).unzip._1)
  }
}
