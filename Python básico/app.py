int 
name = "Gustavo"
height = "1.90"
student = "True"
job = "False"
if height >= 1.85:
    print("Você é alto.")
elif height >= 1.80:
    print("Você é mediano.")
else:
    print("Você é baixo.")

cont = 1
while cont <= 5:
    print(cont * 2)
    cont += 1

cont = 0
while True:
    print(cont)
    cont += 1
    if cont == 5:
     break

for i in range(10):
    if i % 2 == 0:
        continue
    print(i)
for i in range(5):
    pass

fruit = ["maçã", "banana", "laranja"]
print(fruit[0])
print(fruit[1])
print(fruit[2])

num = [1, 2, 3, 4, 5]
quad = [x ** 2 for x in num if x % 2 == 0]
print(quad)

person = {"Name": "Daniel", "Height": "1.75"}
print(person["Height"])
print(person["Name"])

frutas = {"maçã", "banana", "laranja"}
frutas.add("pera")
print(frutas)
print(frutas.remove("maçã"))
print(frutas)

def saudacao():
    print("Hello, Word!")
saudacao()

def soma(a, b):
    return a + b

result = soma(3, 4)
print(result)
print(result)

quad = lambda x: x ** 2
print(quad(5))

def area_retangulo(base, altura):
    return base * altura

def soma_variavel(*numeros):
    total = 0
    for numero in numeros:
        total += numero
    return total

print(soma_variavel(1, 2, 3))
print(soma_variavel(4, 5, 6, 7))
print(soma_variavel(1, 2, 3))
print(soma_variavel(4, 5, 6, 7))
try:
    arquivo = open("arquivo.txt", "r")
except FileNotFoundError:
    print("Erro: Arquivo não encontrado")
finally:
    arquivo.close()
def funcao():
 if condicao: # type: ignore
  raise Exception("Descrição do erro")
try:
    funcao()
except Exception as e:
    print(f"Erro: {str(e)}")

nome = input("Insira seu nome: ")
print("Olá, " + nome + "!")
idade = int(input("Insira sua idade: "))
if idade >= 18:
    print("Você é maior de idade.")
else:
    print("Você é menor de idade.")
nome = "Juan"
idade = 25
print(f"Oi, meu nome é {nome} e tenho {idade} anos.")

arquivo = open("dados.txt", "r")
conteudo = arquivo.read()
print(conteudo)
arquivo.close()

arquivo = open("dados.txt", "w")
arquivo.write("Olá, mundo!")
arquivo.close()

with open("dados.txt", "r") as arquivo:
    conteudo = arquivo.read()
    print(conteudo)

import math
resultado = math.sqrt(25)
print(resultado)     

from math import sqrt
resultado = sqrt(25)
print(resultado)  

import random
import datetime
numero_aleatorio = random.randint(1, 10)
print(numero_aleatorio) 
data_atual = datetime.datetime.now()
print(data_atual)

def saudar(nome):
    print(f"Olá, {nome}!")
def calcular_soma(a, b):
    return a + b

def somar(a, b):
    return a + b

def subtrair(a, b):
    return a - b

def imprimir_mensagem(mensagem):
    print(mensagem)

def obter_nome_usuario():
    return input("Digite seu nome: ")