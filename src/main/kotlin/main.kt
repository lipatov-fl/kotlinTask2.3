fun main() {
    val purchase: Int = 10_000
    val discount: Int = 100
    val musicLover: Boolean = false

    val discountCalcOne: Int = purchase * 1 / 100
    val discountCalcFive: Int = purchase * 5 / 100

    when(purchase) {
        in 0..1_000 -> {
            if (musicLover) print("После применения скидки в 1%: ${purchase - discountCalcOne} руб.")
            else print("Цена без скидки: $purchase руб.")
        }
        in 1_001..10_000 -> {
            if (musicLover) print("""После применения скидки в 5%: ${purchase - discountCalcOne} руб.
                |После применения скидки в 1%: ${purchase - discountCalcOne - discount} руб.""".trimMargin())
            else print("После применения скидки в 5%: ${purchase - discountCalcFive} руб.")
        }
        else -> print("После применения 5% скидки: ${purchase - discountCalcFive} руб.")
    }
}