import vn.com.example.VersionUtils
def call() {
    println('Retrieving Maven information')
    def (mavenVersion, javaVersion) = VersionUtils.getMavenAndJavaVersion(this)
    sh """
        ||==========MAVEN VERSION==========||
        || Apache Maven: ${mavenVersion}
        || Java version: ${javaVersion}
        ||=================================||
    """
    // println "||==========MAVEN VERSION==========||"
    // println "|| Apache Maven: $mavenVersion"
    // println "|| Java version: $javaVersion"
    // println "||=================================||"
}