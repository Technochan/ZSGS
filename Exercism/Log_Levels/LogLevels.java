package Log_Levels;

public class LogLevels {

    public static String message(String logLine) {
        int startIndex = logLine.indexOf(":");
        int endIndex = logLine.contains("\\") ? logLine.indexOf("\\") : logLine.length();
        return logLine.substring(startIndex+1,endIndex).trim();
    }

    public static String logLevel(String logLine) {
        int startIndex = logLine.indexOf("[");
        int endIndex = logLine.indexOf("]");
        return logLine.substring(startIndex+1,endIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
