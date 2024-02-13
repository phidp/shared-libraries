import vn.com.example.VersionUtils
import vn.com.example.utils.logging.LogLevel
import vn.com.example.utils.logging.Logger
import static vn.com.example.utils.ConfigConstants.*

def call() {
    Logger.init(this, [ (LOGLEVEL) : LogLevel.TRACE] )
    Logger log = new Logger(this)
    ansiColor('xterm') {
        log.info('Retrieving Maven information')
    }
    def result = VersionUtils.getMavenAndJavaVersion(this)
    ansiColor('xterm') {
        println(result)
    }
    ansiColor('xterm') {
        log.debug($(println(result)))
    }
}