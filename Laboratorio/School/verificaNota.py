grau_a = float(input("Digite a nota do grau A "))
grau_b = float(input("Digite a nota do grau B "))

total = (grau_a * 0.30) + (grau_b * 0.70)
if grau_a < 0 or grau_b < 0:
  print("Número inválido")
elif total >= 6:
  print("Você não precisa realizar a prova do grau C!")
else:
    print("Você precisa realizar a prova do grau C!")
  
