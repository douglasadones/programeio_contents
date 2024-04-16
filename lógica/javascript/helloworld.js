console.log("Hello World!");

//Variáveis
// var (escopo global)
// let (escopo local) - Sempre preferir esse.
// const 

// HOISTING - Pega a sua atribuição (depis da execução) e reposicionam elas para o início do seu programa. (pré declaração das variáveis) para que estas possam ser utilizadas logo de início em qualquer local do código. Isso ocorre com o var. É por conta do HOSTING que o var é global.


var nomePessoa = "Galeno"; // String
let idadePessoa = 33; ; // Number
const maiorDeIdade = true; // Booleano - Não pode ser alterado.

console.log(nomePessoa);
console.log(idadePessoa);
console.log(maiorDeIdade);

//Conversão de tipos
let quantidade = '3';
let preco = 100;
console.log("Total da compra = " + preco*Number(quantidade));