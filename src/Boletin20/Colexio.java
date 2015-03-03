package Boletin20;

import static Boletin20.Alumno.numRegistro;

/*** @author dpazolopez ***/
public class Colexio {
    
    private String nome;
    private int nota;
    
    
   public Colexio(){
   }
   
   public Colexio(String nome, int nota){
       this.nome=nome;
       this.nota=nota;
       numRegistro ++;
      
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNumRegistro(int numRegistro) {
        Alumno.numRegistro = numRegistro;
    }
   @Override
   public String toString(){
       return "Alumno{"+"\nnome:\n"+nome+ "\nnota:\n"+"\nNumero de registro:\n"+numRegistro+'}';
   }
}
