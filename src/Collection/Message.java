package Collection;

/**
 * Created by student on 11/6/2015.
 */
public class Message implements Comparable<Message> {
    private StringBuilder str;

    private int idSender;

    public Message(StringBuilder s, int id) {

        super();

        this.str = s;

        idSender = id;

    }

    public String getStr() {

        return str.toString();

    }

    public int getId() {

        return idSender;

    }

    @Override
    public String toString() {
        return "Message{" +
                "str=" + str +
                ", idSender=" + idSender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (idSender != message.idSender) return false;
        return str.equals(message.str);

    }

    @Override
    public int hashCode() {
        int result = str.hashCode();
        result = 31 * result + idSender;
        return result;
    }

    public int compareTo(Message a0) {
        if (idSender == a0.getId()){
            if (getStr().equals(a0.getStr())){
                return 0;
            }else return getStr().compareTo(a0.getStr());
        }
        return (idSender - a0.getId());
    }
}
