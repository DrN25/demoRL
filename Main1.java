import graphics.*;
class Main{
  public static void main(String[] args){
	Picture altura = Picture.peon().repetirH(5);
	Graphics g = new Graphics(altura);
	g.print();
  }
}


