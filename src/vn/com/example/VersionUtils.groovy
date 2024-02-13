//VersionUtils.groovy
package vn.com.example

class VersionUtils {

    static def getMavenAndJavaVersion(script) {
        // def process = "/opt/homebrew/bin/mvn --version".execute()
        // process.waitFor()

        def mavenVersionOutput = script.sh(script: 'mvn --version', returnStdout: true).trim()
        def mavenVersion = mavenVersionOutput.split('\n').find { it.startsWith('Apache Maven') }?.split(' ')[2]
        def javaVersion = mavenVersionOutput.split('\n').find { it.startsWith('Java version') }?.split(' ')[2]

        def result = """
||==========MAVEN VERSION==========||
|| Apache Maven: ${mavenVersion}
|| Java version: ${javaVersion}
||=================================||
"""
        return result
    }
}