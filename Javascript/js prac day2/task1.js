

function payslip(name,salary){

    let tax = 0
    if(salary<=2000){
        tax = salary * 0.20
    }else{
        tax = salary * 0.10
    }

    console.log("Name of Employee:", name)
    console.log("Salary:", salary)
    console.log("Tax Calculated:", tax)
    console.log("Net Salary:", salary - tax)
    console.log("------------------------------")

}

payslip("praveen",2000)
payslip("david",3000)