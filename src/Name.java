
//Задание 1.3
public class Name {
    // поля
    private String last_name;
    private String first_name;
    private String middle_name;

    // свойства
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    // конструкторы
    public Name() {
        this.last_name = "";
        this.first_name = "";
        this.middle_name = "";
    }

    public Name(String last_name, String first_name, String middle_name) {
        this.last_name = last_name.strip();
        this.first_name = first_name.strip();
        this.middle_name = middle_name.strip();
    }

    // методы
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!last_name.isEmpty()) {
            sb.append(last_name);
        }
        if (!first_name.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(first_name);
        }
        if (!middle_name.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(middle_name);
        }
        return sb.toString();
    }
}