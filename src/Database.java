import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String kullaniciAdi = "root";
        String parola = "15062001";

        try {
            Connection connection = DriverManager.getConnection(url, kullaniciAdi, parola);
            // Bağlantı başarılı, burada yapılacak işlemleri gerçekleştirin
        } catch (SQLException e) {
            // Bağlantı hatası, hata durumunu ele alın
            e.printStackTrace();
        }

    }}









