import java.util.Random;

public class passw {
    public static void main(String[] args) {
        //Emir Alçan Tarafınan yazılmıştır
        char[] password = "abcdefghijklmnoprstuvyzABCDEFGHIJKLMNOPRSTUVYZ0123456789!@#$%^&*".toCharArray();
        Random r = new Random();
        char[] sifre = new char[8];
        sifre[0] = password[r.nextInt(password.length)];
        sifre[1] = password[r.nextInt(password.length)];
        sifre[2] = password[r.nextInt(password.length)];
        sifre[3] = password[r.nextInt(password.length)];
        sifre[4] = password[r.nextInt(password.length)];
        sifre[5] = password[r.nextInt(password.length)];
        sifre[6] = password[r.nextInt(password.length)];
        sifre[7] = password[r.nextInt(password.length)];
        System.out.println("Şifreniz = " + new String(sifre));
    }
}
