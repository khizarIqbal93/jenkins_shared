def printFromFunction() {
    println("I am printing from a function")
}

def replaceString() {
    println("editing index.html")
    def text = readFile file: "index.html"
    text = text.replaceAll("%BUILD_NUMBER%", "${BUILD_NUMBER}")
    writeFile file: "index.html", text: text
}


