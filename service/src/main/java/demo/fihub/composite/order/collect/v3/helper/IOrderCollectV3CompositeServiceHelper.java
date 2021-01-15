package demo.fihub.composite.order.collect.v3.helper;

import java.util.List;
import demo.fihub.composite.order.collect.v3.model.*;

public interface IOrderCollectV3CompositeServiceHelper {

  public void processGetReturnsByCustomerOrderIdRequest();

  public List<Order> processGetReturnsByCustomerOrderIdResponse();

  public void processGetReturnsByOrderIdRequest();

  public List<OrderTransactions> processGetReturnsByOrderIdResponse();

  public void processPublishReturnProcessEventRequest();

  public Order processPublishReturnProcessEventResponse();

  public void processGetReturnByOrderIdRequest();

  public Order processGetReturnByOrderIdResponse();
}
