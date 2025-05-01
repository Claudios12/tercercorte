import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class InterfazPatrones extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejecutor de Patrones de Diseño");

        Button facadeButton = new Button("Ejecutar Facade");
        Button proxyButton = new Button("Ejecutar Proxy");
        Button flyweightButton = new Button("Ejecutar Flyweight");

        facadeButton.setOnAction(event -> ejecutarPatron("Facade.Clases.MainFacada"));
        proxyButton.setOnAction(event -> ejecutarPatron("Proxy.Clases.MainProxy"));
        flyweightButton.setOnAction(event -> ejecutarPatron("FlyWeight.Clases.MainFly"));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(facadeButton, proxyButton, flyweightButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void ejecutarPatron(String mainClass) {
        try {
            String classpath = System.getProperty("java.class.path");
            String rutaClases = "./src"; // Ajusta si es necesario
            if (!classpath.contains(rutaClases)) {
                classpath += ":" + rutaClases; // Separador de classpath es ':' en Unix/Linux/macOS
            }
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                classpath = classpath.replace(":", ";"); // Separador en Windows es ';'
            }

            ProcessBuilder builder = new ProcessBuilder("java", "-cp", classpath, mainClass);
            Process process = builder.start();

            // Opcional: Puedes leer la salida del proceso si tus Main imprimen algo
            // InputStream inputStream = process.getInputStream();
            // BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            // String line;
            // while ((line = reader.readLine()) != null) {
            //     System.out.println(line);
            // }

            int exitCode = process.waitFor();
            System.out.println("El patrón " + mainClass + " terminó con código: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}