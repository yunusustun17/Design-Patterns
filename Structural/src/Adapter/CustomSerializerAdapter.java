package Adapter;

public class CustomSerializerAdapter implements IJsonSerializer {
    @Override
    public String serializeObject(Object object) {
        CustomSerializer customSerializer = new CustomSerializer();
        return customSerializer.serialize(object);
    }
}
