package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class MathHelper {
    public static boolean isValidEquation(String equation) {
        CharStream input = CharStreams.fromString(equation);
        main.ArithmeticEquationsLexer lexer = new main.ArithmeticEquationsLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        main.ArithmeticEquationsParser parser = new main.ArithmeticEquationsParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(DescriptiveErrorListener.INSTANCE);
        parser.equation();

        if (!DescriptiveErrorListener.INSTANCE.ErrorMsg.isEmpty()) {
            DescriptiveErrorListener.INSTANCE.ErrorMsg = "";
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String equation = "";

        while (!equation.equals("q")) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть матиматичне рівняння зі змінною x (або q для виходу):");
            equation = scanner.nextLine();

            if (isValidEquation(equation)) {
                System.out.println("Рівняння коректне.");
            } else {
                if (!equation.equals("q")) System.out.println("\u001B[31m" + "Рівняння некоректне!" + "\u001B[0m");
            }
        }
    }
}
