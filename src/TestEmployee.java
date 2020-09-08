import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestEmployee {
    public static void main(String[] args) {
        Employee erik = new Employee(2123954, "Erik","Gustafsson", 27000);
        System.out.println(erik.toString());
        System.out.println();
    }
}
