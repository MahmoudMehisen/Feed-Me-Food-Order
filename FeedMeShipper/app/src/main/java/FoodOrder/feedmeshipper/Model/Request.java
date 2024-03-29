package FoodOrder.feedmeshipper.Model;

import java.util.List;

public class Request {

    private String phone;
    private String name;
    private String lat;
    private String lng;
    private String total;
    private String paymentMethod;
    private String status;
    private String comment;
    private String paymentState;
    private List<Order> foods;

    public Request() {
    }

    public Request(String phone, String name, String lat, String lng, String total, String paymentMethod, String status, String comment, String paymentState, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.comment = comment;
        this.paymentState = paymentState;
        this.foods = foods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}