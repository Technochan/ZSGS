package SecondEvaluation.com.lift_system.erroemessage;

public class ErrorMessage {
    public static void printErrorMessage(String message) {
        System.out.println(
                "\n=================================" +
                        "\n=             ERROR             =" +
                        "\n\t" + message +
                        "\n=        Please Try Again       =" +
                        "\n================================="
        );
    }
}
