
do{
    const operacao = Number(prompt('Escolha uma opção:\n 1 - soma (+)\n 2 - subtração (-)\n 3 - multiplicação (*)\n 4 - divisão real (/)\n 5 - divisão inteira (%)\n 6 - potenciação (**)'))
    switch (operacao){
        case 1:
        let s1 = Number(prompt('Insira um valor'))
        let s2 = Number(prompt('Insira outro valor'))
        let soma = s1 + s2 
        alert(soma)
        break

        case 2:
        let su1 = Number(prompt('Insira um valor'))
        let su2 = Number(prompt('Insira outro valor'))
        let subtracao = su1 - su2
        alert(subtracao)
        break

        case 3:
        let m1 = Number(prompt('Insira um valor'))
        let m2 = Number(prompt('insira outro valor'))
        let multiplicacao = m1 * m2
        alert(multiplicacao)
        break

        case 4:
        let div1 = Number(prompt('Insira um valor'))
        let div2 = Number(prompt('insira outro valor'))
        let divisao = div1 / div2
        alert(divisao)
        break

        case 5:
        let mod1 = Number(prompt('Insira um valor'))
        let mod2 = Number(prompt('insira outro valor'))
        let modulo = mod1 % mod2
        alert(modulo)
        break

        case 6:
        let p1 = Number(prompt('Insira um valor'))
        let p2 = Number(prompt('insira outro valor'))
        let potencia = p1 ** p2
        alert(potencia)
        break
    }
    
}while(operacao < 7)
