import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main (){
valor()
}

fun valor (){

    val base = showInputDialog("Digite o valor base por KM").toDouble()
    val dist = showInputDialog("Digite a distancia da próxima corrida").toDouble()
    val volume = showInputDialog("Digite o volume de corridas").toInt()


    val preco = when (volume){
        in 0..2 -> "${base*dist}"
        in 3..7 -> "${base*dist*1.30}"
        in 8..10 -> "${base*dist*1.80}"
        else -> "Volume invalido"
    }

    showMessageDialog(null,"O valor da viagem será: $preco")
}
