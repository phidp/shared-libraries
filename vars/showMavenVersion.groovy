import vn.com.example.VersionUtils
def call() {
    println('Retrieving Maven information')
    def (mavenVersion, javaVersion) = VersionUtils.getMavenAndJavaVersion(this)
    def result = """
||==========MAVEN VERSION==========||
|| Apache Maven: ${mavenVersion}
|| Java version: ${javaVersion}
||=================================||
"""
    println(result)
    // println "||==========MAVEN VERSION==========||"
    // println "|| Apache Maven: $mavenVersion"
    // println "|| Java version: $javaVersion"
    // println "||=================================||"
}