package demo.order.v1.composite.shipment.v2.comp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
      "com.macys.mst.order.foundation",
      "demo.order.v1.composite.shipment.v2.comp"
    })
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
