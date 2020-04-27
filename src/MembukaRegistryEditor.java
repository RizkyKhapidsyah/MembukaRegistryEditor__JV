public class MembukaRegistryEditor {
    public MembukaRegistryEditor() {

    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proc;
        try {
            proc = rt.exec("regedit");
            proc.waitFor(); //try removing this line
        } catch (Exception e) {
            System.out.println("regedit is an unknown command.");
        }
    }
}
