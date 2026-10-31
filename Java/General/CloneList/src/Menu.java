import java.util.*;
import static java.lang.System.*;

public class Menu {
    private static final Scanner cs = new Scanner(System.in);

    private final LogicArrayList logicArrayList = new LogicArrayList();
    private final LogicList logicList = new LogicList();

    public void menuPrimary() { menuPrimaryP(); }
    private void menuPrimaryP() {
        int opc;
        while(true) {
            out.printf("%s%n", Constants.MENU_ARRAYLIST);
            out.printf("%s%n", Constants.MENU_LIST);
            out.printf("%s%n", Constants.EXIT_APP);
            try {
                opc = cs.nextInt();
                switch (opc) {
                    case 1:
                        logicArrayList.menuArrayList(logicList.getListNumbers());
                        break;
                    case 2:
                        logicList.menuList(logicArrayList.getArrayListNumbers());
                        break;
                    case 3:
                        out.printf("%s%n", Constants.LEFT_APP);
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

}
