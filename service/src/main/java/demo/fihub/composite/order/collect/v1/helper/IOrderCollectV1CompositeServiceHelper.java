package demo.fihub.composite.order.collect.v1.helper;

import java.util.List;
import demo.fihub.composite.order.collect.v1.model.*;

public interface IOrderCollectV1CompositeServiceHelper {

  public void processGetReturnsByCustomerOrderIdRequest();

  public List<Order> processGetReturnsByCustomerOrderIdResponse();

  public void processGetReturnsByOrderIdRequest();

  public List<OrderTransactions> processGetReturnsByOrderIdResponse();

  public void processPublishReturnProcessEventRequest();

  public Order processPublishReturnProcessEventResponse();

  public void processGetReturnByOrderIdRequest();

  public Order processGetReturnByOrderIdResponse();
}
