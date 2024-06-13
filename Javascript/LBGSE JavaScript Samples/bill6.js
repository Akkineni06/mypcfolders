let bill = 512
let paid = 1750
let balance = paid - bill

console.log("Balance is:", balance)
console.log("-----------------------------")
if(balance>=50){
    let note50 = parseInt(balance/50)
    console.log("50 £:", note50)
    balance = balance % 50
}
if(balance>=20){
    let note20 = parseInt(balance/20)
    console.log("20 £:", note20)
    balance = balance % 20
}
if(balance>=10){
    let note10 = parseInt(balance/10)
    console.log("10 £:", note10)
    balance = balance % 10
}
if(balance>=5){
    let note5 = parseInt(balance/5)
    console.log("5 £:", note5)
    balance = balance % 5
}
if(balance>=2){
    let note2 = parseInt(balance/2)
    console.log("2 £:", note2)
    balance = balance % 2
}
if(balance>=1){
    let note1 = parseInt(balance/1)
    console.log("1 £:", note1)
    balance = balance % 1
}