

let marks=250
let per=marks*100/500

console.log("Perentage:", per)
console.log("--------------------")

if(per>=90){
    console.log("Grade:A+")
}

if(per>=80 && per<90){
    console.log("Grade:A")
}

if(per>=70 && per<80){
    console.log("Grade:B")
}

if(per>=60 && per<70){
    console.log("Grade:C")
}
if(per<60){
    console.log("FAIL")
}