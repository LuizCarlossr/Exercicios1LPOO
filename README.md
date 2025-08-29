# 01 - Lista de Exercícios - Fundamentos Java
# 6 - Nivelamento de Lógica de Programação e Orientada a Objetos

## Operações Simples com Números
Nesta atividade, você deve criar uma função que realiza operações matemáticas básicas (soma, subtração, multiplicação e divisão) entre dois números inteiros. O objetivo é permitir que o usuário escolha a operação a ser realizada e receba o resultado correto.

Instruções: A função recebe três parâmetros: dois números inteiros e uma string representando a operação (+, -, *, /).
Realize a operação indicada e retorne o resultado.
Se a operação for a divisão e o segundo número for 0, retorne a string "Divisão por zero não permitida".
Caso a operação fornecida não seja válida, retorne "Operação inválida".

# 7 - Cálculo de Juros Simples
Imagine que você trabalha em um sistema bancário, e foi solicitado que você implemente um cálculo de juros simples para simular o rendimento de uma aplicação financeira. O cálculo de juros simples é feito utilizando a fórmula:

## Juros Simples = Capital * Taxa * Tempo

Implemente uma função que recebe três parâmetros:
O valor do capital investido (um número decimal).
A taxa de juros (um número decimal que representa a taxa ao ano, como 0.05 para 5%).
O tempo da aplicação (um número inteiro que representa o número de anos).
A função deve retornar o valor dos juros simples ao final do período. O resultado deve ser arredondado para duas casas decimais.

# 8 - Conversão de Temperatura
Você está desenvolvendo uma aplicação para um sistema meteorológico, e foi solicitado que você implemente uma função que converta temperaturas entre Celsius e Fahrenheit.

## A fórmula de conversão entre as escalas é:
De Celsius para Fahrenheit: F = C * 9/5 + 32
De Fahrenheit para Celsius: C = (F - 32) * 5/9
Implemente uma função que recebe dois parâmetros:

## A temperatura (um número decimal).
A escala de origem (uma string que pode ser "C" para Celsius ou "F" para Fahrenheit).
A função deve retornar a temperatura convertida para a outra escala, arredondada para duas casas decimais.
Obs.: Se for necessário, retorne 0.0 como resposta padrão.

# 9 - Cálculo do Imposto Progressivo
Imagine que você está desenvolvendo uma aplicação para o departamento financeiro de uma empresa, onde é necessário calcular o imposto de renda de seus funcionários de acordo com uma tabela progressiva.

## A tabela de imposto de renda é definida da seguinte maneira:
Renda até R$ 2.000,00: Isento
Renda entre R$ 2.000,01 e R$ 3.000,00: 8%
Renda entre R$ 3.000,01 e R$ 4.500,00: 18%
Renda acima de R$ 4.500,01: 28%
Implemente uma função que receba um valor decimal representando a renda mensal de uma pessoa e retorne o valor do imposto a ser pago, considerando que o cálculo deve ser feito de forma progressiva, ou seja, o imposto é aplicado apenas sobre a parte da renda que excede cada limite.

# 10 - Cálculo de Consumo de Combustível
Você está desenvolvendo uma aplicação para uma empresa de logística, e foi solicitado que você implemente uma função que calcule o consumo de combustível de um veículo.

## O consumo é calculado da seguinte forma:
O veículo percorreu uma distância d em quilômetros.
O veículo consumiu c litros de combustível durante o percurso.
A função deve retornar o consumo médio, definido como a quantidade de quilômetros percorridos por litro de combustível. O resultado deve ser arredondado para duas casas decimais.

# 11 - Conversão de Moeda
Você foi encarregado de desenvolver um sistema de conversão de moedas para uma empresa de turismo. O sistema deve converter valores de reais (BRL) para dólares (USD), com base em uma taxa de câmbio fornecida pelo usuário.

##  A função deve: 
Receber dois parâmetros: o valor em reais (um número decimal) e a taxa de câmbio (um número decimal).
Retornar o valor correspondente em dólares, arredondado para duas casas decimais.
Se o valor em reais ou a taxa de câmbio forem inválidos (negativos ou zero), o sistema deve retornar 0.0.


