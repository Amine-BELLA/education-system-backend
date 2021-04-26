package managestudent.educationsystem.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    int id;
    String name;
    String email;
    String imageUrl;
    String phone;
    @Column(nullable = false, updatable = false)
    String studentCode;

    public Student() {
    }

    public Student(int id, String name, String email, String imageUrl, String phone, String studentCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.studentCode = studentCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPhone() {
        return phone;
    }

    public String getUuid() {
        return studentCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUuid(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", studentCode=" + studentCode +
                '}';
    }
}
