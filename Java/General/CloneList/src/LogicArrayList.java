import java.util.*;
import static java.lang.System.*;

public class LogicArrayList {
    private static final Scanner cs = new Scanner(System.in);

    private ArrayList<Integer> arrayListNumbers;

    public LogicArrayList() { this.arrayListNumbers = new ArrayList<>(); }
    public LogicArrayList(ArrayList<Integer> arrayListNumber) {
        setArrayListNumbers(arrayListNumber);
    }

    public ArrayList<Integer> getArrayListNumbers() { return arrayListNumbers; }
    public void setArrayListNumbers(ArrayList<Integer> arrayListNumbers) { this.arrayListNumbers = arrayListNumbers; }

    public void menuArrayList(List<Integer> listNumbers) { menuArrayListP(listNumbers); }
    private void menuArrayListP(List<Integer> listNumbers) {
        int opc;
        while(true) {
            out.printf("%s%n", Constants.ADD_DATA);
            out.printf("%s%n", Constants.SHOW_DATA);
            out.printf("%s%n", Constants.CLONE_DATA);
            out.printf("%s%n", Constants.RETURN);
            try {
                opc = cs.nextInt();
                switch (opc) {
                    case 1:
                        addNumbers();
                        break;
                    case 2:
                        showNumbers();
                        break;
                    case 3:
                        cloneNumbers(listNumbers);
                        break;
                    case 4:
                        out.printf("%s%n", Constants.CAME_BACK);
                        return;
                    default:
                        out.println(Constants.OPTION_NOT_VALIDATE);
                }
            } catch (InputMismatchException e) {
                err.println(Constants.ERROR);
                cs.next();
            }
        }
    }

    // Se pide primero el numero de datos que vas a ingresar.
    private void addNumbers() {
        int n, i;
        out.printf("%s%n", Constants.GENERATE_DATA);
        try {
            n = cs.nextInt();
            if (n >= 0) {
                for(i = 0; i < n; i++) {
                    out.printf("%s%n", Constants.INDEX_DATA + i);
                    getArrayListNumbers().add(cs.nextInt());
                }
            } else {
                out.println(Constants.NEGATIVE_DATA);
            }
        } catch (InputMismatchException e) {
            err.println(Constants.ERROR);
            cs.next();
        }
    }

    private void showNumbers() {
        if(!getArrayListNumbers().isEmpty()) {
            out.println(getArrayListNumbers());
        } else {
            out.println(Constants.NO_DATA);
        }
    }

    // Cuando clonas lo que este en tu List se clonara a tu ArrayList.
    private void cloneNumbers(List<Integer> listNumbers) {
        boolean isClone = false;
        if(!listNumbers.isEmpty()) {
            for (int i : listNumbers) {
                isClone = this.getArrayListNumbers().add(i);
            }
            if(isClone) {
                out.println(Constants.CLONE_TRUE);
            } else {
                out.println(Constants.CLONE_FALSE);
            }
        } else {
            out.println(Constants.NO_DATA);
        }
    }

}
