package java_assignment_14_multithreading.download_file_from_url;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownload implements Runnable {
    private String url;
    private String saveFilePath;
    private volatile boolean interruptDownload = false;

    public FileDownload(String url, String saveFilePath) {
        this.url = url;
        this.saveFilePath = saveFilePath;
    }

    public void interruptDownload() {
        interruptDownload = true;
        Thread.currentThread().interrupt();
    }

    @Override
    public void run() {
        try {
            URL targetUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) targetUrl.openConnection();

            int fileSize = connection.getContentLength();
            int downloadedSize = 0;

            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream outputStream = new FileOutputStream(saveFilePath)) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    if (interruptDownload) {
                        System.out.println("Download interrupted.");
                        return;
                    }

                    outputStream.write(buffer,0, bytesRead);
                    downloadedSize += bytesRead;
                    double progress = ((double) downloadedSize / fileSize) * 100;
                    System.out.printf("Downloaded %.2f%%\n", progress);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Download completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
