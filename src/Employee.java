public class Employee {
    public static void main(String[] args) {
    }
    private String fio;
    private String post;
    private String email;
    private int age;
    private int phone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Employee(String fio, String post, String email, int age, int phone){
        this.fio=fio;
        this.post=post;
        this.email=email;
        this.age=age;
        this.phone=phone;


    }
}
