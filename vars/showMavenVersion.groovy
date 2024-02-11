import vn.com.example.VersionUtils
def call() {
    println('Retrieving Maven information')
    def (mavenVersion, javaVersion) = VersionUtils.getMavenAndJavaVersion(this)
    sh """
        echo <<EOF
||==========MAVEN VERSION==========||
|| Apache Maven: ${mavenVersion}
|| Java version: ${javaVersion}
||=================================||
EOF
    """
    // println "||==========MAVEN VERSION==========||"
    // println "|| Apache Maven: $mavenVersion"
    // println "|| Java version: $javaVersion"
    // println "||=================================||"
}