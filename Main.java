import java.util.Scanner;
import java.util.Random;

class Main {

  // Imports Globais
  static Scanner sc = new Scanner(System.in);
  static Random rand = new Random();

  static int vidaProt = 100;
  static int danoElemento;
  static int atk = 10;
  static int atkSpc = 20;
  static String nome;
  static String elemento;
  static String inimigo;
  static int ataqueEscolhido;
  

  public static void main(String[] args) {
  Menu();
}
  static void Menu() { 
  int menu;
 //Criando a Tela do menu
  System.out.println(" __  __   \n" +               
 "|  \\/  | ___ _ __  _   _ \n" +
 "| |\\/| |/ _ \\ '_ \\| | | |\n" +
 "| |  | |  __/ | | | |_| |\n" +
 "|_|  |_|\\___|_| |_|\\__,_|\n" +
                     "\n1- Introdução\n"+
                       "2- Jogar\n"+
                       "3- Créditos\n"+
                       "4- Sair");
  menu = sc.nextInt();
     
switch(menu){
  case 1:
    System.out.println("\nRyodan é um mundo mágico de RPG onde você pode montar o seu herói de acordo com as suas características e se aventurar nesse novo mundo.\n"+
      "\nComo Jogar:\n"+
"Para jogar é necessário responder um quiz de 4 perguntas, onde em cada uma delas você tem 4 opções de respostas, de acordo com elas será definida a especialidade do seu herói para enfrentar as batalhas dessa jornada. Agora que você sabe como jogar é só se aventurar!!.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    break;
  case 2:
    Quiz();
    break;
  case 3:
    System.out.println("\nJoguinho feito por Breno, Camila e Michael.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    break;
  case 4:
    System.out.println("\nObrigado por ter jogado.");
    System.exit(0);
    break;
  default:
    System.out.println("\nOpção invalida.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    Menu();
    }
  }
//Definindo a classe do jogador 
  static void Quiz() {

  int quiz;
  int especialidade = 0;


  System.out.println(" ____                  __     ___           _       _\n" +
 "| __ )  ___ _ __ ___   \\ \\   / (_)_ __   __| | ___ | |\n"+
 "|  _ \\ / _ \\ '_ ` _ \\   \\ \\ / /| | '_ \\ / _` |/ _ \\| |\n"+
 "| |_) |  __/ | | | | |   \\ V / | | | | | (_| | (_) |_|\n"+
 "|____/ \\___|_| |_| |_|    \\_/  |_|_| |_|\\__,_|\\___/(_)");

  System.out.println("\nVocê chegou em Genei");
  System.out.println("\nInsira seu nome nesse novo mundo:");
  nome = sc.next();
  System.out.println("\nDesejo sorte em sua nova aventura:\n" + nome);
  System.out.println("\nHora de escolher sua especialidade, para isso serão feitas algumas perguntas:");

  System.out.println("\nPara começarmos, qual estação você prefere?"+
                    "\n1- Verão\n"+
                    "2- Inverno\n"+
                    "3- Outono\n"+
                    "4- Primavera\n"+
                    "Sua escolha: ");
    
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
                    "4- Amarelo\n"+
                    "Sua escolha: ");
    
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
                    "4- Agitado\n"+
                    "Sua escolha: ");
    
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
  System.out.println("\nE por fim, estas são as especialidades que existem nesse mundo, qual delas você acha que conquistou?"+
                    "\n1- O poder explosivo do FOGO\n"+
                    "2- A fluidez da AGUA\n"+
                    "3- A lentidão do GELO\n"+
                    "4- A velocidade e paralisia do RAIO\n"+
                    "Sua escolha: ");
    
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
    
    if(especialidade >= 4 && especialidade <= 8){
      System.out.println("\nParabens, você adquiriu o calor do fogo!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "fogo";
      danoElemento = 5;
      historia();
               
    }else if(especialidade >=9 && especialidade <12){
      System.out.println("\nParabéns, voce adquiriu a fluidez da água!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "água";
      danoElemento = 3;
      historia();
               
    }else if(especialidade >=13 && especialidade <14){
      System.out.println("\nParabens, voce adquiriu a calma do gelo!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "gelo";
      danoElemento = 3;
      historia();     
            
    }else if(especialidade >=14 && especialidade <17){
      System.out.println("\nParabéns, voce adquiriu a velocidade raio!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "raio";
      danoElemento = 4;
      historia();
          
    }

  }  
   static void historia(){
     System.out.println("\nAgora como o dominador de "+ elemento +" você desbrava as terras de Takoyaki...\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     
     System.out.println("\nComo novo aventureiro, terá varios inimigos em seu caminho! Se prepare " + nome + ", uma vida cheia de desafios espera você....\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     batalha1();

       System.out.println("\n------------");
       System.out.println("-Vida "+ nome +": " + vidaProt);
       System.out.println("-Elemento dominado: " + elemento);
       System.out.println("------------");
     
       System.out.println("\nParábens! Você superou o seu primeiro desafio e poderá seguir seu rumo pela perigosa floresta em direção a suposta cidade.... Espere, que barulho é esse que você ouviu descendo a colina.... O que fará?\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    sc.nextLine();
     
     int colina = 0;
     System.out.println("\nDescer a colina? (1) Sim (2) Não");

     switch(colina){
       case 1:
         batalha2v2();
       case 2:
         batalha2v1();     
     }

     System.out.println("Que luta mais intensa, não? Vamos esperar que nada pior que isso apareça (rs)\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     batalhaBoss();
         
     System.out.println("INCRIVEL, essa batalha foi simplesmente INCRIVEL, meus parabens aventureiro, sua primeira aventura finalmente chega ao fim, vá descansar na cidade, seu esforço será reconhecido. Nos vemos em breve, Adeus!\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
  
  
   }
 static void batalha1(){

   //Declarando caracteristicas do inimigo
   int vidaGlobin =100;
   int ataqueGlobin =10;
   int ataqueEspGlobin =20;
   String inimigo = "Goblin";

    System.out.println("\nVocê acorda na floresta e consegue ouvir ruidos distantes, aparenta ser uma cidade um tanto quanto movimentada.\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
    System.out.println("\nA caminho dela você se depara com um goblin pronto para acabar com seu dia ou até mesmo com sua vida!\nPRESSIONE [ENTER] PARA CONTINUAR");  
  sc.nextLine();
      //primeira batalha ficara aqui, drop de arma incluso//
  System.out.println(" _    _   _ _____ _____ __  __ _\n"+
 "| |  | | | |_   _| ____|  \\/  | |\n"+
 "| |  | | | | | | |  _| | |\\/| | |\n"+
 "| |__| |_| | | | | |___| |  | |_|\n"+
 "|_____\\___/  |_| |_____|_|  |_(_)\n");
  System.out.println("------------");
  System.out.println("-Vida "+ nome +": " + vidaProt);
  System.out.println("-Elemento dominado: " + elemento);
  System.out.println("------------");
   do{   
   int numeroInteiroAleatorio = rand.nextInt(0,2);
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaGlobin);

                       //Primeiros ataques do Úsuario
    System.out.println("Escolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaGlobin=vidaGlobin-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaGlobin=vidaGlobin-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       System.out.println("Goblin atacou voce: " + ataqueGlobin + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueGlobin;
     }else if(numeroInteiroAleatorio == 1){
       System.out.println("Goblin atacou voce com um especial: " + ataqueEspGlobin + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspGlobin;
     }
   }while(vidaProt>0 && vidaGlobin>0);
  if (vidaProt<1){
  derrota();
   }
 }
static void batalha2v1(){
  // opçao de seguir o caminho
     System.out.println("\nApós ignorar o barulho, você segue em frente na sua jornada porém, um lobo gigante está a sua espera, prepare-se, sua 2° batalha terá inicio AGORA!!!!!");
     //inicio segunda batalha, drop de colecionavel//
}
static void batalha2v2(){
  //opçao de descer a colina//
     System.out.println("\nAo escorregar pelos cascalhos você se depara com um rio deveras fundo com fortes correntezas e por ironia do destino, o tal barulho estava sendo causado por um macaco ligeiro e esperto chamado JAPARDO, prepare-se, sua 2° batalha terá inicio AGORA!!!!!");
     //inicio segunda batalha, drop de colecionavel//
}
static void batalhaBoss(){
  System.out.println("\nPor fim seu caminho em direção a cidade está livre, pelo menos é o que parece... **BOOM** **BOOM** **BOOM** o quê é isso? Dessa vez nem foi necessario confiar na audiçao, seu proximo inimigo é tao grande que você pode ve-lo ao horizonte, o maior troll de que você ja ouviu falar vem em sua direção... Meu caro companheiro, tome cuidado pois esta será sua maior batalha. AVANTE!!!");
     //Batalha contra o boss, a fama será a recompensa//
}
static void derrota(){
  System.out.println("\nFoi de berço!\nPRESSIONE [ENTER] PARA VOLTAR AO COMEÇO DA JORNADA.");
  sc.nextLine();
  sc.nextLine();
  historia();
}
}
  