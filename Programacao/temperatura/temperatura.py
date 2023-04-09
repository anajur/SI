temperatura = int(input("Digite a temperatura em graus Celsius: "))

if temperatura < 0:
  print("Água em estado Sólido!")
elif temperatura >= 0 and temperatura <= 100:
    print("Água em estado Líquido!")
else:
    print("Água em estado Gasoso!")
