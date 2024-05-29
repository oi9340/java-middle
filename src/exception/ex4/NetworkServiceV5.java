package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 clientV5 = new NetworkClientV5(address)) {
            clientV5.initError(data);
            clientV5.connect();
            clientV5.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인] : " + e.getMessage());
            throw e;
        }
    }
}
