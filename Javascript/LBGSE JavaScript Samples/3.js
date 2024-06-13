
let physics = 40
let chemistry = 30
let maths = 48

let results = physics + chemistry + maths
let percentage = results * 100/450

console.log("Marks Obtained:", results)
console.log("Percentage:", percentage)

if (percentage>=60){
    console.log("You Have PASSED the exam")
}

if (percentage<60){
    console.log("You Have FAILED the exam")
}