print("Olá bem-vindo a mercearia da Dona Ana")

nome = input("Por favor, digite seu nome: ")
preco_produto_1 = float(input("Digite o preço do primeiro produto: "))
preco_produto_2 = float(input("Digite o preço do segundo produto: "))

preco_total = preco_produto_1 + preco_produto_2
desconto = preco_total * 0.10
preco_total = preco_total - desconto

print("Preço total {:.2f}, volte sempre {}!".format(preco_total, nome))
