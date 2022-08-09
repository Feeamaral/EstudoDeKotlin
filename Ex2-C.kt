import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

fun main (){
frase()
}
fun frase(){

    val frase = showInputDialog("Digite uma frase")
    val num = showInputDialog("Quantidade de vezes que ela irá aparecer na tela").toInt()

    for (i in 1..num){
        println("$frase")
    }

}