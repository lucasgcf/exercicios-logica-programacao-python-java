# 05) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
# mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
# sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

wallHeight = float(input("Digite a altura da parede(metros): \n"))

wallWidth = float(input("Digite a largura da parede(metros): \n"))
print("\n")

wallArea = wallHeight * wallWidth
quantityPaint = wallArea / 2

print(f"A área da parede é de {wallArea:.2f}(m²); a quantidade de tinta "
    + f"necessária é de {quantityPaint:.2f} litros.")

