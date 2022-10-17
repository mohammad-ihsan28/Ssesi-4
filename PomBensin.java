
public class PomBensin {

    public PomBensin() {
    }


    public static void main(String[] args) 
    {
        MobilMewah alphard = new MobilMewah();
        MobilKuno Carry = new MobilKuno();
        Pertamina gs = new Pertamina();
        
        gs.isiBahanBakar(Carry);
        gs.isiBahanBakar(alphard);
    }
    
}
