# 2. Builder
## 2.1.Exercício:

Na cadeia de restaurantes _fast-food_ _PatternBurgers_ há um padrão para montagem de lanches de crianças. O
sanduíche (hambúrguer ou _cheeseburger_), a batata (pequena, média ou grande) e o brinquedo (carrinho ou
bonequinha) são colocados dentro de uma caixa e o refrigerante (coca ou guaraná) é entregue fora da
caixa. A classe abaixo é dada para representar o pedido de um consumidor:

```
import java.util.*;

  public class Pedido {
      private Set<String> dentroDaCaixa = new HashSet<String>();
      private Set<String> foraDaCaixa = new HashSet<String>();
      
      public void adicionarDentroDaCaixa(String item) {
          dentroDaCaixa.add(item);
      }
  
      public void adicionarForaDaCaixa(String item) {
          foraDaCaixa.add(item);
      }
  
      public String toString() {
          StringBuffer buffer = new StringBuffer();
          buffer.append("Seu pedido:\n");
          buffer.append("Dentro da caixa:\n");
          for (String item : dentroDaCaixa) buffer.append("\t" + item + "\n");
          buffer.append("Fora da caixa:\n");
          for (String item : foraDaCaixa) buffer.append("\t" + item + "\n");
          buffer.append("\nTenha um bom dia!\n\n");
          return buffer.toString();
      }
}
```

Neste caso, o padrão _Builder_ pode ser usado para separar as tarefas do atendente e do funcionário que
monta o pedido. Somente este último sabe como montar os pedidos segundo os padrões da empresa, mas é
o atendente quem lhe informa quais itens o consumidor pediu.
Implemente a simulação do restaurante _fast-food_ descrita acima utilizando o padrão _Builder_ e escreva uma
classe cliente que pede um lanche ao atendente, recebe-o do outro funcionário e imprime o pedido.
