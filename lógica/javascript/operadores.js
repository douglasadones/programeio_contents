let num1 = 12, num2 = 7

console.log(num1 + num2)


console.log("Soma = " + num1 + num2) // Cuidado aqui! -> Soma = 127

console.log("Soma = " + (num1 + num2))
console.log("Soma =", + num1 + num2)

console.log("Divisao =", num1 / num2)
console.log("Resto =", num1 % num2)


// Tem todos os operadores conhecidos, porém com essas duas adições: 
// O operador "===" verifica a igualdade tanto dos valores como dos tipos

console.log(num1 === "12")
console.log(num1 === 12)

// O operador "!==" faz o mesmo, porem validando a diferença.

console.log(num1)
console.log(num1++) // Isso aqui só acontece na próxima linha! cuidado!
console.log(num1)

console.log(++num1) // Assim é a forma comum
console.log(--num1)