package aula4;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean statusConta;

    public void estadoAtual(){
        System.out.println("----------------------------------------");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatusConta());
    }


    public Conta() {
        this.saldo = 0;
        this.statusConta = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatusConta(true);

        if (tipo.equals("CC")){
            setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        }
        else if(tipo.equals("CP")){
            setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }
    }
    public void fecharConta(){
        if (saldo > 0){
            System.out.println("ERRO, a conta ainda tem dinheiro!");
        }
        else if(saldo < 0){
            System.out.println("ERRO, conta em débito!");
        }
        else{
            setStatusConta(false);
            System.out.println("Conta fechada.");
        }
    }

    public void depositar(float v){
        if(statusConta == true){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + getDono());
        }
        else{
            System.out.println("Erro ao depositar.");
        }
    }

    public void sacar(float v){
        if (statusConta == true){
            if(getSaldo() >= v){
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado com sucesso.");
            }
            else{
            System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Impossível sacar.");
        }
    }

    public void pagarMensal(){
        float v = 0;

        if (tipo.equals("CC")){
            v = 12;
        }
        else if(tipo.equals("CP")){
            v = 20;
        }

        if (statusConta == true){
            if(saldo > v){
                setSaldo(getSaldo() - v);
            }
            else{
                System.out.println("Saldo insuficiente.");
            }
        }
        else{
            System.out.println("Impossivel pagar.");
        }
    }
    
    
}
