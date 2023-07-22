import graphics.*;
class Main{
  public static void main(String[] args){
	Picture altura = Picture.caballo().repetirV(4);
	Graphics g = new Graphics(altura);
	g.print();
  }
}


