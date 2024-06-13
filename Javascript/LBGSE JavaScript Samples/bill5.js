let bill = 20
let paid = 100
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
console.log(balance)