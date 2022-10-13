public class Data {
private final static String EXAMPLE="abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";


    private Data() {

    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return  false;
        }return true;
    }

    private static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!checkSymbols(login)) {
            throw new WrongLoginException();
        }
        if (!checkSymbols(password) || !confirmPassword.equals(password)) {
            throw new WrongPasswordException();
        }
    }

    private static boolean checkSymbols(String s) {

        if (s.length() > 20) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!EXAMPLE.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;

    }
}
