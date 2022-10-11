import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Data first = new Data("21655156465165gfgjdf", "1254hfjd", "1254hfjd");
        try {
            System.out.println(Data.checkData(first.getLogin(), first.getPassword(), first.getConfirmPassword()));
        } catch (WrongLoginException e) {
            System.out.println("Неправильно введен логин");
        } catch (WrongPasswordException e) {
            System.out.println("Неправильно введен пароль");
        }
    }
}
