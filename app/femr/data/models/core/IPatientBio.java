package femr.data.models.core;

/**
 * Created by root on 11/17/2016.
 */
public interface IPatientBio {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getSex();

    void setSex(String sex);

    String getAddress();

    void setAddress(String address);

    String getCity();

    void setCity(String city);
}
