import java.util.Scanner;
import java.util.Random;

class Main {

  // Imports Globais//
  static Scanner sc = new Scanner(System.in);

  static int vidaprot = 100;
  static int danoprot = 10;
  static int fogo = 20;
  static int agua = 15;
  static int gelo = 13;
  static int raio = 16;
  static int atk = 10;
  static int atkspc = 20;
  static String nome;

  public static void main(String[] args) {
  Menu();
}
  static void Menu() { 
  int menu;
 //Criando a Tela do menu
  System.out.println("\n1- Introdução\n"+
                       "2- Jogar\n"+
                       "3- Créditos\n"+
                       "4- Sair");
  menu = sc.nextInt();
     
switch(menu){
  case 1:
    System.out.println("Dicas de como jogar.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    break;
  case 2:
    Quiz();
    break;
  case 3:
    System.out.println("Joguinho feito por Breno, Camila e Mj e O MAGO JAPARDO.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    break;
  case 4:
    System.out.println("Obrigado por ter jogado.");
    System.exit(0);
    break;
  default:
    System.out.println("Opção invalida....Noia\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    }
  }
//Definindo a classe do jogador 
  static void Quiz() {

  int quiz;
  int especialidade = 0;
    
  System.out.println("\n*-Bem vindo á Maconhalandia-*\n");
  System.out.println("Insira seu nome nesse novo mundo");
  nome = sc.next();
  System.out.println("\nDesejo sorte em sua nova aventura:\n" + nome);
  System.out.println("\nHora de escolher sua especialidade, para isso serão feitas algumas perguntas");

  System.out.println("\nPara começarmos, qual estação você prefere?"+
                    "\n1- verão\n"+
                    "2- inverno\n"+
                    "3- outono\n"+
                    "4- Primavera");
    quiz = sc.nextInt();

    switch(quiz){
      case 1:
        especialidade = especialidade + 1;
        break;
      case 2:
        especialidade = especialidade + 2;
        break;
      case 3:
        especialidade = especialidade + 3;
        break;
        
      case 4:
        especialidade = especialidade + 4;
        break;
    }
    
  System.out.println("\nCerto... E das seguintes cores, qual sua favorita?"+
                    "\n1- Vermelho\n"+
                    "2- Azul\n"+
                    "3- Cinza\n"+
                    "4- Amarelo");
    quiz = sc.nextInt();

    switch(quiz){
      case 1:
        especialidade = especialidade + 1;
        break;
      case 2:
        especialidade = especialidade + 2;
        break;
      case 3:
        especialidade = especialidade + 3;
        break;
      case 4:
        especialidade = especialidade + 4;
        break;
    }
    
    
  System.out.println("\nQual das seguintes personalidades combina mais com a sua pode ser a mais parecida"+
                    "\n1- Explosivo\n"+
                    "2- Calmo\n"+
                    "3- Lento\n"+
                    "4- Agitado");
    quiz = sc.nextInt();

    switch(quiz){
      case 1:
        especialidade = especialidade + 1;
        break;
      case 2:
        especialidade = especialidade + 2;
        break;
      case 3:
        especialidade = especialidade + 3;
        break;
      case 4:
        especialidade = especialidade + 4;
        break;
    }
  System.out.println("\nE por fim, estas são as especialidades que temos nesse mundo, qual delas você acha que conquistou?"+
                    "\n1- O poder explosivo do FOGO\n"+
                    "2- A fluidez da AGUA\n"+
                    "3- A lentidão do GELO\n"+
                    "4- A velocidade e paralisia do RAIO");
    quiz = sc.nextInt();

    switch(quiz){
      case 1:
        especialidade = especialidade + 1;
        break;
      case 2:
        especialidade = especialidade + 2;
        break;
      case 3:
        especialidade = especialidade + 3;
        break;
      case 4:
        especialidade = especialidade + 4;
        break;
    }
    
    if(especialidade >= 4 && especialidade < 8){
      System.out.println("\nParabens, você adquiriu o calor do fogo\n");
      fogo();
      
    }else if(especialidade >=9 && especialidade <12){
      System.out.println("\nParabens, voce adquiriu a fluidez da agua\n");
      
    }else if(especialidade >=13 && especialidade <14){
      System.out.println("\nParabens, voce adquiriu a calma do gelo\n");
      
    }else if(especialidade >=15 && especialidade <17){
      System.out.println("\nParabens, voce adquiriu a velocidade raio\n");
    }


  }  
   static void fogo(){
     System.out.println("Agora como o PAI do fogo, você causa mais dano aos inimigos");
     


    
   }




    
}

  