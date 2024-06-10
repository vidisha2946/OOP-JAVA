import java.io.*;

public class Ch5FileMerger {
    public static void main(String[] args) {
        String file1Path = "file1.txt";
        String file2Path = "file2.txt";
        String mergedFilePath = "mergedFile.txt";

        mergeFiles(file1Path, file2Path, mergedFilePath);
    }
    public static void mergeFiles(String file1Path, String file2Path, String mergedFilePath) {
        try {
            // Create file readers for both input files
            BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));

            // Create file writer for the merged file
            BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFilePath));

            // Read and write contents of file1 to the merged file
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read and write contents of file2 to the merged file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close readers and writer
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while merging files: " + e.getMessage());
        }
    }
}
