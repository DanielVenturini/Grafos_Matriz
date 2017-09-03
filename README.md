# Grafos_Matriz

Grafo criado para a disciplina de Teoria dos Grafos para resolver o problema da Chuva de Olimpiada de Matemática.

As funções basicas existem: inserir e remover vertice, inserir e remover aresta e printar o grafo.

Quando na matriz a posição grafo[posição][posição] for igual a 1, quer dizer que existe um Vertice. Se for 0, então não.
Para remover um vertice, pega na posição dele e vai descendo esta coluna na matriz. Onde for 1 quer dizer que tem uma aresta, então coloca zero e depois na diagonal principal, que diz se existe um vertice, coloca-se 0.
