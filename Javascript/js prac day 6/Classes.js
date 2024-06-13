 
class Employee{
 
    constructor(name1,salary){
        this.employeename=name1
        this.employeesalary=salary
    }
 
    details(){
        console.log("Name:",this.employeename)
        console.log("Name:",this.employeesalary)
        console.log("Name:",this.employeesalary*15/100)
       
    }
   
}
 
 
let  emp1= new Employee("Shafeeq",2000)
let  emp2= new Employee("JAmes",12000)
 
 
emp1.details()
console.log("----------------")
emp2.details()
 