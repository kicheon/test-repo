package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }


  private String newFeatureInMaster() {
    return "New feature in master";
  }

  private String newFeature() {
    return "this is feature/new-feature";
  }

  private String newFeature2_1() {
    return "this is new feature 2-1-detached-head";
  }

  private String newFeature2_2() {
    return "this is new feature 2-2";
  }
}
