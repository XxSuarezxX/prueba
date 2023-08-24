package presenter;
import model.Factorial;
import view.View;
public class Presenter {
    Factorial factorial = new Factorial();
    View view = new View();

    public void run(){
        int number_factorial = view.readGraphicInt("ingresa el numero ");
        factorial.setNumber_factorial(number_factorial);

        view.readGraphicMessage("el resultado de tu numero es " + factorial.calculateFactorial(number_factorial));

    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.run();
    }
}
