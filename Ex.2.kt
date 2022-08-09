import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog

/* a) Solicite a altura do usuario, com base nela exiba..
"Você pode jogar basquete (se altura for maior que 1.80)
"Você não pode jogar basquete" (caso a alturas seja menor que 1.80)

b) Solicite a altura do usuario. Com base nela exiba...
classe social, sendo...
"Classe C" caso salário entre 0 e 1000
"Classe B" caso salário entre 1000.01 E 2000
"Classe A" caso salário entre 2000.01 E 5000
"Classe AA" caso salário maior 5000
ou exiba "Salario inválido" caso seja menor que 0

c) Solicite uma frase de pensamento positivo e a quantidade de vezes que o programa deve repeti-la.
Exiba x vezes a frase, conforme indicado pelo usuario
 */

fun main(){
    altura()
}

fun altura(){
    val altura = showInputDialog("Digite sua altura").toDouble()

    if (altura >= 1.80){
        println("Você pode jogar basquete")
    }else{
        println("Você não pode jogar basquete")
    }
}