import ua_parser.Client;
import ua_parser.Parser;

import java.io.IOException;

public class BrowserAgentTeller {
    public static void main(String[] args) throws IOException {
        String browerAgentStr = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36\" \"10.10.66.247:19782";

        Parser parser = new Parser();
        Client client = parser.parse(browerAgentStr);

        System.out.println(client);
        System.out.println(client.userAgent.family);
        System.out.println(client.userAgent.major);
        System.out.println(client.os.family);
    }
}
