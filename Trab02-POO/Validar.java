import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
    private static final String REGEX_EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String REGEX_CPF = "^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}$";

    public static boolean validarEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validarCPF(String cpf) {
        Pattern pattern = Pattern.compile(REGEX_CPF);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }
}