public class Data {

    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (checkSymbols(login) != true) {
            throw new WrongLoginException();
        }
        if (checkSymbols(password) != true || confirmPassword.equals(password) == false) {
            throw new WrongPasswordException();
        } else return true;
    }

    public static boolean checkSymbols(String s) {
        if (s.length() > 20 || s.isEmpty() || s == null) {
            return false;
        }
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i]) || Character.isDigit(chars[i])) {
                count++;
            }
        }
        if (count == chars.length) {
            return true;
        } else return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
