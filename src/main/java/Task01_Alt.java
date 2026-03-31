public class Task01_Alt {

    public static void logPrint(String logLine) {
        int indexStart = logLine.indexOf('/', logLine.indexOf('\"'));
        int indexEnd = logLine.indexOf(' ', indexStart);
        if (indexStart == -1 || indexEnd == -1) return;
        System.out.println("접속한 IP: " + logLine.substring(0, logLine.indexOf(' ')) + ", 접속한 페이지: " + logLine.substring(indexStart, indexEnd));
    }

    public static void main(String[] args) {
        String log = "127.0.0.1 - - [31/Mar/2026:10:00:01 +0900] \"GET /index.html HTTP/1.1\" 200 1043 \"-\" \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36\"\n" +
                "\n" +
                "192.168.1.50 - - [31/Mar/2026:10:00:05 +0900] \"POST /login.php HTTP/1.1\" 302 20 \"-\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 17_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.0 Mobile/15E148 Safari/604.1\"";
        String[] logStream = log.split("\n");
        for (int i = 0; i < logStream.length; i++) logPrint(logStream[i]);
    }

}
