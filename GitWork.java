import java.nio.file.*;

class GitWork
{
	 public static void main(String[] args) {
        Path path = Paths.get("D:\\Magizhchi\\karrepo");

        try {
            Files.createDirectories(path); // creates parent directories if needed
            System.out.println("Folder created: " + path.toAbsolutePath());
        } catch (Exception e) {
            System.err.println("Error creating folder: " + e.getMessage());
        }
    }
}