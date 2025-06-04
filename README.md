[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)

**1. Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.**

A- Os construtores de superclasse não são herdados por subclasses.

**Verdadeira.**

B- Um relacionamento tem um é implementado via herança.

**Falso**, um relacionamento implementado via herança é dito como "É um".

C- Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

**Falso**, quando uma subclasse redefine um método da superclasse, é dito que a subclasse faz uma sobrescrita (override).

---
**2. Alguns programadores preferem não utilizar acesso protected, porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.**

Atributos declarados como private só podem ser acessados dentro da própria classe, as subclasses não tem acesso.
Já com o acesso protected, as subclasses podem acessar diretamente os atributos. A vantagem disso é que não há a necessidade do uso de getters e setters, porém, essa ação viola um dos princípios da orientação a objetos, o encapsulamento.
Com o acesso protected, é fato que a legibilidade e eficiência em hierarquias simples podem melhorar, porém, muitos programadores consideram preferível o seu uso apenas em casos específicos, para o mantimento de um encapsulamento rigoroso.

---

**3. Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?**

Na herança, o construtor da superclasse sempre é chamado primeiro, já que a subclasse depende dela para funcionar corretamente.
Isso garante que tudo que vem da superclasse esteja pronto antes de continuar a construção do objeto.




