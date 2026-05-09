import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

class RepsumHM {

    public static void main(String[] args) {

        File f1 = new File("c:\\temp\\products.txt");
        Scanner inp;
        String dl;
        HashMap<String, Double> hm = new HashMap<>();

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine();

            while (inp.hasNextLine()) {
                dl = inp.nextLine();
                if (dl.trim().length() == 0) continue;

                String[] parts = dl.split("\t");
                String repID = parts[5];
                double qty = Double.parseDouble(parts[3]);
                double uPrice = Double.parseDouble(parts[2]);
                double amt = qty * uPrice;

                if (hm.containsKey(repID)) {
                    amt += hm.get(repID);
                }
                hm.put(repID, amt);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== Rep ID-wise Sales Total (With HashMap) ===");
        for (Map.Entry<String, Double> me : hm.entrySet()) {
            System.out.println(me.getKey() + " --- " + me.getValue());
        }
    }
}
