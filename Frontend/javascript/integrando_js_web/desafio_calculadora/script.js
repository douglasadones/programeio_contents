const submitButton = document.getElementById('submitButton');
const sumButton = document.getElementById('sumButton');
const subButton = document.getElementById('subButton');
const multButton = document.getElementById('multButton');
const divButton = document.getElementById('divisionButton');
const allMathButtons = document.querySelectorAll('button.mathButton');

let firstNumber = document.getElementById('firstNumber');
let secondNumber = document.getElementById('secondNumber');
let mathOperation = '';
let result = document.getElementById('result');

allMathButtons.forEach((button) => {
    button.addEventListener('click', function () {
        sumButton.style.backgroundColor = '#5D3FCC';
        subButton.style.backgroundColor = '#5D3FCC';
        multButton.style.backgroundColor = '#5D3FCC';
        divButton.style.backgroundColor = '#5D3FCC';
        this.style.backgroundColor = 'orange';
        mathOperation = this.innerText;
        if (firstNumber.value !== '' && secondNumber.value !== '') {
            switch (this.innerText) {
                case '+':
                    result.innerText = Number(firstNumber.value) + Number(secondNumber.value);
                    break;
                case '-':
                    console.log('aqui!');
                    result.innerText = Number(firstNumber.value) - Number(secondNumber.value);
                    break;
                case '*':
                    result.innerText = Number(firstNumber.value) * Number(secondNumber.value);
                    break;
                case '/':
                    if (secondNumber.value !== '0') {
                        result.innerText = (Number(firstNumber.value) / Number(secondNumber.value)).toFixed(5)
                    } else {
                        secondNumber.style.borderColor = 'red';
                    }
                    break;
            }
            firstNumber.style.borderColor = 'black';
            if (secondNumber.value !== '0') {
                secondNumber.style.borderColor = 'black';
            }

        } else {
            firstNumber.style.borderColor = 'red';
            secondNumber.style.borderColor = 'red';
        };
    })
})