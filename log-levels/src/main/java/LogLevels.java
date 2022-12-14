public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf("]: ");
        return logLine.substring(index + 3).strip();
    }

    public static String logLevel(String logLine) {
        int end = logLine.indexOf("]: ");
        return logLine.substring(1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
