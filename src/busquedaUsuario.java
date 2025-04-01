import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class busquedaUsuario {
    private static final String FILE_PATH = "JavaApplication3/data/usuarios.txt";

    // Método para guardar un usuario en el archivo
    public static void saveUser(Usuario user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(user.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar todos los usuarios desde el archivo
    public static List<Usuario> loadUsers() {
        List<Usuario> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    users.add(new Usuario(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}