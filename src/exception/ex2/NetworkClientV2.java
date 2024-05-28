package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError; //default false
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException2{
        if (connectError) {
            throw new NetworkClientException2("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientException2{
        if (sendError) {
            throw new NetworkClientException2("sendError", address + "서버에 데이터 전송 실패 : " + data);
            //중간에 예상 하지 못하는 예외가 발생 했을 경우
            //            throw new RuntimeException("ex");
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void discconect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
