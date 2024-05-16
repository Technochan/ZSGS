package java_assignment_14_multithreading.download_file_from_url;

// 1. Simple File Download (Thread Interruption and Monitoring):
//
//Create a thread to download a file from a URL.
//Implement thread interruption to gracefully stop the download if needed
//Monitor the download progress and provide feedback (e.g., percentage downloaded).


import java.io.IOException;


public class FileDownloadMain {
    public static void main(String[] args) throws IOException {
        String url = "https://wallpapercave.com/wp/wp4084930.jpg";
        String saveFilePath = "javapic.jpg";

        FileDownload fileDownload = new FileDownload(url, saveFilePath);
        Thread downloadThread = new Thread(fileDownload);

        downloadThread.start();

        try {
            Thread.sleep(200);
            fileDownload.interruptDownload();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runtime rt = Runtime.getRuntime();
        String command = "open "+saveFilePath;
        Process p = rt.exec(command);
    }
}
