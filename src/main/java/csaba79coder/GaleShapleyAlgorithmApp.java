package csaba79coder;

import csaba79coder.model.GaleShapley;

public class GaleShapleyAlgorithmApp {

    public static void main(String[] args) {

        System.out.println("Gale Shapley Marriage Algorithm\n");

        String[] m = {"M1", "M2", "M3", "M4", "M5"};

        String[] w = {"W1", "W2", "W3", "W4", "W5"};

        String[][] mp = {{"W5", "W2", "W3", "W4", "W1"},
                {"W2", "W5", "W1", "W3", "W4"},
                {"W4", "W3", "W2", "W1", "W5"},
                {"W1", "W2", "W3", "W4", "W5"},
                {"W5", "W2", "W3", "W4", "W1"}};

        String[][] wp = {{"M5", "M3", "M4", "M1", "M2"},
                {"M1", "M2", "M3", "M5", "M4"},
                {"M4", "M5", "M3", "M2", "M1"},
                {"M5", "M2", "M1", "M4", "M3"},
                {"M2", "M1", "M4", "M3", "M5"}};

        GaleShapley gs = new GaleShapley(m, w, mp, wp);
    }
}
