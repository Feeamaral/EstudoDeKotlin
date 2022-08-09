import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main(){
classeSocial()
}
fun classeSocial(){
    val salario = showInputDialog("Digite seu salário").toDouble()

    val classe = when (salario){
        in 0.0..1000.0 -> "classe C"
        in 1000.01..2000.0 -> "Classe B"
        in 2000.01..5000.0 -> "Classe A"
        in 5000.01..Double.MAX_VALUE -> "Classe AA"
        else -> "Salário inválido"
    }
    println("$classe")
}