# Prática de API
Desenvolva o script da automação seguindo as informações a seguir:  
- Documentação = https://reqres.in/
- URI = https://reqres.in/api/

1) Validar o script de "CREATE" método "POST” cobertura de testes em Rest Assured da API
2) Validar cobertura de Status Code, Campos obrigatórios e Contrato  
3) Desenvolver com POJOs.  
   OBS1: Enviar o link do código no GitHub
  
## Cenários mapeados:
1) Name e job corretos 
2) Teste de contrato 
3) Sem name 
4) Sem Job 
5) Name em branco 
6) Job em branco 
7) Sem body
   
## Dúvida
Os campos do body são obrigatórios? Caso afirmativo, apenas os cenários 1 e 2 estão passando, os demais cenários mesmo com a ausência dos campos permite o cadastro, retornando 201.

