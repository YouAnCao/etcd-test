import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import java.util.concurrent.ExecutionException;

public class Starter {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Client client   = Client.builder().endpoints("http://localhost:2379").build();
        KV     kvClient = client.getKVClient();
        kvClient.put(ByteSequence.from("username".getBytes()), ByteSequence.from("admin".getBytes())).get();
    }
}
