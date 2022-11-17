import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;
  
class Main {

   // Imports Globais
   static Scanner sc = new Scanner(System.in);
   static Random rand = new Random();

   static int danoElemento;
   static String nome;
   static String elemento;
   static String inimigo;
   static int ataqueEscolhido;
   static int idFase = 0;
  

   public static void main(String[] args) throws InterruptedException{
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
      danoElemento = 5;
      historia();
               
    }else if(especialidade >=13 && especialidade <14){
      System.out.println("\nParabens, voce adquiriu a calma do gelo!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "gelo";
      danoElemento = 5;
      historia();     
            
    }else if(especialidade >=14 && especialidade <17){
      System.out.println("\nParabéns, voce adquiriu a velocidade raio!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
      sc.nextLine();
      
      elemento = "raio";
      danoElemento = 5;
      historia();
          
    }

  }  
  
   static void historia(){
     System.out.println("\n*Agora como o dominador de "+ elemento +" você desbrava as terras de Takoyaki...\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     System.out.println("\n*Como novo aventureiro, terá varios inimigos em seu caminho! Se prepare " + nome + ", uma vida cheia de desafios espera você....\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     batalha1();

     System.out.println("\n*Que luta mais intensa, não? Vamos esperar que nada pior que isso apareça (rs)\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
     batalhaBoss();

     batalha4();
     batalha5();
     batalhaBossFinal();
  
  
   }
  
   static void batalha1(){
    idFase++;
   int vidaProt = 100;
   int atk = 10;
   int atkSpc = 20;

   //Declarando caracteristicas do inimigo
   int vidaGlobin =50;
   int ataqueGlobin =5;
   int ataqueEspGlobin =10;
   String inimigo = "Goblin";

    System.out.println("\n*Você acorda na floresta e consegue ouvir ruidos distantes, aparenta ser uma cidade um tanto quanto movimentada.\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
    System.out.println("\n*A caminho dela você se depara com um goblin pronto para acabar com seu dia ou até mesmo com sua vida!\nPRESSIONE [ENTER] PARA CONTINUAR");  
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaGlobin);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
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
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Goblin atacou voce: " + ataqueGlobin + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueGlobin;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Goblin atacou voce com um especial: " + ataqueEspGlobin + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspGlobin;
     }
   }while(vidaProt>0 && vidaGlobin>0);
     
  if (vidaProt<1){
  derrota();
   }else
    colina();
 }
  
   static void batalha2v1(){
  idFase++;
     int vidaProt = 100;
     int atk = 10;
     int atkSpc = 20;

   //Declarando caracteristicas do inimigo
   int vidaLobo =70;
   int ataqueLobo =7;
   int ataqueEspLobo =10;
   String inimigo = "Lobo";
     
  // opçao de seguir o caminho
     System.out.println("\nApós ignorar o barulho, você segue em frente na sua jornada porém, um lobo gigante está a sua espera, prepare-se, sua 2° batalha terá inicio AGORA!!!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
     sc.nextLine();
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaLobo);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaLobo=vidaLobo-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaLobo=vidaLobo-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Lobo atacou voce: " + ataqueLobo + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueLobo;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Lobo atacou voce com um especial: " + ataqueEspLobo + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspLobo;
     }
   }while(vidaProt>0 && vidaLobo>0);
     
  if (vidaProt<1){
  derrota();
   }
}
  
   static void batalha2v2(){
  idFase++;

     int vidaProt = 100;
     int atk = 10;
     int atkSpc = 20;

   //Declarando caracteristicas do inimigo
   int vidaMacaco =70;
   int ataqueMacaco =7;
   int ataqueEspMacaco =14;
   String inimigo = "Macaco";
     
  //opçao de descer a colina//
     System.out.println("\nAo escorregar pelos cascalhos você se depara com um rio deveras fundo com fortes correntezas e por ironia do destino, o tal barulho estava sendo causado por um macaco ligeiro e esperto chamado JAPARDO, prepare-se, sua 2° batalha terá inicio AGORA!!!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
     sc.nextLine();
     
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaMacaco);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaMacaco=vidaMacaco-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaMacaco=vidaMacaco-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Macaco atacou voce: " + ataqueMacaco + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueMacaco;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Macaco atacou voce com um especial: " + ataqueEspMacaco + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspMacaco;
     }
   }while(vidaProt>0 && vidaMacaco>0);
     
  if (vidaProt<1){
  derrota();
   }
     
}
  
   static void batalhaBoss(){
  idFase++;
     int vidaProt = 100;
     int atk = 10;
     int atkSpc = 20;

   //Declarando caracteristicas do inimigo
   int vidaTroll =90;
   int ataqueTroll =9;
   int ataqueEspTroll =18;
   String inimigo = "Troll";
     
  System.out.println("\nPor fim seu caminho em direção a cidade está livre, pelo menos é o que parece... **BOOM** **BOOM** **BOOM** o quê é isso? Dessa vez nem foi necessario confiar na audiçao, seu proximo inimigo é tao grande que você pode ve-lo ao horizonte, o maior troll de que você ja ouviu falar vem em sua direção... Meu caro companheiro, tome cuidado pois esta será sua maior batalha. AVANTE!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
     sc.nextLine();

     //Batalha contra o boss, a fama será a recompensa//
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaTroll);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaTroll=vidaTroll-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaTroll=vidaTroll-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Troll atacou voce: " + ataqueTroll + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueTroll;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Troll atacou voce com um especial: " + ataqueEspTroll + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspTroll;
     }
   }while(vidaProt>0 && vidaTroll>0);
     
  if (vidaProt<1){
  derrota();
   }
     System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-\n"+
                        "\n*Depois dessa luta, você parece mais forte!Parabéns, aparentemente você subiu de nivel e todos seus status dobraram\n"+
                        "\n-_-_-_-_-_-_-_-_-_-_-_-_-_-"+
                        "\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();  
}

   static void batalha4(){
    int vidaProt = 200;
    int atk = 20;
    int atkSpc = 40;

   //Declarando caracteristicas do inimigo
   int vidaSoldado = 110;
   int ataqueSoldado = 15;
   int ataqueEspSoldado = 30;
   String inimigo = "Soldado";
   int resposta;
   int cont = 5;
   idFase++;
    //chegando na cidade
     System.out.println("\n*INCRIVEL, essa batalha foi simplesmente INCRIVEL, meus parabens aventureiro, sua primeira aventura finalmente chega ao fim, vá descansar na cidade, seu esforço será reconhecido!\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
  
  System.out.println("\n*Agora que nada está entre você e a cidade, poderá enfim avançar sem problemas...\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
  
  System.out.println("\n*Pois é meu amigo, você não tem um segundo de paz nessa sua vida, o portão para acessar a cidade está bloqueado e a menos que você tenha um passe(adianto que você não tem afinal você acaba de aparecer nesse mundo) será necessario resolver esse simples enigma para poder avançar...\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();

   System.out.println("\n°Bem-vindo viajante, para passar por está porta é preciso apenas uma simples questão. CUIDADO, APÓS ZERADAS AS TENTATIVAS, SISTEMA DE DEFESA SERÁ ATIVADO!"+
    "\n Você tem 3 tentativas\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
   System.out.println("\nQual a resposta de tudo? (Dica: é um numero)");
  
  do{
    System.out.println("\nQual a resposta de tudo? Chances disponiveis: " + cont);
  resposta = sc.nextInt();
    
    if(resposta < 42 && cont > 0){
     System.out.println("Resposta Incorreta, o numero correto é maior");
      cont--;     
    }else if(resposta >42 && cont > 0){
      System.out.println("Resposta Incorreta, o numero correto é menor");
      cont--;    
    }else if(resposta == 42 && cont > 0){
      System.out.println("Resposta correta. Acesso liberado\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
      
    }else{
      System.out.println("Defesas ativadas!3...2..1");
      derrota();
    }
  }while(cont > 0 && resposta != 42); 

  System.out.println("\n*Pronto, agora que chegamos na cidade, vamos explorar um pouco!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
  System.out.println("\n*Sério, toma um banho de sal grosso, ali na frente tem uma pessoa machucada sendo seguida pelo exercito.\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
  
  System.out.println("\n-Vocês nunca me pegarão viva, os aventureiros não serão derrotados por esse exercito fajuto!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();

  System.out.println("\n*É chefe, pelo jeito temos um problema, se você ajudar a garota, automaticamente será um inimigo do exercito, porém se não fizer nada o exercito não tem porque mexer com você afinal eles não sabem que é um aventureiro. O que fará?\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();
     
  System.out.println("\n-Por favor me ajude, ele são apenas 3, derrote 1 e eu derrotarei o outro, o terceiro provavelmente fugirá!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
  sc.nextLine();

  System.out.println("Ajudar a garota? (1) SIM (2) NÃO");
     int ajuda = sc.nextInt();

     switch(ajuda){
       case 1:
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaSoldado);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaSoldado=vidaSoldado-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaSoldado=vidaSoldado-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Soldado atacou voce: " + ataqueSoldado + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueSoldado;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Soldado atacou voce com um especial: " + ataqueEspSoldado + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspSoldado;
     }
   }while(vidaProt>0 && vidaSoldado>0);
     
    if (vidaProt<1){
      derrota();
   }
    break;
       case 2:
  System.out.println("\n-Obrigado jovem, ela estava nos dando muitos problemas....");
  sc.nextLine();
  System.out.println("\n-E agora você irá encontra-la do outro lado, achou mesmo que com essas roupas nós nao fossemos descobrir que também é um aventureiro? Idiota");     
  derrota();  
    break;
  }
}

   static void batalha5(){
    int vidaProt = 200;
    int atk = 25;
    int atkSpc = 45;
     
    int vidaGeneral = 150;
    int ataqueGeneral = 20;
    int ataqueEspGeneral = 40;
    String inimigo = "General";

    idFase++;
    System.out.println("\n-Obrigada pela ajuda lá atras, se não fosse por você eu ainda estaria fugindo, qual seu nome?\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n-Muito prazer " + nome + "\n-Eu me chamo Nishiya, irei pular todo o restante da conversa e partir para o principal pois não nos resta muito tempo.\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n-Agora que sabem que você está comigo, gostaria de lhe pedir ajuda para enfrentarmos o rei, ele está cobrando impostos altos demais dos pobres e permitindo que apenas sua corte tenha um bom padrão de vida, se não lutarmos agora, a cidade irá cair em poucos dias.\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n-Sei que pode parecer demais mas precisamos que você enfrente o general do exercito, ele é nosso maior problema antes de chegar ao castelo, você é o unico que pode derrota-lo. Aqui, pegue esta espada, ela o ajudará\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n*Opa meu caro, sou eu, a voz na sua cabeça novamente, você se enfiou em um problemão hein? Mas agora não é hora de pensar nisso, ande, todos estão esperando por você, o futuro herói dessa cidade!!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n-Chegamos, " + nome + " aquele é seu alvo, vença e avance, logo alcancaremos você.\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    //Inicio batalha 
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaGeneral);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaGeneral=vidaGeneral-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaGeneral=vidaGeneral-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("General atacou voce: " + ataqueGeneral + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueGeneral;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("General atacou voce com um especial: " + ataqueEspGeneral + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspGeneral;
     }
   }while(vidaProt>0 && vidaGeneral>0);
     
    if (vidaProt<1){
      derrota();
   }
     System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-\n"+
                        "\n*Depois dessa luta, você parece mais forte!Parabéns, aparentemente você subiu de nivel e todos seus status aumentaram\n"+
                        "\n-_-_-_-_-_-_-_-_-_-_-_-_-_-"+
                        "\nPRESSIONE [ENTER] PARA CONTINUAR");
  }

   static void batalhaBossFinal(){
    int vidaProt = 220;
    int atk = 30;
    int atkSpc = 50;
     
    int vidaRei = 200;
    int ataqueRei = 25;
    int ataqueEspRei = 50;
    String inimigo = "Rei";
    String resposta = "agua";
    int cont = 4;
    idFase++;
    
    System.out.println("\n*Você ficou bom nessas batalhas, que orgulho, minha criança ta crescendo!!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    System.out.println("\n*MAS, não se anime demais, agora que chegou ao portão do castelo, precisa-rá resolver esse enigma um tanto quanto mais dificil que o anterior para acessar a sala do rei, boa sorte!!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();

    System.out.println("\nSaudações Individuo, me chamo Rock e sou a estatua defensora do castelo. Como nunca o ví imagino que não possua um pedido real para acessar o castelo, lhe farei uma pergunta e terá 3 chances para acertar, caso erre... Será eliminado! Boa sorte!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    
    System.out.println("\nDentro de mim, represento a morte para aqueles que não são aptos a viver em mim, sem mim a morte aguarda a todos sem exceção, porém sem mim não existe vida. O quê sou eu?\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();

    while (sc.hasNextLine() && !sc.nextLine().equalsIgnoreCase(resposta)){
      System.out.println("\nParece que ainda não encontramos a resposta correta. Chances disponiveis " + cont);
      cont--;
      }
    if(cont == 0 ){
    derrota();
  }else{
    System.out.println("Parabéns, resposta correta e sua passagem será liberada!\nPRESSIONE [ENTER] PARA CONTINUAR");
      sc.nextLine();
  }  
    System.out.println("*Espero que esteja preparado, seu maior e mais poderoso inimigo está logo a sua frente, espero que esteja preparado.\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    System.out.println("-Então você ousa me enfrentar? Tolo, eu, o grande Rei Asura não permitirei tamanha afronta para com minha autoridade! Enfrente-me verme, irá sentir o poder dos grandes!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    System.out.println("*Esse ai fala viu, já não basta ser o pior rei de que já ouvi falar, ainda é um charlatão. ACABE COM ELE!!!!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
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
       try{
       Thread.sleep(1600);
       }catch(Exception erro){}
    System.out.println("\nSua vida: " + vidaProt + "\nVida " + inimigo + ": " + vidaRei);

                       //Primeiros ataques do Úsuario
    System.out.println("\n\nEscolha seu ataque"+
                      "\n1- Ataque Normal\n"+
                      "2- Ataque Especial\n"+
                      "3- Desistir da luta\n");
     
   ataqueEscolhido = sc.nextInt();    
   switch(ataqueEscolhido){
     case 1:
       System.out.println("\nÚsuario aplicou um ataque normal: " + atk + " de DANO APLICADO!");
       vidaRei=vidaRei-atk;
     break;
     case 2:
       System.out.println("\nÚsuario aplicou um ataque Especial: " + atkSpc + " de DANO APLICADO!");
       vidaRei=vidaRei-atkSpc;
     break;
     case 3:
       derrota();
       break;
        default:
           break;
         }
     if(numeroInteiroAleatorio == 0){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Rei atacou voce: " + ataqueRei + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueRei;
     }else if(numeroInteiroAleatorio == 1){
       try{
       Thread.sleep(1300);
       }catch(Exception erro){}
       System.out.println("Rei atacou voce com um especial: " + ataqueEspRei + " de DANO SOFRIDO!");
       vidaProt=vidaProt-ataqueEspRei;
     }
   }while(vidaProt>0 && vidaRei>0);
     
    if (vidaProt<1){
      derrota();
   }
    System.out.println("\n-Pelo jeito demoramos demais né? Você acabou derrotando o rei sozinho. Nenhum de nós tem palavras para agradecer o seu esforço. Todos saudém" + nome + "O NOSSO MAIOR HERÓI!!!\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
     
    System.out.println("\n*Sua aventura chega ao fim, meus parabens " + nome + "Você se tornou um herói e concluiu sua aventura de forma excepcional. Volte quando quiser a esse mundo, ele aguarda por você!\nPRESSIONE [ENTER] PARA ENCERRAR");
    sc.nextLine();
    System.exit(0);
  }

   static void colina(){
    System.out.println("\n*Parábens! Você superou o seu primeiro desafio e poderá seguir seu rumo pela perigosa floresta em direção a suposta cidade.... Espere, que barulho é esse que você ouviu descendo a colina.... O que fará?\nPRESSIONE [ENTER] PARA CONTINUAR");
    sc.nextLine();
    sc.nextLine();
    
    int colina;
     System.out.println("\nDescer a colina? (1) Sim (2) Não");
     colina = sc.nextInt();

     switch(colina){
       case 1:
         batalha2v2();
         break;
       case 2:
         batalha2v1();
         break;
     }
    
  }
  
   static void derrota(){
  System.out.println("\nFoi de berço!\nPRESSIONE [ENTER] PARA ABRIR O MENU.");
  sc.nextLine();

  System.out.println("Parece que você foi derrotado, aqui lhe darei a chance de continuar, caso queira."+
   "\n(1) CONTINUAR"+
   "\n(2) RECOMEÇAR JORNADA"+
   "\n(3) Ir para menu inicial");
int md = sc.nextInt();

  switch(md){
    case 1:
      if(idFase == 1){
        batalha1();
        }else if(idFase == 2){
          colina();
        }else if(idFase == 3){
          batalhaBoss();
        }else if(idFase == 4){
          batalha4();
        }else if(idFase == 5){
          batalha5();
        }else if(idFase == 6){
          batalhaBossFinal();
        break;
        }
    case 2:
      historia();
      break;
    case 3:
      Menu();
      break;
    default:
      System.out.println("\nOpção invalida.\nPRESSIONE [ENTER] PARA EXIBIR O MENU NOVAMENTE.");
    sc.nextLine();
    sc.nextLine();
    derrota();
      }
  }
}

  