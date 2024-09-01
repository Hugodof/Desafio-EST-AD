import json

# Carregar os dados do JSON
with open('faturamento.json') as file:
    data = json.load(file)

faturamento = [dia['valor'] for dia in data['faturamentoDiario'] if dia['valor'] > 0]

menor = min(faturamento)
maior = max(faturamento)
media = sum(faturamento) / len(faturamento)

# Calcula o número de dias com faturamento acima da média
acimaDaMedia = len([valor for valor in faturamento if valor > media])

print(f"Menor valor de faturamento em um dia do mês: R${menor:.2f}")
print(f"Maior valor de faturamento em um dia do mês: R${maior:.2f}")
print(f"Número de dias com faturamento superior à média mensal: {acimaDaMedia}")
