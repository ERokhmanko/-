const val COMMISSION_RATE = 0.0075
const val MIN_COMMISSION_KOP = 3500

fun main() {
    val amountRub = 1000.45
    val amountKop = amountRub * 100

    val totalCommission = if (amountKop * COMMISSION_RATE <= MIN_COMMISSION_KOP) MIN_COMMISSION_KOP
    else amountKop * COMMISSION_RATE

    val totalAmount = totalCommission.toInt() + amountKop
    val totalAmountRub = totalAmount / 100

    val rub = totalAmountRub.toString().substringBefore(".")
    val kop = totalAmountRub.toString().substringAfter(".")

    print("Итоговая сумма перевода $rub рублей и $kop копеек")
}