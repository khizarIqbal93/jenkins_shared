def call(String name) {
    sh """
        echo "Hello ${name}, this a function from the shared library"
    """
}