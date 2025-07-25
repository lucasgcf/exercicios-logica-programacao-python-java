# 4) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
#    sua terça parte.

number = float(input("Digite um número: "))

numberDouble = number * 2
numberThirdPart = number / 3.0

print(f"O dobro de {number:.2f} é {numberDouble:.2f}, sua terça parte é {numberThirdPart:.2f}.")