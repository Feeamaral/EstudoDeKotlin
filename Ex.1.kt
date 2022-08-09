import javax.swing.JOptionPane
import javax.swing.JOptionPane.*

/* a) Solicite o nome do bairro do usuário (em janelas separadas)Logo em seguida,
mostre ou em uma janela ou no console a baixo a frase "Você se chama x e mora no bairro x"
b) Solicite o nome de uma linha de onibus e o maior e menor tempo de sua volta,em minutos.
 Ao final exiba numa janela a linha x leva em média y minutos/volta. Onde Y é a média entre o maior e menor tempo
 c) Solicite o o ki(força base de um sayajin. Depois exiba quais seriam seus kis após as transformações em SSJ,SSJ2,SSJ3
,GOD,SENDO JJS: Basex50;  JJS2:Basex100;  JJS3:Basex200;  god:base x 500.
*/
fun main() {
    linhaOnibus()
}
fun cadastro() {
    val nome = showInputDialog("Digite seu nome")
    val bairro = showInputDialog("Digite seu bairro")

    showMessageDialog(null,"Você se chama $nome e mora no bairro $bairro")

}
fun linhaOnibus(){
    val linha = showInputDialog("Digite sua linha de onibus")
    val tempoMaior = showInputDialog("Digite o Tempo maximo de ida e volta").toInt()
    val tempoMenor = showInputDialog("Digite o tempo minimo de ida e volta").toInt()
    val media = (tempoMaior+tempoMenor)/2

    print("O seu tempo médio da linha $linha é: $media minutos")
}
fun forca (){
    val ki= showInputDialog("Digite sua força em Ki").toDouble()
    val SSJ = ki*50
    val SSJ1 = ki*100
    val SSJ2 = ki*200
    val god = ki*500

    println("Seus Ki´são: SSSJ = $SSJ,  SSJ1 = $SSJ1,  SSJ2 =  $SSJ2,  god=  $god")
}
