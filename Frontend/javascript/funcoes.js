function teste() {
    console.log("Teste");
}

teste();


function teste2(parm) { // Os parâmetros são posicionais!
    console.log(parm);
}

teste2(33333333);

// Retornos de funcoes

function teste3(primNum, segNum) { // Os parâmetros são posicionais!
    let valor = primNum + segNum;
    return valor;
}

console.log(teste3(4, 2));

let resultado = teste3(4, 2);
console.log(resultado)

