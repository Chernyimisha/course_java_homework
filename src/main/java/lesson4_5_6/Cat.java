package lesson4_5_6;

import java.util.Objects;

public class Cat {
//    Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, необязательно реализовывать в java.

    int age;
    String nickname;
    String breed;
    boolean isMale;

    public Cat(int age, String nickname, String breed, boolean isMale) {
        this.age = age;
        this.nickname = nickname;
        this.breed = breed;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        StringBuilder sbl = new StringBuilder();
        sbl.append(nickname).append(" ").append(age);
        return sbl.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickname, breed, isMale);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat temp = (Cat) obj;
        return temp.age == this.age && temp.isMale == this.isMale && temp.breed.equals(this.breed) && temp.nickname.equals(this.nickname);
    }
}
