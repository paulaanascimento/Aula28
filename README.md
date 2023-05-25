# Documentação
## Exercício 1
<div align="justify">
Comecei criando a interface Lampada com os métodos para ligar e desligá-la. Em seguida, criei a classe FabricaLampada e suas classes filhas: Incandescente e Fluorescente. Como elas implementam a interface, sobrescrevi os métodos necessários. Na classe FabricaLampada, criei um método para construir que retorna uma lâmpada de acordo com o tipo informado. Por fim, fiz a classe Exercício01, que contém a main, e nela fiz um menu para que o usuário possa informar qual tipo de lâmpada que ele deseja criar e chamando os métodos ligar e desligar.

## Exercício 2  
<div align="justify">
Primeiramente, criei a interface Tributos com o método para calcular. Criei uma classe abstrata para Conta, que contei o saldo como atributo, o construtor e o getSaldo. Fiz as classes filhas ContaCorrente e ContaPoupança que implementam a interface Tributos e sobrescrevi o método, fazendo com que a conta poupança retorne 0 e a corrente 1% do saldo. Criei a classe SeguroDeVida que também implementa a interface e retorna 42 no método calcularTributos. Para finalizar, fiz a main e instanciei cada uma das classes tributáveis e mostrei o resultado do método dos tributos.
