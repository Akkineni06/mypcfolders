let bill = 512
let paid = 1750
let balance = paid - bill

console.log("Balance is:", balance)
console.log("-----------------------------")

if(balance>=50){
    let note50 = parseInt(balance /50)
    console.log("50 £:", note50)
    balance = balance % 50
}
console.log(balance)
