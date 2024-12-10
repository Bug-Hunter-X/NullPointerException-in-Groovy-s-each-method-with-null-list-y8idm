```groovy
def myMethod(List<String> list) {
    if (list != null) {
        list.each { element ->
            if (element == null) {
                println "Null element found"
            } else {
                println element
            }
        }
    } else {
        println "The list is null"
    }
}

myMethod(null)
myMethod(["a","b",null,"c"])
```