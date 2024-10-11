var numero = prompt('Escreva algum número:');
número = parseInt(número);
 
var x = número % 2;

    if (x === 0) {
        console.log('O seu número ' + número + ' é par.');
    } else {
        console.log('O seu número ' + número + ' é ímpar.');
    }