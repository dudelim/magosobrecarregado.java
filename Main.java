class Main {
  public static void main(String[] args) {
    Cajado cajado = new Cajado();

    PedraFogo pedraFogo = new PedraFogo();
    PedraAgua pedraAgua = new PedraAgua();
    PedraAr pedraAr = new PedraAr();
    PedraTerra pedraTerra = new PedraTerra();

   
    cajado.executarPoderElemental(pedraFogo, pedraAr);
    cajado.executarPoderElemental(pedraFogo, pedraTerra);
    cajado.executarPoderElemental(pedraTerra, pedraAgua);
    cajado.executarPoderElemental(pedraAgua, pedraAr);
  }
}
