package OOP_seminars.seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User> {
    List<User> userList = new ArrayList<>();

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < userList.size();
            }

            @Override
            public User next() {
                return userList.get(index++);
            }
        };
    }

    public Personal addUsers(User user){
        userList.add(user);
        return this;
    }

    public List<User> toList(){
        List<User> result = new ArrayList<>();
        for (User user: this) {
            result.add(user);
        }
        return result;
    }
}
