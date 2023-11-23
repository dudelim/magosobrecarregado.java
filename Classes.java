class PedraElemento{
  public int Forca; 
  public String Tipo; 
  

  public PedraElemento(String Tipo, int Forca){
    this.Tipo = Tipo;
    this.Forca = Forca;
  }
}

class PedraFogo extends PedraElemento{
  public PedraFogo(){
    super("Fogo", 1);
  }
}

class PedraAgua extends PedraElemento{
  public PedraAgua(){
    super("Água", 2);
  }
}

class PedraAr extends PedraElemento{
  public PedraAr(){
    super("Ar", 3);
  }
}

class PedraTerra extends PedraElemento{
  public PedraTerra(){
    super("Terra", 4);
  }
}

class Cajado {
  
  public void executarPoderElemental(PedraElemento pedra1, PedraElemento pedra2) {
   System.out.println("Poder: " + pedra1.Tipo); 
  }
  
  
  public void executarPoderElemental(PedraFogo pedra1, PedraAgua pedra2) {
   System.out.println("Fogo + Água: Vapor");
  }
  public void executarPoderElemental(PedraAgua pedra1, PedraFogo pedra2) {
   System.out.println("Fogo + Água: Vapor");
  }
  
  
  public void executarPoderElemental(PedraFogo pedra1, PedraAr pedra2) {
   System.out.println("Fogo + Ar: Vapor");
  }
  public void executarPoderElemental(PedraAr pedra1, PedraFogo pedra2) {
   System.out.println("Fogo + Ar: Vapor");
  }
  
  public void executarPoderElemental(PedraFogo pedra1, PedraTerra pedra2) {
   System.out.println("Fogo + Terra: Lava ");
  }
  public void executarPoderElemental(PedraTerra pedra1, PedraFogo pedra2) {
   System.out.println("Fogo + Terra: Lava ");
  }
  
  public void executarPoderElemental(PedraTerra pedra1, PedraAgua pedra2) {
   System.out.println("Terra + Água: Planta");
  }
  public void executarPoderElemental(PedraAgua pedra1, PedraTerra pedra2) {
   System.out.println("Terra + Água: Planta");
  }
  
  public void executarPoderElemental(PedraAgua pedra1, PedraAr pedra2) {
   System.out.println("Água + Ar: Neve");
  }
  public void executarPoderElemental(PedraAr pedra1, PedraAgua pedra2) {
   System.out.println("Água + Ar: Neve");
  }
}
