package lesson25.hw;

public class File {
    private int id;
    private String name;

    public File(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
