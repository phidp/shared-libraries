def call(Map params) {
    if (params.Department == null) {
        params.Department = 'DevSecOps'
    }
    println("Hello ${params.Name}. Welcome to the ${params.Department}")
}