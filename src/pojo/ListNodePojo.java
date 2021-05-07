package pojo;

public class ListNodePojo{
    public int id;
    public String name;
    public ListNodePojo next;

    public ListNodePojo(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ListNodePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
