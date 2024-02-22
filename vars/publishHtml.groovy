def call(Map params) {
    config = params.publishHtml
    publishHTML(
        [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: false,
            reportDir: config.reportDir,
            reportFiles: config.reportFiles,
            reportName: config.reportName,
            reportTitles: '',
            useWrapperFileDirectly: true
        ]
    )
}