package Implementando_Conta_P;

public class CPoupanca extends  CCorrente {
    private float saldominimo;

    public CPoupanca(int num, float sal, String cli, float salmin) {
        super(num, sal, cli);
        this.saldominimo = salmin;
    }

    public void debitar(float valor) {
        if (valor <= super.get_saldo()) {
            super.set_saldo(super.get_saldo() - valor);

            if (super.get_saldo() < this.saldominimo)
                this.saldominimo = (float) super.get_saldo();
        } else
            System.out.println("Saldo Insuficiente");
    }
    public void atualizar_saldo(){
        super.set_saldo((float) (super.get_saldo() + (this.saldominimo * 0.05)));
        this.saldominimo = (float) super.get_saldo();
    }
    public float get_saldominimo(){
        return this.saldominimo;
    }
}