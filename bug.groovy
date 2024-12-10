```groovy
def myMethod(List<String> list) {
    list.each { element ->
        if (element == null) {
            println "Null element found"
        }
    }
}

myMethod(null) 
```