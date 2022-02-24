package Adapter;

public class CustomOperation {
    private IJsonSerializer jsonSerializer;

    public CustomOperation(IJsonSerializer jsonSerializer) {
        this.jsonSerializer = jsonSerializer;
    }

    public String SerializeObject(Object object) {
        return jsonSerializer.serializeObject(object);
    }
}
