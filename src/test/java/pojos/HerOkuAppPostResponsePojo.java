package pojos;

public class HerOkuAppPostResponsePojo {

    private Integer bookingid;
    private HerOkuAppGetResponesPojo booking;

    public HerOkuAppPostResponsePojo() {
    }

    public HerOkuAppPostResponsePojo(Integer bookingid, HerOkuAppGetResponesPojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public HerOkuAppGetResponesPojo getBooking() {
        return booking;
    }

    public void setBooking(HerOkuAppGetResponesPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "HerOkuAppPostResponsePojo{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}