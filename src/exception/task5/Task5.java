package exception.task5;

public class Task5 {

    /**
     * создайте статический метод, который принимает на вход три параметра: login, password, confirmPassword
     *
     * login треб1:      должен содержать только латинские буквы, цифры и знак подчеркивания
     * login треб2:      длина должна быть меньше 20 символов
     * login если не соотв треб1-2:      выбросить WrongLoginException (создать самостоятельно)
     *
     * password треб 1:  должен содержать только латинские буквы, цифры и знак подчеркивания
     * password треб 2:  длина должна быть меньше 20 символов
     * password если не соотв треб1-2:   выбросить WrongPasswordException (создать самостоятельно)
     *
     * WrongLoginException и WrongPasswordException: пользовательские классы исключения с двумя конструкторами:
     * один по умолчанию
     * второй принимает сообщение исключения и передает его в конструктор класса Exception
     *
     * обработка исключений проводится внутри метода
     * используйте multi-catch-block
     *
     * метод возвращает true, если значения верны
     * или false в ином случае
     */
    public static void main(String[] args) {
        System.out.println("тест1:");
        System.out.println(checkMethod("skufarev05_", "12password9", "12password9"));
        System.out.println();

        System.out.println("тест2:");
        System.out.println(checkMethod("skufarev05_", "12password9!", "12password9"));
        System.out.println();

        System.out.println("тест3:");
        System.out.println(checkMethod("skufarev05_!", "12password9", "12password9"));
    }

    public static boolean checkMethod(String login, String password, String confirmPassword) {

        //отдельно наброски по каждому условию
        //LOGIN
        //треб1: должен содержать только латинские буквы, цифры и знак подчеркивания
        /*boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        System.out.println(onlyLatinAlphabet);
        return onlyLatinAlphabet;*/

        //треб2: длина не менее 20 символов
        /*if (login.length() < 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }*/

        //PASSWORD
        //треб1: должен содержать только латинские буквы, цифры и знак подчеркивания
        /*boolean onlyLatinAlphabet = password.matches("^[a-zA-Z0-9_]+$");
        System.out.println(onlyLatinAlphabet);
        return onlyLatinAlphabet;*/

        //треб2: длина не менее 20 символов
        /*if (password.length() < 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }*/

        //треб3: пароли должны совпадать
        /*if (password.equals(confirmPassword)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }*/

        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new WrongLoginException("Wrong login!!!");
        } catch (WrongPasswordException e) {
            throw new WrongLoginException("Wrong password!!!");
        }

        return true;
    }

    public static void validateLogin(String login) throws WrongLoginException {
        boolean onlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        if (!onlyLatinAlphabet) {
            throw new WrongLoginException("Wrong login - только лат буквы, цифры, нижн подчеркивания");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("Wrong login - длина логина должна быть не менее 20 символов");
        }
    }

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        boolean onlyLatinAlphabet = password.matches("^[a-zA-Z0-9_]+$");
        if (!onlyLatinAlphabet) {
            throw new WrongPasswordException("Wrong password - только лат буквы, цифры, нижн подчеркивания");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Wrong password - длина пароля должна быть не менее 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password - пароли не совпадают");
        }
    }

}
