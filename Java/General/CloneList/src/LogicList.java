import java.util.*;
import static java.lang.System.*;

public class LogicList {
    private static final Scanner cs = new Scanner(System.in);

    private List<Integer> listNumbers;

    public LogicList() { listNumbers = new LinkedList<>(); }
    public LogicList(List<Integer> listNumbers) { setListNumbers(listNumbers); }

    public List<Integer> getListNumbers() { return listNumbers; }
    public void setListNumbers(List<Integer> listNumbers) { this.listNumbers = listNumbers; }

    public void menuList(ArrayList<Integer> arrayListNumbers) { menuListP(arrayListNumbers); }
    private void menuListP(ArrayList<Integer> arrayListNumbers) {
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
                        addNumber();
                        break;
                    case 2:
                        showNumbers();
                        break;
                    case 3:
                        cloneNumbers(arrayListNumbers);
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
    private void addNumber() {
        int n, i;
        System.out.printf("%s%n", Constants.GENERATE_DATA);
        n = cs.nextInt();
        try {
            if(n >= 0) {
                for(i = 0; i < n; i++){
                    System.out.printf("%s%n", Constants.INDEX_DATA + i);
                    getListNumbers().add(cs.nextInt());
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
        if(!getListNumbers().isEmpty()) {
            out.println(getListNumbers());
        } else {
            out.println(Constants.NO_DATA);
        }
    }

    // Cuando clonas lo que este en tu ArrayList se clonara a tu List.
    private void cloneNumbers(ArrayList<Integer> arrayListNumbers) {
        boolean isClone = false;
        if(!arrayListNumbers.isEmpty()) {
            for (int i : arrayListNumbers) {
                isClone = this.getListNumbers().add(i);
            }
            if (isClone) {
                out.println(Constants.CLONE_TRUE);
            } else {
                out.println(Constants.CLONE_FALSE);
            }
        } else {
            out.println(Constants.NO_DATA);
        }
    }

}
