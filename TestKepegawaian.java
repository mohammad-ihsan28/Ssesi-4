
public class TestKepegawaian {
  public static void main(String[] args)
  {
      Manajer man = new Manajer("Bill Gates", 5000000);
      Supervisor spv = new Supervisor("Susanto", 10000000);
      
      man.naikkanGaji();
      spv.naikkanGaji();
      
      man.cetakStatus();
      spv.cetakStatus();
  }
}
