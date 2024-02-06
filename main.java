public class NameDeployer {
    private String name;

    public NameDeployer(String name) {
        this.name = name;
    }

    public void deploy() {
        System.out.println("Deploying name: " + name);
    }

    public static void main(String[] args) {
        String myName = "Rakesh R"; // Replace "Your Name" with your actual name
        NameDeployer deployer = new NameDeployer(myName);
        deployer.deploy();
    }
}
