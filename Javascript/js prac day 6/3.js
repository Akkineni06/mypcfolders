 
function doSomething(A){
 
  A("Jame")
}
 
 
function takeBackups(name){
 
  console.log(name, "Take Bakcups")
}
 
 
function doInstallations(name){
 
  console.log(name,"do fresh installations")
}
 
 
 
doSomething(takeBackups)
doSomething(doInstallations)
