package com.example.template;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DeliveryCompleted extends AbstractEvent{

    private String stateMessage = "배송이 완료됨";

    private Long deliveryId;
    private Long orderId;
    private int quantity;
    private Long productId;
    private String productName;
    private String customerId;
    private String customerName;
    private String deliveryAddress;
    private String deliveryState;

    public DeliveryCompleted(){
        super();
    }
    public DeliveryCompleted(Delivery delivery){
        this();
        this.setOrderId(delivery.getOrderId());
        this.setDeliveryId(delivery.getDeliveryId());
        this.setQuantity(delivery.getQuantity());
        this.setCustomerId(delivery.getCustomerId());
        this.setCustomerName(delivery.getCustomerName());
        this.setDeliveryAddress(delivery.getDeliveryAddress());
        this.setProductId(delivery.getProductId());
        this.setProductName(delivery.getProductName());
        this.setDeliveryState(this.getClass().getSimpleName());
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }
}
