# 3) Faça um programa que leia 3 notas de um aluno em uma matéria e mostre
#        na tela a sua média na disciplina.

notas = []
for i in range(3):
    nota = float(input(f"Digite a {i + 1}a nota: "))
    
    notas.append(nota)
    
mediaNotas = (notas[0] + notas[1] + notas[2]) / 3

print(f"A média do aluno foi de: {mediaNotas:.2f}")