package wyh.tutorial.model;

/**
 * Created by Administrator on 2016/4/14.
 */
public class MessageDetailModel extends BaseModel {
   public MessageDetailModel(String id,String name,String address,String type,String notes,Double latitude,Double longitude){
       this.id=id;
       this.address = address;
       this.name = name;
       this.type = type;
       this.notes = notes;
       this.latitude = latitude;
       this.longitude = longitude;
   }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    private String name;
    private String address;
    private String type;
    private String notes;
    private Double latitude;
    private Double longitude;

}
