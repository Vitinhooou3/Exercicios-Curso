var array = ['string', 1, true, false, ['array1'], ['array2']]
console.log(array)


//percorrer lista com indice
array.forEach(function(item, index){
    console.log(item, index)
})


//adicionar item
array.push('novo item')
console.log(array)


//tira o ultimo
array.pop()
console.log(array)

//tira o primeiro
array.shift()
console.log(array)

//adiciona no inicio
array.unshift()
console.log(array)

//mostra indice do elemento
console.log(array.indexOf(true))

//apagar alguns itens
array.splice(3, 0, 'a')
console.log(array)


let novoArray = [32,40,10,221]
console.log(novoArray.slice(3))



