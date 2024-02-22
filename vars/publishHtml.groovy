def call(Map params) {
    config = params.config
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