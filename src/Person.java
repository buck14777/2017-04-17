/**
 * Created by USER on 2017/4/7.
 */
public class Person {
    protected  String name, id, gender;
    public Person(){}
    public Person(String name1, String id1){
        this.name = name1;
        this.id = id1;
    }
    public void setName(String name1){
        name=name1;
    }
    public String getName(){
        return name;
    }
    public void setId(String id1){
        id=id1;
    }
    public String getId(){
        return id;
    }
    public void setGender(String gender1){
        gender=gender1;
    }
 	public String getGender(){
        return gender;
    }
}