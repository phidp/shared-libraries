import vn.com.example.utils.logging.*
def call(Map params) {
    Logger.init(steps, LogLevel.INFO)
    Logger log = new Logger(this)
    
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
    log.info(config, config)
}