import java.util.*;

public class mainTest2 {

  public static String[] corpoPersonagem = new String[8];
  public static String nomeHeroi;
  public static int respect = 15;
  public static int knowledge = 0;

  
  static void equipAlinca(){
    String equipamentoAlianca[] = { "Elmo-Ventobraviano", "Peitoral-Ventobraviano", "Mão Esquerda ", "Mão Direita",
            "Constas", "Cintura", "Perneiras-Ventobravo", "Botas-Ventobravianas" };
        for (int i = 0; i < equipamentoAlianca.length; i++) {
          corpoPersonagem[i] = equipamentoAlianca[i];
        }
  }
  static void equipHorda(){
    String equipamentoHorda[] = { "Cabeça", "Peitoral do Sentinela", "Mão Esquerda ", "Mão Direita", "Constas",
            "Cintura", "Perneiras do Sentinela", "Botas do Sentinela" };
        for (int i = 0; i < equipamentoHorda.length; i++) {
          corpoPersonagem[i] = equipamentoHorda[i];
        }
  }
  public static void main(String[] args) {
       

    Scanner ler = new Scanner(System.in);
    int start, escolha;

    System.out.println( "Seja bem-vindo a uma pequena experiência em uma fantastica narrativa dentro no universo de Warcraft (A Queda de Ventobravo)");
    System.out.println("(1) - Começar (2) - Sair");
    System.out.print("Escolha uma Opção: ");
    start = ler.nextInt();

    if (start == 1) {

      Inicio();
      escolha = escolhaPersonagem();
    
      
      if (escolha == 1) {// Atribui os equipamentos da Aliança, Linha de historia da Aliança
        escolha = 0;
        equipAlinca();
        escolha = historiaAliança01();
        if(escolha == 1){//Historia Karazan
       

        }else{ //Hitoria Queda de Vento-Bravo

        }


      }else{// Atribui os equipamentos da Horda, Linha de historia da Horda
        escolha = 0;
        equipHorda();
        escolha = historiaHorda01();
        if(escolha == 1){//Historia Missão Especial

        }else{ //Hitoria Queda de Vento-Bravo

        }
      }

    }

    System.out.println("Obrigado por jogar :)\nFelipe Oliveira\nGuilherme Correia");

  }

  static void Inicio() { // Inicio da Historia
    Scanner er = new Scanner(System.in);
    String vazio;
      int respeito = 15;

    // Introdução de entrada da Historia.
    System.out.println(
        "Enquanto Kil'jaeden preparava a Horda para a invasão de Azeroth, Medivh continuava a lutar por sua alma contra Sargeras. O rei Llane, o nobre monarca de Ventobravo, ficou cauteloso com a escuridão que parecia manchar o espírito de seu ex amigo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "O rei Llane compartilhou suas preocupações com Anduin Lothar, o último descendente da linhagem Arathi, a quem ele nomeou seu tenente de armas. Mesmo assim, nenhum homem poderia imaginar que a lenta descida de Medivh à loucura provocaria os horrores que estavam por vir.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Como um incentivo final, Sargeras prometeu conceder grande poder a Gul'dan se ele concordasse em liderar a Horda para Azeroth. Através de Medivh, Sargeras disse ao bruxo que ele poderia se tornar um deus vivo se ele encontrasse a tumba submarina onde o Guardiã Aegwynn havia colocado o corpo aleijado de Sargeras quase mil anos antes.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Gul'dan concordou e decidiu que uma vez que os habitantes de Azeroth fossem espancados, ele encontraria a lendária tumba e reivindicaria sua recompensa. Assegurando que a Horda serviria a seus propósitos, Sargeras ordenou que a invasão começasse.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Este portal fazia a ponte entre Azeroth e Draenor, e era grande o suficiente para que exércitos passassem por ele. Gul'dan despachou orcs pelo portal para inspecionar as terras que eles conquistariam. Os batedores de retorno asseguraram ao Conselonselho das Sombras que o mundo de Azeroth estava maduro para a tomada.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Ainda convencido de que a corrupção de Gul'dan iria destruir o seu povo, Durotan falou contra os warlocks mais uma vez. O bravo guerreiro alegou que os bruxos estavam destruindo a pureza do espírito dos orcs e que essa invasão imprudente seria o destino deles. Gul'dan, incapaz de se arriscar a matar um herói tão popular, foi forçado a exilar Durotan e seu Frostwolf Clan nos confins deste novo mundo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois que os Frostwolves exilados invadiram o portal, apenas alguns clãs orcs seguiram. Esses orcs rapidamente montaram uma base de operações dentro do Black Morass, uma área escura e pantanosa distante ao leste do reino de Stormwind. Quando os orcs começaram a se ramificar e explorar as novas terras, eles entraram em conflito imediato com os defensores humanos de Ventobravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Embora essas escaramuças terminassem rapidamente, eles fizeram muito para ilustrar as fraquezas e forças de ambas as espécies rivais. Llane e Lothar nunca foram capazes de coletar dados precisos dos números dos orcs e só podiam adivinhar a força que teriam que enfrentar.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois de alguns anos, a maioria da Horda dos orcs havia entrado em Azeroth, e Gul'dan considerou que chegara a hora do primeiro ataque contra a humanidade. A Horda lançou toda a sua força contra o reino desavisado de Ventobravo. ");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

  }

  static int escolhaPersonagem() {// Escolha o lado da batalha
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    String  vazio;
    int escolha;

    System.out.println("Escolha o seu lado da batalha");
    System.out.println(
        "Aliança: VocÊ vai ser um jovem soldado humano e vai defender a cidade das forças poderoça que marcham en direção a Vento Bravo");
    System.out.println(
        "Horda: Você vai assumir um Orc conrrompido pelo Sangue Vil do Clã Lobos de Gelo e ajudara a nova Horda a conquistar com o sangeu e furia o seu novo lar ");
    // mostrar imagem dos modelos
    System.out.println("(1) - Alinça (2) - Horda");
    System.out.print("Faça a sua escolha: ");
    escolha = sc.nextInt();

    if (escolha == 1) {// Escolheu Aliança
      System.out.println("VOCÊ ESCOLHEU ALIANÇA");
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo, " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 1;
    } else {// Escolheu Horda
      System.out.println("VOCÊ ESCOLHEU HORDA");
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();
      
      return 2;
    }
  }

  static void mostrarEquipamentos() { // Mostra os equipamentos do personagem

    int i;

    for (i = 0; i < corpoPersonagem.length; i++) {
      System.out.print(corpoPersonagem[i] + " ");

    }
  }

  static void mostrarMapa() {// Mostrar Mapa

  }

  static int historiaAliança01() {//Historia introdução Aliança Etapa 1
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    // Introdução de entrada da Historia.
    System.out.println("Quando as forças de Azeroth e da Horda se enfrentaram no reino, os conflitos internos começaram a pesar nos dois exércitos. O rei Llane, que acreditava que os orcs bestiais eram incapazes de conquistar Azeroth, detestava sua posição em sua capital, Ventobravo. No entanto, Sir Lothar convenceu-se de que a batalha deveria ser levada diretamente ao inimigo, e ele foi forçado a escolher entre suas convicções e sua lealdade ao rei.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(nomeHeroi +" é um renomado Sargento e um fiel subordinado do 1 tenente Vladimir do 25 batalhão de infantaria");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Vocês dois se encontram na sala de guerra dentro da bastilha de Vento Bravo, onde se encontra o Rei Llane  e seu comandantes.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Entre eles o Sir.Lothar um dos maiores comandante da Aliança e o único que havia enfrentado a nova ameça e saiu vivo para contar a historia. E o Arch Mago Haddigar, um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    
    int numeroAleatorio = (int) (Math.random() * 10);
    
    if(numeroAleatorio>8){
      System.out.println("Você nota que há um livro jogado no chão \nDeseja ler o livro? \n Sim - 1 \n Não - 2");
    escolha = re.nextInt();
      if(escolha==1){
        System.out.println("VOcê acha um livro chamado Chuvas de Castamere que conta uma história fictícia");
        System.out.println("As Chuvas de Castamere é uma canção, que descreve a esmagadora vitória de Lorde Tywin Lannister sobre a rebelde Casa Reyne de Castamere, e a destruição da Casa no final de sua rebelião. A canção é, normalmente, cantada como uma lembrança do destino que espera aqueles que enfrentam Tywin Lannister, ou qualquer Lannister de Rochedo Casterly.");
        System.out.println("E quem é você, disse o altivo senhor,\npra que a vênia seja profunda?\nSó um gato com um manto diferente,\nessa é a verdade fecunda.\nNum manto de ouro ou num manto vermelho,\nsuas garras um leão mantém,\ne as minhas são longas e afiadas, senhor,\ncomo o senhor as tem também.\nE assim falou, e assim falou,\no senhor de Castamere,\nmas agora a chuva chora no seu salão,\ne ninguém está lá para a ver.\nSim, agora a chuva chora no seu salão,\ne ninguém está lá para a ver.");
      }
    }

    System.out.println("Depois de ver tantas notícias ruins de batalhões caindo, vilas queimadas e assassinados.\nVladimir vai em sua direção ao notar sua expressão e direciona a palavra a você.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Vladimir - Com medo "+nomeHeroi+"?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - não");
    escolha = re.nextInt();
    
    if(escolha == 1){
      System.out.println("Sim. Mas isso me faz pensar melhor pelo que está por vir !");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      escolha = 0;
      respect++;
    }else{
    
      respect--;
        System.out.println("Vladimr olha para você com o olhar sério ao notar uma possivel falta de sinceridade e fala\n -Pois deveria. Não sabemos como nosso inimigo luta, eles estão conquistando província após província. Logo logo estarão aqui...");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      escolha = 0;
    }
    
    System.out.println("Em Seguida entra um soldado correndo levando em sua mão uma mensagem sobre o forte Mirante de Pedra em Montanhas Cristarrubra e entrega o pergaminho ao Capital de Portões Leonidas.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    
    System.out.println("Você quer escutar Leonidas lendo o relatório ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if(escolha == 1){
      System.out.println("Você se levanta e se aproxima da mesa de guerra");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      knowledge++;

      System.out.println("Leônidas lê para todos proximos a mesa:");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Relátorio:");
      System.out.println("As forças da Horda atacaram as terras de Montanhas Cristarrubra, queimando a Vila Placida e raptando os seus moradores. As torres de magos de Ilgalar  estão  em chamas, estão utilizando o Mirante de Pedra como forte sem nenhuma noticias de sobreviventes, e o suposto comandante Blackhand está morto, os Clãs de Orcs estão seguindo um novo Orc chamado Orgrim Doomhammer considerado o novo Warchief e marcham em direção a Vento Bravo com Armas de cerco.\nPS: Os líderes Gul'dan e Durotan e seu clã não foram localizados.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Haddgar fala\n-As minhas fontes afirmam que através de um esforço conjunto, Medivh e os Warlocks do conselho das Sombras abriram o portal dimensional.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      
      System.out.println("-Rei Llane argumenta\n-Hadgar Lothar, recrute mais alguém para ir a Karazan deter Mediv!-");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      escolha = 0;
      System.out.println("Você quer escutar Leonidas lendo o relatório ?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - Não");
      escolha = re.nextInt();

      if(escolha == 1){
          knowledge++;
        System.out.println("-Senhor! \n-Vladimir direcinona a fala a Lothar");
        System.out.println("-Posso indicar um dos meus melhores homems. Habilidoso com espada e arco. "+nomeHeroi+"! Ele podera ser de grande ajuda!-");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();
        numeroAleatorio = (int) (Math.random() * 10);
        if (numeroAleatorio<=5){
          System.out.println("Vladimir não confia na sua habilidade");
          respect--;
        }
        else{
          System.out.println("Vladimir confia nas suas habilidades");
        respect++;
        }

        System.out.println("Lothar direciona as palavras a você");
        System.out.println("-"+nomeHeroi+"! Se prepare! Não vai ser nada facil...-");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        corpoPersonagem[2] = "Espada de Duas Mão";
        corpoPersonagem[3] = "Espada de Duas Mão";
        corpoPersonagem[4] = "Arco Longo";

        return 1; //Chama Main Quest historiaPrincipaKazarah(); 
      }

    }

    System.out.println("(Todos na sala escutam as trombetas na cidade)\n (Rei Llane dá a Ordem)\n-TODOS NA SUA POSIÇÃO! PELA ALIANÇA!!!-");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    return 2; //Chama Main Quest historiaQuedaDeVentoBravo();


    
  }

  static int historiaHorda01() {//Historia introdução Horda Etapa 1
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;
    
    System.out.println("Depois de conquistarem terras após terras, a horda desce em direção ao Sul.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você conseguiu escapar da traição do Conselho das Sombras após ver seu lider Durotan e sua mulher Greta serem assassinados pelo clã da Lua Negra, comandados por Gul’Dan...");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você e seus amigos: Sion, Yorick e a meia Orc Garona, fogem em direção ao Sul para se encontrar com os outros Clãs Orc para informar o acontecimento.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Voces chegam em uma região de campinas onde tem grandes campos de plantio mas com rastros de destruição...");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Ao leste, uma grande fumaça preta cobre o ceú. \nVocês resolvem verificar oque está acontecendo...");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("(Alguns minutos de caminhada)");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Ao meio dia vocês passam ao lado de torres em chamas, logo mais acima da montanha, conseguem ver a bandeira da Horda tribulando em cima de um castelo de pedra");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Em seu portão conseguem ver BlackHand segurando um jovem soldado humano pelo pescoço e a outra sua Garra Longa atravessando a sua barriga.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    int numeroAleatorio = (int) (Math.random() * 10);
    if(numeroAleatorio>5){
      System.out.print("Você acabou demonstrando empatia pelo humano...");
    respect--;
    }
    else{
      System.out.print("Você não demonstra empatia pelo humano...");
      respect++;
    }

    System.out.println("Ao se aproximarem, Ogrim fica feliz que o clã de seu melhor amigo veio se juntar a eles\n Mas logo percebe o pior apenas vendo vocês três\nBlackHand direciona um olhar de satisfeito e com um sorriso sarcastico.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você sabe que Ogrim DoonHammer é o melhor amigo de Durotan");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você quer passar as noticias para Ogrim ou BlackHand ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - BlackHand (2) - Ogrim");
    escolha = re.nextInt();

    if(escolha == 1){//Fala com o BlackHand
      System.out.println("Warchief BlackHand tivemos uma traição entre nos.\nFomos atacado pelo clã Lua Negra a uma noite Durotan e Greta foram mortos!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      
      System.out.println("BlackHand olha com um olhar de satisfeitos e diz!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("E a Criança ?");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Acredito que tambem está morta !");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Os fracos nunca terão vez no novo mundo");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Você fica assuntado com a resposta\nMas não pode fazer nada por que você é apenas um Soldado");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      escolha = 0;
    }else{

      escolha =0;
      System.out.println("Você quer passar as noticia  para Ogrim?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - Não");
      escolha = re.nextInt();

      if(escolha == 1){
        System.out.println("Ogrim! Ogrim DoonHammer! fomos traido o Clã Lua Negra nos atacou durante a noite não tivemos chance de nos defender\n Durotan e Greta estão mortos");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Isso não é possível\n Durotan, Greta meu amigo!,");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("E o filho deles ?");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Não Sabemos!");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Ogrim direciona o olhar com muita raiva para BlacHand");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        
      }else{
        System.out.println("Garona olha para com olhar de raiva e diz");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Quem é o Traidor ?!");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }
    }
    System.out.println("Ao anoitecer, Você se encontra sentado em um corredor de pedra dentro da fortaleza recém-conquistada perto de uma das salas que os lideres dos clãs estão discutindo os próximos passos.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    
    System.out.println("Ao seu lado, você vê o seu amigo Sion, ele aparenta estar pensativo, um Orc nunca demonstra sentimentos aos seus aliados pois pode desmotiva-los, mas todo o clã estava atordoado...");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você quer fala com Sion?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if(escolha == 1){
      System.out.println("Você vira para Sion e fala:");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Oque você acha que vai acontecer com o nosso clã logo que o nosso lider esta morto?");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
     
      System.out.println("(Sion nota sua preocupação com o clã...)");
      vazio = er.nextLine();
      System.out.println();
      
      respect++;
      
      System.out.println("Sion -Eu...");
      vazio = er.nextLine();
      System.out.println();
      
      System.out.println("Antes mesmo de Sion começar a falar, você olha para o lado...");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      escolha = 0;

      
    }
    System.out.println("Você vê Ogrim e Garona em passos rapidos em direção a porta onde estão os lideres dos Clãs Orcs");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Ogrim entra na porta com e chama BlackHand para um Mak’Gora (um ritual de duelo para revindicar alguma a liderança da horda) com a intenção de vingar a morte do seu amigo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Ambos vão para o pátio da fortaleza onde Ogrim derrota BlackHand, o boneco de Gul’Dan, e assume a liderança da horda.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Ogrim, após a vitória, se levanta com a feição de cansaço olhando para todos no pátio e grita.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    
    System.out.println("-VAMOS ACABAR COM ESSA GUERRA DE UMA VEZ POR TODAS! Octa’Rogar!!!!!!!!!!!!-");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Na manha seguinte, todos os clãs marcham para Oeste, em direção a umas das maiores cidade dos humanos, Conhecida como Vento-Bravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Em marcha, você escuta a voz de Garona \n-Hey! "+nomeHeroi+"!");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Fui designada a uma missão especial");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("(Você olha para Garona com um olhar reprido)");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Eu já fui capturada por eles e sei algumas passagens que cortam a cidade, gostaria que você fosse comigo.-");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Você quer ir com a Garona?");
    System.out.println("Qual a sua Resposta?");
    System.out.print("(1) - Sim (2) - Não");
    escolha = re.nextInt();

    if(escolha == 1){
        respect++;
      System.out.println("(Garona fica feliz com a sua escolha)");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Eu sabia que você não recusaria!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      corpoPersonagem[2] = "Adaga-Envenenada";
      corpoPersonagem[3] = "Adaga-Envenenada";

      return 1;

    }else{
        respect--;
      System.out.println("Garona fica com o olhar de pesado\n Tudo bem ! ");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("Eu entendo !");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("VocÊ continua com a marcha após responder Garona");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("-Vou honrar os ultimos membros do meu clã em batalha.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("Octa’Rogar!- Grita Garona");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    return 2;

  }
 
  static void historiaQuedaDeVentoBravo(){

  }
 
  static void historiaPrincipaKarazan(){

  }
}
