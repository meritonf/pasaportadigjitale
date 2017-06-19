
package theClasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class Person {
    private int id;
    private String name;
    private String lastname;
    private String nationality;
    private long personalNumber;
    private String BirthPlace;
    private String Gender;
    private Date date;

    public Person(ResultSet rs) throws SQLException {
        id=rs.getInt("id");
        personalNumber=rs.getLong("numri_personal");
        name=rs.getString("name");
        lastname=rs.getString("lastname");
        nationality=rs.getString("nationality");
        BirthPlace=rs.getString("birthPlace");
        Gender=rs.getString("gender");
        date=rs.getDate("date");
                
    }

    public Person(String name, Date date, String lastname, String nationality
                   , long personalNumber, String BirthPlace, String Gender) {
        this.name=name;
        this.lastname=lastname;
        this.date=date;
        this.nationality=nationality;
        this.Gender=Gender;
        this.BirthPlace=BirthPlace;
        this.personalNumber=personalNumber;
    }
    public Person(String name, Date date, String lastname, String nationality
                   , long personalNumber, String BirthPlace) {
        this.name=name;
        this.lastname=lastname;
        this.date=date;
        this.nationality=nationality;
        this.Gender=Gender;
        this.BirthPlace=BirthPlace;
        this.personalNumber=personalNumber;
    }

    public Person(String name, Date date) {
        this.name=name;
        this.date=date;
        this.lastname="Fisteku";
        this.nationality="AL";
        this.BirthPlace="Albania";
        this.Gender="M";
        this.personalNumber=000000;
    }
     public Person(JSONObject passportObject) {
    
        try{
            this.name = passportObject.getString("name");
            this.lastname = passportObject.getString("lastname");
            this.personalNumber = (long)passportObject.getDouble("personalNumber");

            JSONObject issueDate = passportObject.getJSONObject("issueDate");

            this.date = new Date(issueDate.getInt("year"), 
                                    issueDate.getInt("month"), 
                                    issueDate.getInt("day"));
        }
        catch(JSONException ex) {
        
            this.name = "Unknown Person";
        }
    }
     
     public JSONObject getJSONObject() {
    
        try{
            
            JSONObject bookObject = new JSONObject();

            bookObject.put("name", name);
            bookObject.put("lastname", lastname);
            bookObject.put("personalNumber", personalNumber);

            JSONObject Date = new JSONObject();
            Date.put("day", date.getDay());
            Date.put("month", date.getMonth());
            Date.put("year", date.getYear());

            bookObject.put("Date", Date);
           
            return bookObject;
        }
        catch(JSONException ex) {
        
            return null;
        }
    }
   
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
     
    
    
}
