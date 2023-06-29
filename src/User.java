public class User {

    private String name;
    private String email;
    private String password;
    private Integer score = 0;
    private Integer trophy = 0;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void acrescentaPonto(Integer ponto){
        this.score = score+ponto;
    }
    public Integer getScore() {
        return score;
    }

    public void acrescentaPonto(){
        this.score = score;
    }

    public Integer getTrophy() {
        return trophy;
    }

    public void setTrophy(){
        this.trophy = trophy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
