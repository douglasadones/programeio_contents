const title = document.getElementById('title');

console.log(title.innerText); // conteúdo interno

title.innerText = 'Meu título alterado via Js';

const list = document.getElementById('list');

console.log(list.innerHTML); // mostra o conteúdo de html de dentro da tag

list.innerHTML = '<li>Item adicionado via JS!</li>'
