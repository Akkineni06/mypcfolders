let bill = 512
let paid = 1750
let balance = paid - bill

console.log("Balance is:", balance)
console.log("-----------------------------")
if(balance>=50){
    let note50 = parseInt(balance/50)
    console.log("50 £:",note50)
    balance = balance % 50
}
if(balance>=20){
    let note20 = parseInt(balance/20)
    console.log("20 £:",note20)
    balance = balance % 20
}
if(balance>=10){
    console.log("10 £:1")
    balance = balance % 10
}
if(balance>=5){
    console.log("5 £:1")
    balance = balance % 5
}
if(balance>=2){
    console.log("2 £:1")
    balance = balance % 2
}
if(balance>=1){
    console.log("1 £:1")
    balance = balance % 1
}