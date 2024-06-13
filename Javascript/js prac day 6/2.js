function doSomething(A){
 
  A()
}
 
 
function takeBackups(){
 
  console.log("Take Bakcups")
}
 
 
function doInstallations(){
 
  console.log("do fresh installations")
}
 
 
 
doSomething(takeBackups)
doSomething(doInstallations)