import java.util.*;
import java.awt.Desktop;
import java.io.File;
import java.net.URL;

public class mainTeste {

  public static String[] corpoPersonagem = new String[8];
  public static String nomeHeroi;
  public static int HP = 100, eHP = 40;
  public static int respect = 8;

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    int start, escolha;

    System.out.println("\n__          ________          __   _____                            _\n"
        + "\\ \\        / / __ \\ \\        / /  / ____|                          (_)            \n"
        + " \\ \\  /\\  / / |  | \\ \\  /\\  / /  | |     __ _ _ __ ___  _ __   __ _ _ _ __   __ _ \n"
        + "  \\ \\/  \\/ /| |  | |\\ \\/  \\/ /   | |    / _` | '_ ` _ \\| '_ \\ / _` | | '_ \\ / _` |\n"
        + "   \\  /\\  / | |__| | \\  /\\  /    | |___| (_| | | | | | | |_) | (_| | | | | | (_| |\n"
        + "    \\/  \\/   \\____/   \\/  \\/      \\_____\\__,_|_| |_| |_| .__/ \\__,_|_|_| |_|\\__, |\n"
        + "                                                       | |                   __/ |\n"
        + "                                                       |_|                  |___/ ");
    System.out.println(
        "Seja bem-vindo a uma pequena experiÃªncia em uma fantastica narrativa dentro no universo de Warcraft (A Queda de Ventobravo)");
    System.out.println("(1) - ComeÃ§ar (2) - Sair");
    System.out.print("Escolha uma OpÃ§Ã£o: ");
    start = ler.nextInt();

    if (start == 1) {

      Inicio();
      escolha = escolhaPersonagem();

      if (escolha == 1) {// Atribui os equipamentos da AlianÃ§a, Linha de historia da AlianÃ§a
        escolha = 0;
        escolha = historiaAlianÃ§a01();

        if (escolha == 1) {// Historia Karazan

        } else { // Hitoria Queda de Vento-Bravo
          historiaQuedaDeVentoBravo();
          finalHistoriaAlinaca();
        }

      } else {// Atribui os equipamentos da Horda, Linha de historia da Horda
        escolha = 0;
        escolha = historiaHorda01();
        if (escolha == 1) {// Historia MissÃ£o Especial

        } else { // Hitoria Queda de Vento-Bravo
          historiaConquistaVentoBravo();
          finalHistoriaHorda();

        }
      }

    }

    System.out.println("Obrigado por jogar :)\nFelipe Oliveira\nGuilherme Correia");

  }

  static void Inicio() { // Inicio da Historia (100%)
    Scanner er = new Scanner(System.in);
    String vazio;
    int respeito = 15;

    // IntroduÃ§Ã£o de entrada da Historia.
    System.out.println(
        "Enquanto Kil'jaeden preparava a Horda para a invasÃ£o de Azeroth, Medivh continuava a lutar por sua alma contra Sargeras. O rei Llane, o nobre monarca de Ventobravo, ficou cauteloso com a escuridÃ£o que parecia manchar o espÃ­rito de seu ex-amigo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "O rei Llane compartilhou suas preocupaÃ§Ãµes com Anduin Lothar, o Ãºltimo descendente da linhagem Arathi, a quem ele nomeou seu tenente de armas. Mesmo assim, nenhum homem poderia imaginar que a lenta descida de Medivh Ã  loucura provocaria os horrores que estavam por vir.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Como um incentivo final, Sargeras prometeu conceder grande poder a Gul'dan se ele concordasse em liderar a Horda para Azeroth. AtravÃ©s de Medivh, Sargeras disse ao bruxo que ele poderia se tornar um deus vivo se ele encontrasse a tumba submarina onde o GuardiÃ£ Aegwynn havia colocado o corpo aleijado de Sargeras quase mil anos antes.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Gul'dan concordou e decidiu que uma vez que os habitantes de Azeroth fossem espancados, ele encontraria a lendÃ¡ria tumba e reivindicaria sua recompensa. Assegurando que a Horda serviria a seus propÃ³sitos, Sargeras ordenou que a invasÃ£o comeÃ§asse.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Este portal fazia a ponte entre Azeroth e Draenor, e era grande o suficiente para que exÃ©rcitos passassem por ele. Gul'dan despachou orcs pelo portal para inspecionar as terras que eles conquistariam. Os batedores de retorno asseguraram ao Conselonselho das Sombras que o mundo de Azeroth estava maduro para a tomada.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Ainda convencido de que a corrupÃ§Ã£o de Gul'dan iria destruir o seu povo, Durotan falou contra os warlocks mais uma vez. O bravo guerreiro alegou que os bruxos estavam destruindo a pureza do espÃ­rito dos orcs e que essa invasÃ£o imprudente seria o destino deles. Gul'dan, incapaz de se arriscar a matar um herÃ³i tÃ£o popular, foi forÃ§ado a exilar Durotan e seu Frostwolf Clan nos confins deste novo mundo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois que os Frostwolves exilados invadiram o portal, apenas alguns clÃ£s orcs seguiram. Esses orcs rapidamente montaram uma base de operaÃ§Ãµes dentro do Black Morass, uma Ã¡rea escura e pantanosa distante ao leste do reino de Stormwind. Quando os orcs comeÃ§aram a se ramificar e explorar as novas terras, eles entraram em conflito imediato com os defensores humanos de Ventobravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Embora essas escaramuÃ§as terminassem rapidamente, eles fizeram muito para ilustrar as fraquezas e forÃ§as de ambas as espÃ©cies rivais. Llane e Lothar nunca foram capazes de coletar dados precisos dos nÃºmeros dos orcs e sÃ³ podiam adivinhar a forÃ§a que teriam que enfrentar.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println(
        "Depois de alguns anos, a maioria da Horda dos orcs havia entrado em Azeroth, e Gul'dan considerou que chegara a hora do primeiro ataque contra a humanidade. A Horda lanÃ§ou toda a sua forÃ§a contra o reino desavisado de Ventobravo. ");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

  }

  static int escolhaPersonagem() {// Escolha o lado da batalha (100%)
    Scanner sc = new Scanner(System.in);
    Scanner cs = new Scanner(System.in);
    String vazio;
    int escolha;

    System.out.println("Escolha o seu lado da batalha");
    System.out.println(
        "AlianÃ§a: VocÃŠ vai ser um jovem soldado humano e vai  defender a cidade  das forÃ§as poderoÃ§a que marcham en direÃ§Ã£o a Vento Bravo");
    System.out.println("OU");
    System.out.println(
        "Horda: VocÃª vai assumir um Orc conrrompido pelo Sangue Vil do ClÃ£ Lobos de Gelo e ajudara a nova Horda a conquistar com o sangeu e furia o seu novo lar ");
    System.out.println("(1) - AlinÃ§a (2) - Horda");
    System.out.print("FaÃ§a a sua escolha: ");
    escolha = sc.nextInt();

    if (escolha == 1) {// Escolheu AlianÃ§a
      System.out.println("VOCÃŠ ESCOLHEU ALIANÃ‡A");
      String equipamentoAlianca[] = { "Elmo-Ventobraviano", "Peitoral-Ventobraviano", "MÃ£o Esquerda ", "MÃ£o Direita",
          "Constas", "Cintura", "Perneiras-Ventobravo", "Botas-Ventobravianas" };

      for (int i = 0; i < equipamentoAlianca.length; i++) {
        corpoPersonagem[i] = equipamentoAlianca[i];
      }
      try {
        URL url = mainTeste.class.getResource("imagens/allianceSoldier.jpg");
        Desktop desktop = Desktop.getDesktop();

        File file = new File(url.getFile());

        desktop.open(file);

      } catch (Exception e) {
        System.out.println("Erro");
        e.printStackTrace();
      }
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo, " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 1;
    } else {// Escolheu Horda
      System.out.println("VOCÃŠ ESCOLHEU HORDA");
      String equipamentoHorda[] = { "CabeÃ§a:", "Peitoral do Sentinela", "MÃ£o Esquerda ", "MÃ£o Direita", "Constas",
          "Cintura", "Perneiras do Sentinela", "Botas do Sentinela" };

      for (int i = 0; i < equipamentoHorda.length; i++) {
        corpoPersonagem[i] = equipamentoHorda[i];
      }

      try {
        URL url = mainTeste.class.getResource("imagens/orcSoldier.png");
        Desktop desktop = Desktop.getDesktop();

        File file = new File(url.getFile());

        desktop.open(file);

      } catch (Exception e) {
        System.out.println("Erro");
        e.printStackTrace();
      }
      System.out.print("Escolha o nome do seu personagem: ");
      nomeHeroi = cs.nextLine();
      System.out.println("Seja bem-vindo ao Jogo " + nomeHeroi);
      System.out.print("Aperte ENTER para continuar");
      vazio = cs.nextLine();

      return 2;
    }
  }

  static void InventarioAlianÃ§aparte1() { // Mostra os equipamentos e mapa parte1 (100%)
    Scanner ler = new Scanner(System.in);
    int i, escolha, sair = 0;

    do {
      System.out.println("Escolha uma OpÃ§Ã£o");
      System.out.print("[1] - Mapa [2] - Inventario: ");
      escolha = ler.nextInt();

      if (escolha == 1) {
        System.out.println("MAPA");
        try {
          URL url = mainTeste.class.getResource("imagens/mapaAliancepart1.png");
          Desktop desktop = Desktop.getDesktop();

          File file = new File(url.getFile());

          desktop.open(file);

        } catch (Exception e) {
          System.out.println("Erro");
          e.printStackTrace();
        }
        escolha = 0;
      }
      if (escolha == 2) {
        System.out.println("INVENTARIO");
        for (i = 0; i < corpoPersonagem.length; i++) {
          System.out.print(corpoPersonagem[i] + " ");

        }

        System.out.println("\n     .-.\n" + "    _|=|_ - " + corpoPersonagem[0] + "\n" + "   (/`-`\\) - "
            + corpoPersonagem[1] + "\n" + "  //\\___/\\\\ - " + corpoPersonagem[4] + "\n" + "  <>/   \\<> - "
            + corpoPersonagem[2] + " - " + corpoPersonagem[3] + "\n" + "    \\|.|/  - " + corpoPersonagem[5] + "\n"
            + "     <I> - " + corpoPersonagem[6] + "\n" + "     |||\n" + "     /|\\ - " + corpoPersonagem[7]);
        System.out.println();

        escolha = 0;
      }

      System.out.println("Deseja Sair? ");
      System.out.print("[1] Voltar Inventario [2] - Sair: ");
      escolha = ler.nextInt();

      if (escolha == 2) {
        sair = 1;
      }

    } while (sair == 0);

  }

  static void InventarioHordaparte1() { // Mostra os equipamentos e mapa parte1 (100%)
    Scanner ler = new Scanner(System.in);
    int i, escolha, sair = 0;

    do {
      System.out.println("Escolha uma OpÃ§Ã£o");
      System.out.print("[1] - Mapa [2] - Inventario: ");
      escolha = ler.nextInt();

      if (escolha == 1) {
        System.out.println("MAPA");
        try {
          URL url = mainTeste.class.getResource("imagens/mapaHordepart1.png");
          Desktop desktop = Desktop.getDesktop();

          File file = new File(url.getFile());

          desktop.open(file);

        } catch (Exception e) {
          System.out.println("Erro");
          e.printStackTrace();
        }
        escolha = 0;
      }
      if (escolha == 2) {
        System.out.println("INVENTARIO");
        for (i = 0; i < corpoPersonagem.length; i++) {
          System.out.print(corpoPersonagem[i] + " ");

        }

        System.out.println("\n     .-.\n" + "    _|=|_ - " + corpoPersonagem[0] + "\n" + "   (/`-`\\) - "
            + corpoPersonagem[1] + "\n" + "  //\\___/\\\\ - " + corpoPersonagem[4] + "\n" + "  <>/   \\<> - "
            + corpoPersonagem[2] + " - " + corpoPersonagem[3] + "\n" + "    \\|.|/  - " + corpoPersonagem[5] + "\n"
            + "     <I> - " + corpoPersonagem[6] + "\n" + "     |||\n" + "     /|\\ - " + corpoPersonagem[7]);
        System.out.println();

        escolha = 0;
      }

      System.out.println("Deseja Sair? ");
      System.out.println("[1] Voltar Inventario [2] - Sair: ");
      escolha = ler.nextInt();

      if (escolha == 2) {
        sair = 1;
      }

    } while (sair == 0);

  }

  static int historiaAlianÃ§a01() {// Historia introduÃ§Ã£o AlianÃ§a Etapa 1 (100%)
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    // IntroduÃ§Ã£o de entrada da Historia.
    System.out.println("HP - " + HP);
    System.out.println(
        "Quando as forÃ§as de Azeroth e da Horda se enfrentaram no reino, os conflitos internos comeÃ§aram a pesar nos dois exÃ©rcitos. O rei Llane, que acreditava que os orcs bestiais eram incapazes de conquistar Azeroth, detestava sua posiÃ§Ã£o em sua capital, Ventobravo. No entanto, Sir Lothar convenceu-se de que a batalha deveria ser levada diretamente ao inimigo, e ele foi forÃ§ado a escolher entre suas convicÃ§Ãµes e sua lealdade ao rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        nomeHeroi + " Ã© um renomado Sargento e um fiel subordinado do 1 tenente Vladimir do 25 batalhÃ£o de infantaria");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃªs dois se encontra na sala de guerra dentro da bastilha de Vento Bravo onde se encontra o Rei Llane  e seu comandantes.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Entre eles o Sir Lothar um dos maiores comandante da AlianÃ§a e o Ãºnico da mÃªs que tinha enfrentados as novas ameÃ§as e saiu vivo e o Arch Mago Hadigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Entre eles o Sir.Lothar um dos maiores comandante da AlianÃ§a e o Ãºnico que tinha enfrentado a nova ameÃ§a e saiu vivo para contar a historia e o Arch Mago Haddigar um iniciante de mago arcano e aluno da faculdade de Dalaran.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    int numeroAleatorio = (int) (Math.random() * 10);
    if (numeroAleatorio > 8) {
      System.out.println("VocÃª nota que hÃ¡ um livro jogado no chÃ£o \nDeseja ler o livro? \n Sim - 1 \n NÃ£o - 2");
      escolha = re.nextInt();
      if (escolha == 1) {
        System.out.println("VOcÃª acha um livro chamado Chuvas de Castamere que conta uma histÃ³ria fictÃ­cia");
        System.out.println(
            "As Chuvas de Castamere Ã© uma canÃ§Ã£o, que descreve a esmagadora vitÃ³ria de Lorde Tywin Lannister sobre a rebelde Casa Reyne de Castamere, e a destruiÃ§Ã£o da Casa no final de sua rebeliÃ£o. A canÃ§Ã£o Ã©, normalmente, cantada como uma lembranÃ§a do destino que espera aqueles que enfrentam Tywin Lannister, ou qualquer Lannister de Rochedo Casterly.");
        System.out.println(
            "E quem Ã© vocÃª, disse o altivo senhor,\npra que a vÃªnia seja profunda?\nSÃ³ um gato com um manto diferente,\nessa Ã© a verdade fecunda.\nNum manto de ouro ou num manto vermelho,\nsuas garras um leÃ£o mantÃ©m,\ne as minhas sÃ£o longas e afiadas, senhor,\ncomo o senhor as tem tambÃ©m.\nE assim falou, e assim falou,\no senhor de Castamere,\nmas agora a chuva chora no seu salÃ£o,\ne ninguÃ©m estÃ¡ lÃ¡ para a ver.\nSim, agora a chuva chora no seu salÃ£o,\ne ninguÃ©m estÃ¡ lÃ¡ para a ver.");
      }
    }

    System.out.println("HP - " + HP);
    System.out.println(
        "Depois de ver tantas notÃ­cias ruim de batalhÃµes caindo, vilas queimadas, e morte.\nVladimir percebendo isso e foi  em sua direÃ§Ã£o.\ndireciona a palavra a vocÃª.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Vladimir - Com medo Nome do jogador?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - nÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("Sim. Mas isso me faz pensar melhor pelo que estÃ¡ por vir !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;

    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimr olha para vocÃª com o olhar sÃ©rio e fala\nPois deveria nÃ£o sabemos como nosso inimigo luta, eles estÃ£o conquistando provÃ­ncia apÃ³s provÃ­ncia logo logo estaram aqui");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;
    }

    System.out.println("HP - " + HP);
    System.out.println(
        "Em Seguida entra um soldado correndo levando em sua mÃ£o uma mensagem sobre o forte Mirante de Pedra em Montanhas Cristarrubra e entrega o pergaminho ao Capital de PortÃµes Leonidas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("VocÃª quer escutar Leonidas lendo o relatÃ³rio ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - NÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("VocÃª se levanta e se aproxima da mesa de guerra");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("LeÃ´nidas lÃª para todos proximos a mesa:");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("RelÃ¡torio:");
      System.out.print("\n    _______________________________________________________\n"
          + "    /\\                                                      \\\n"
          + "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n"
          + "    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/\n"
          + "    (                                                      (\n"
          + "     )                                                      )\n"
          + "    (                                                      (\n"
          + "     ) As forÃ§as dos Peles Verdes  atacaram as terras de   )\n"
          + "    ( Montanhas Cristarrubra,                              (\n"
          + "     ) queimando a Vila Placida e raptando os seus moradores.) \n"
          + "    (  As torres de magos de Ilgalar  estÃ£o  em chamas,     (\n"
          + "     ) estÃ£o utilizando o Mirante de Pedra como forte sem    )\n"
          + "    (  nenhuma noticias de sobreviventes, e o suposto       (\n"
          + "     )  comandante                                           )\n"
          + "    ( Blackhand estÃ¡ morto, os ClÃ£s de Orcs estÃ£o seguindo  (\n"
          + "     ) um novo Orc chamado Orgrim Doomhammer considerado     )\n"
          + "    (  o novo                                               (\n"
          + "     ) Warchief e marcham em direÃ§Ã£o a Vento Bravo com Armas )\n"
          + "    ( de cerco                                              (\n"
          + "     ) PS: Os lÃ­deres Gul'dan e Durotan e seu              )\n"
          + "    (  clÃ£ nÃ£o foram localizados                            )\n"
          + "     (                                                     (\n"
          + "     )                                                      )\n"
          + "    (                                                      (\n"
          + "    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\    \n"
          + "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n"
          + "    \\/______________________________________________________/");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      System.out.println("HP - " + HP);
      System.out.println(
          "-Haddgar fala\nHaddgar: As minhas fontes afirmam que atravÃ©s de um esforÃ§o conjunto, Medivh e os Warlocks do conselho das Sombras abriram o portal dimensional.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("-Rei Llane argumenta\nRei Llane: Hadgar Lothar, VÃ£o para Karazan deter Mediv!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      escolha = 0;
      System.out.println("VocÃª quer escutar Leonidas lendo o relatÃ³rio ?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - NÃ£o");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println("Senhor! \nAntes mesmo de voce fala com o Comandante Lothar");
        System.out.println("Vladimir nÃ£o confia nas suas habilidades");
        System.out.println("Vladimir: NÃ£o! " + nomeHeroi + " Preciso de vocÃª nas Muralhas!");
        System.out.print("Aperte ENTER para continuar");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioAlianÃ§aparte1();
          vazio = null;
        }
      }

    }

    System.out.println(
        "(Todos na sala escutam as trombetas na cidade)\n -Rei Llane dÃ¡ as Ordens\nRei Llane: TODOS NA SUA POSIÃ‡ÃƒO!\n Rei Llane:PELA ALIANÃ‡A!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    corpoPersonagem[2] = "Arco Longo";
    corpoPersonagem[3] = "Arco Longo";
    corpoPersonagem[5] = "Espada Curta";

    return 2; // Chama Main Quest historiaQuedaDeVentoBravo();

  }

  static int historiaHorda01() {// Historia introduÃ§Ã£o Horda Etapa 1
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha;

    System.out.println("HP - " + HP);
    System.out.println("Depois de conquistarem terras apÃ³s terras, a horda desce em direÃ§Ã£o ao Sul.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃª consegui escapar da traiÃ§Ã£o do Conselho das Sombras apÃ³s ver seu lider Durotan e sua mulher Greta serem assassinados pelo clÃ£ da Lua Negras, comandados por Gulâ€™Dan...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃª e seus amigos  Sion, Yorick e a meia Orc Garona fogem em direÃ§Ã£o ao Sul para se encontrar com os outros ClÃ£s Orc para informar o acontecimento.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Voces chegam em uma regiÃ£o de campinas, onde tem grandes campos de plantio mas com rastros de destruiÃ§Ã£o...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Ao leste, uma grande fumaÃ§a preta cobre o ceÃº. \nVocÃªs resolvem verificar oque estÃ¡ acontecendo...");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("(Alguns minutos de caminhada)");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao meio dia vocÃªs passam ao lado de torres em chamas, logo mais acima da montanha, conseguem ver a bandeira da Horda tribulando em cima de um castelo de pedra");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Em seu portÃ£o conseguem ver BlackHand segurando um jovem soldado humano pelo pescoÃ§o e a outra sua Garra Longa atravessando a sua barriga.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    // int numeroAleatorio = (int) (Math.random() * 10);
    // if(numeroAleatorio>5){
    // System.out.print("VocÃª acabou demonstrando empatia pelo humano...");
    // respect--;
    // }
    // else{
    // System.out.print("VocÃª nÃ£o demonstra empatia pelo humano...");
    // respect++;
    // }

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao se aproximarem Ogrim fica feliz que o clÃ£ de seu melhor amigo veio se juntar a eles\n Mas logo percebe o pior apenas vendo vocÃªs trÃªs\nBlackHand direciona um olhar de satisfeito e com um sorriso sarcastico.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª sabe que Ogrim DoonHammer Ã© o melhor amigo de Durotan");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª quer passar as noticias para Ogrim ou BlackHand ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - BlackHand (2) - Ogrim");
    escolha = re.nextInt();

    if (escolha == 1) {// Fala com o BlackHand
      System.out.println("HP - " + HP);
      System.out.println(
          "Warchief BlackHand tivemos uma traiÃ§Ã£o entre nos.\nFomos atacado pelo clÃ£ Lua Negra a uma noite Durotan e Greta foram mortos!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("BlackHand olha com um olhar de satisfeitos e diz!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E a CrianÃ§a ?");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Acredito que tambem estÃ¡ morta !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Os fracos nunca terÃ£o vez no novo mundo");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("VocÃª fica assuntado com a resposta\nMas nÃ£o pode fazer nada por que vocÃª Ã© apenas um Soldado");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      escolha = 0;
    } else {

      escolha = 0;
      System.out.println("HP - " + HP);
      System.out.println("VocÃª quer passar as noticia  para Ogrim?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - NÃ£o");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println(
            "Ogrim! Ogrim DoonHammer! fomos traido o ClÃ£ Lua Negra nos atacou durante a noite nÃ£o tivemos chance de nos defender\n Durotan e Greta estÃ£o mortos");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Isso nÃ£o Ã© possÃ­vel\n Durotan, Greta meu amigo!,");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("E o filho deles ?");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("NÃ£o Sabemos!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Ogrim direciona o olhar com muita raiva para BlacHand");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

      } else {
        System.out.println("HP - " + HP);
        System.out.println("Garona olha para com olhar de raiva e diz");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

        System.out.println("HP - " + HP);
        System.out.println("Quem Ã© o Traidor ?!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioHordaparte1();
          vazio = null;
        }
        System.out.println();

      }
    }
    System.out.println("HP - " + HP);
    System.out.println(
        "Ao anoitecer o vocÃª se encontra sentado em um banco em um corredor de pedra dentro da fortaleza recÃ©m-conquistada perto de uma das salas que os lideres dos clÃ£s estÃ£o discutindo os prÃ³ximos passos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao seu lado o seu amigo Sion");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª quer fala com Sion?");
    System.out.print("(1) - Sim (2) - NÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("vocÃª vira para o seu amigo e fala");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Oque vocÃª acha que vai acontecer com o nosso clÃ£ logo que o nosso lider esta morto?");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Antes mesmo de Sion comeÃ§ar a falar, vocÃª olha para o lado...");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();
      escolha = 0;

    }
    System.out.println("HP - " + HP);
    System.out
        .println("VocÃª vÃª Ogrim e Garona em passos rapidos em direÃ§Ã£o a porta onde estÃ£o os lideres dos ClÃ£s Orcs");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ogrim entra na porta com e chama BlackHand para um Makâ€™Gora um ritual de duelo para revindicar alguma a lideranÃ§a da horda e vingar a morte do seu amigo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ambos vÃ£o para o pÃ¡tio da fortaleza onde Ogrim derrota BlackHand o boneco de Gulâ€™Dan e assumi a lideranÃ§a da horda.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Ogrim apÃ³s a vitÃ³ria se levanta com a feiÃ§Ã£o de cansaÃ§o olhando para todos no  pÃ¡tio  e grita.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VAMOS ACABAR COM ESSA GUERRA DE UMA VEZ POR TODAS\nOctaâ€™Rogar!!!!!!!!!!!! ");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Na manha seguinte todos os clÃ£s marcham para Oeste em direÃ§Ã£o a umas das maiores cidade dos humanos. Conhecida como Vento-Bravo.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Em marchar vocÃª escuta a voz de Garona \n" + nomeHeroi + "!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Fui designada a uma missÃ£o especial");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª olha para Garona com um olhar reprido");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        " Eu jÃ¡ fui capturada por eles e sei algumas passagens que cortam a cidade e gostaria que vocÃª fosse comigo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("VocÃª quer ir com a Garona ?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - NÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {
      System.out.println("HP - " + HP);
      System.out.println("Garona fica feliz com a sua escolha ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eu sabia que vocÃª nÃ£o ia falar nÃ£o");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      // return 1;

    } else {
      System.out.println("HP - " + HP);
      System.out.println("Garona fica com o olhar de pesado\n Tudo bem ! ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eu entendo !");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioHordaparte1();
        vazio = null;
      }
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("VocÃŠ continua com a marcha e responde a garona");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vou honrar os ultimos membros do meu clÃ£ em batalha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Octaâ€™Rogar");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioHordaparte1();
      vazio = null;
    }
    System.out.println();

    return 2;

  }

  static void historiaQuedaDeVentoBravo() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha, batalha;

    System.out.println("HP - " + HP);
    System.out.println(
        "ApÃ³s escultar as trombetas soarem vocÃª rapidamente pega seu arco, e sua espada e corre em direÃ§Ã£o ao portÃ£o principal da cidade. No caminho atÃ© o portÃ£o vocÃª observa muitas famÃ­lias desesperadas correndo em direÃ§Ã£o  ao Porto de Vento-Bravo onde a 7 e a 9 legiÃ£o e outros  pescadores voluntÃ¡rios estÃ£o levando as a populaÃ§Ã£o para um lugar seguro. Em direÃ§Ã£o ao reino de Lorderom.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Chegando na muralha vocÃª observa  soldados  correndo para todos os lados assumindo as suas posiÃ§Ãµes. ");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª desce do cavalo e comeÃ§a a subir as escadas para o topo da muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O silÃªncio consome  o topo da muralha, e ao observar alÃ©m dela sÃ³ se consegue ver a fumaÃ§a das pequenas casas ao redor de Vento Bravo e uma vasta mancha verde de Orcs com armas de cerco e tochas.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Por toda dimensÃ£o da muralha, Soldados com arcos e armaduras pesadas estÃ£o ao seu lado com o olhar fixo para o horizonte e aguardam os prÃ³ximos passos da batalha.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan o 1 tenente da muralha sobe as escadas com as duas mÃ£o para trÃ¡s e fica ao seu lado.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": Oficial presente!! ");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª fica em posiÃ§Ã£o de sentido.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgam: A vontade!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Ao observar o horizonte vocÃª consegue ver um Orc subindo em uma pedra, e pronunciado em um idioma no qual vocÃª nÃ£o consegue entender. E antes mesmo que ele esse mesmo Orc consiga  terminar sua frase um tiro de flecha nÃ£o autorizado voa em direÃ§Ã£o as tropas atingindo em cheio um Orc na cabeÃ§a.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O orc cai no chÃ£o e em seguida as armas de cerco comeÃ§Ã£o a disparar e as tropas de orcs a correr em direÃ§Ã£o ao portÃ£o.");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan saca sua espada e comeÃ§a a gritar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: Ã‰ CHEGADA  A HORA  HOMEM PREPAREM-SE!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s o a ordem de Morgan, vocÃª e todos os soldados preparam seus arcos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs comeÃ§am a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs comeÃ§am a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs comeÃ§am a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: DISPAREM TODAS AS NOSSO FORÃ‡AS NESSES MALDITOS! PELA ALIANÃ‡A!!!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("E as flechas ganham os fazendo uma grande sobra abaixo delas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("As flechas cai e abatendo uma grande quantidade de orcs.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Mas nÃ£o Ã© o suficiente");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os orcs comeÃ§am a chegar mas perto!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃª observar uma grande bola em chamas atingir as muralhas perto de onde vocÃª estava, e vÃª  um pedaÃ§o da muralha cair levando alguns soldados pegando fogo e morrendo quase que instantaneamente  ao serem atingido pelos os destroÃ§os.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("O caos Ã© instaurado entres os soldados  quando eles observam os orcs colocando escadas na muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Uma bola de fogo estÃ¡ preste a atingir alguns soldados na sua frente!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("VocÃª percebe que consegue  ajudar os soldados que estÃ£o  preste a ser atingido");
    System.out.println("Quer ajuda-los?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - NÃ£o");
    escolha = re.nextInt();

    corpoPersonagem[2] = "MÃ£o Esquerda";
    corpoPersonagem[3] = "MÃ£o Direita";

    if (escolha == 1) {
      HP -= 15;

      System.out.println("HP - " + HP);
      System.out.println(
          "A bola de fogo atingi a muralha arremessando para fora dela e caindo no rios dos Vales dos Herois.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Por conta da explosÃ£o estÃ¡ vocÃª afundado e um pouco desnortiado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª consegue observar do outro lado do rio um grupo pequeno de orcs entrando pelos os dutos  de esgoto de vento bravo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Mas antes mesmo de apagar vocÃª consegue ver uma mÃ£o te pegando e tirando vocÃª da Ã¡gua.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E grita!.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Soldado 1: Acorda Sargento, Acordâ€¦â€¦");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Uma explosÃ£o forte acontece perto de vocÃªs e um pedaÃ§o de madeira acaba atingido o soldado pelas costas que morre na hora olhando para vocÃª");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ao olhar para cima vocÃª jÃ¡ consegue ver as muralhas tomadas pelos o peles verdes.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Na ponte vocÃª consegue ver Vladimir com uma tropa de soldados com grandes escudos e lanÃ§as  ajudando os soldados remanescentes a recuarem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("A unica reaÃ§Ã£o Ã© correr para ponte que leva para o segundo portÃ£o seguindo as ordens de Morgan!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else {

      corpoPersonagem[3] = "Espada Curta";

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª vÃª a bola de fogo atingindo em cheio a muralha arremessando os soldados na quela posiÃ§Ã£o para trÃ¡s fazendo eles caÃ­rem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "E vocÃª Ã© arremessando para o lado, vocÃª fica com a visÃ£o turva, e sua audiÃ§Ã£o fica  baixa com se vocÃª estivesse com as mÃ£os  tampando seus ouvidos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Em sua frente aprese um dos orcs subindo a escada um soldado consegue  pega-lo com uma espadada. Mas com o segundo Orc ele nÃ£o tem tanta sorte e o Orcs acaba matando o soldado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Um terceiro aparece rapidamente e vai na sua direÃ§Ã£o. Com rapidez vocÃª consegue pegar a sua espada e consegue se defender do primeiro ataque.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();
      // Batalha:

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O Orc acerta vocÃª na costela.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("VocÃª cai de joelho perto da berada da muralha.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Orc: Groaaaaaaaaaarrrrrrrrrr!!! ");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println(
            "E lhe dar um ponta pÃ© pelas costas fazendo vocÃª cair do alto da muralha no  rio do Vale dos HerÃ³is.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println(
            "Um terceiro aparece rapidamente e vai na sua direÃ§Ã£o. Com rapidez vocÃª consegue pegar a sua espada e consegue se defender do primeiro ataque.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out
            .println("VocÃª consegue esquivar porÃ©m um ele consegue lhe acertar fazendo um pequeno corte na sua perna!");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println(
            "VocÃª esquiva e o acerta com um Ãºnico golpe na barriga e outro no pescoÃ§o separando a cabeÃ§a do corpo.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "E meios o caos e os orcs aos montes dominado a muralha Morgan dÃ¡ as ordens para o recuar dos soldados remanescentes.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: RECUAR SOLDADOS!!! PARA  O SEGUNDO PORTÃƒO VAMOOOOOSSSSSSSSSS!!!!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ao descer as escadas em meio ao caos e explosÃµes e orcs dominando a muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª passa em frente  ao primeiro portÃ£o que jÃ¡ estÃ¡ quase caindo e  a sua frente um pequeno batalhÃ£o de soldados com lanÃ§as e escudos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println("VocÃª observa Morgan atrÃ¡s das tropas de Vladimir auxiliando os restantes dos soldados a recuarem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir Olha para vocÃª.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir: Que bom que vocÃª estÃ¡ vivo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "No exato momento que vocÃª passa  pelos batalhÃµes. O primeiro portÃ£o cai em fogo e destroÃ§os, e atrÃ¡s dele orcs montados em lobos gigantes. Matando os soldados que passam a frentes deles. Aquilo Ã© realmente uma carnificina mediante aos seus olhos. Era algum que vocÃª nunca jÃ¡ mais viu.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("E investe para cima das tropas de contenÃ§Ã£o de escudo e lanÃ§as.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Eles nÃ£o vÃ£o conseguir aguentar por muito tempo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª chega ao segundo portÃ£o que Ã© entrada que dÃ¡ acesso ao centro da cidade o Distrito Comercial.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Mas todos sabem que as grades de aÃ§o nÃ£o vÃ£o  aguentar por muito tempo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª continua vendo as bolas de fogo, batendo na segunda muralha, soldados ofegantes, Sacerdotes curando os feridos em quanto eles recuam. ");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: Nem todos os solados recuaram, perdi quase todos os meus homens");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Apos a fala de Morgan observa Vladimir aprece com poucos soldados e atrÃ¡s deles os portÃµes de grades reforÃ§adas fechando.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimir: eles tomaram a ponte dos Vale dos Herois, devemos ajudar na evacuaÃ§Ã£o do povo, eles estÃ£o em grande nÃºmero e avanÃ§ado em grandes quantidades, eu vou para Cidade Velha em direÃ§Ã£o a Bastilha Ventobravo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Morgan: Vou leva minhas tropas para o Distrito dos Magâ€¦â€¦");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Uma grande de explosÃ£o acontece na muralha fazendo  os portÃµes cairem.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Os orcs passam pelos portÃµes gritando com raiva e com sede de sangue indo a direÃ§Ã£o  de vocÃªs na Vladimir lanÃ§a a sua lanÃ§a acetando em cheio o peitos de um deles, Morgan pega o seu arco consegue acertar dois  antes mesmo ele consiga chegar nele.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out
            .println("O orc consegue te desarmar e impala vocÃª com a sua prÃ³pria espada,  o jogando vocÃª no chÃ£o.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println(
            "VocÃª consegue se esquivar do ataque  mas a toma uma cotovelada e com medo acaba correndo em direÃ§Ã£o a PraÃ§a da  Catedral. Porem devido uma explosÃ£o faz vocÃª  recuar e correr em direÃ§Ã£o a Cidade Velha.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println(
            "VocÃª consegue defender um ataque certeiro em vocÃª e contra ataca com um golpe na barriga fazendo um grande corte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Com o caos instaurado em toda a cidade, vocÃª apenas consegue observar morte por todo lado com, orcs, humanos, o cheiro de sangue misturado com cinzas das casas queimando, gritos e pessoas chorando, aquilo tudo te deixa com muito medo.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Vladimir  posiciona alguns soldados na ponte onde liga  o Disrtrito Comercial com a Cidade Velha. VocÃª mantÃªm a sua posiÃ§Ã£o em quanto os orcs avanÃ§am.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O orce acerta um golpe na sua barriga fazendo vocÃª sangra e vocÃª cai da ponte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println("vocÃª recua para atrÃ¡s das tropas");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("VocÃª consegue pegar  investir com um contra ataque acertando o pescoÃ§o do inimigo");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println();
      System.out.println("VocÃª quer Armar a Bomba?");
      System.out.println("Qual a sua Resposta ?");
      System.out.print("(1) - Sim (2) - nÃ£o");
      escolha = re.nextInt();

      if (escolha == 1) {
        System.out.println("HP - " + HP);
        System.out.println(nomeHeroi + ": Eu faÃ§o isso!");
        System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
        vazio = er.nextLine();
        if (vazio.equals("i")) {
          InventarioAlianÃ§aparte1();
          vazio = null;
        }
        System.out.println();

        sideQuest();
        escolha = 0;

      }
    } // eeeee

    System.out.println("HP - " + HP);
    System.out.println("VocÃª consegue  dar mais tempo para os cidadÃ£os recuarem.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir da ordem para vocÃªs recuarem.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir: Homens agora!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "O soldado acende o pavio das bombas que estÃ£o armada de baixo da ponte fazendo a explodir levando alguns orcs juntos.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sua armadura estÃ¡ agora com manchas de sangue apÃ³s a explosÃ£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Mesmo ao caos espalhado pela cidade, vocÃªs consegue esvaziarem  a Cidade Velha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir direciona para vocÃª.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Vladimir: Vou para a Bastilha. VocÃª vem comigo?");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println();
    System.out.println("VocÃª quer acompanhar Vladimir?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - nÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {

      System.out.println("HP - " + HP);
      System.out.println("VocÃªs chegam na Bastilha-Vento Bravo.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "E ao chegar nas escadarias vocÃªs observam caindo a frente da faxada uma grande bandeira de cor vermelha com  um sÃ­mbolo estranho e um Grifo com a PrÃ­ncipe Varian e o General Lothar voando para bem longe. ");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Os sinos da catedral soam anunciando a morte do Rei.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Ao entrarem dentro da bastilha vocÃª apenas consegue observar o General LeÃ´nidas morto e outro Orc erguendo o corpo do Rei Llane como se fosse um trofel e ao seu lado com mais dois orcs comemorando a sua vitÃ³ria.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir fica em pÃ¢nico e como se o mundo dele estivesse acabado, e com o olhar triste.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Vladimir: Estamos perdido!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out
          .println(nomeHeroi + ": Ã‰ tarde de mais Vladimir devemos ir embora agora, podemos vencer em outro momento.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Nesse momento aparecem dois  Orcs todos com grandes machadados que vÃ£o para cima de vocÃªs.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O orc acerta um golpe na sua barriga fazendo vocÃª sangrar atÃ© a morte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out.println("VocÃª  sai correndo deixando Vladimir para trÃ¡s");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("Voce consegue golpeÃ¡-lo na garganta e com um gemido a criatura cai no chÃ£o.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("VocÃª olha para o lado e vÃª mais orcs chegando.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Vladimir olha com os olhos cheios de lÃ¡grimas.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Vladimir: VÃ¡ " + nomeHeroi + " darei mais tempo para vocÃªs");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Chegando no Dsitrito dos AnÃµes  vocÃª  e vendo tudo ao seu redor  pegando  fogo, muito corpos no chÃ£o,  e os sinos da Catedral  nÃ£o paravam de tocar anunciando a mote do rei.  E a queda da cidade fazendo todo os seus cidadÃ£os abandonarem a cidade.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Logo atrÃ¡s de vocÃªs vem vindo uma manada de Orcs sedentos por sangue, vocÃª se vÃª ao meio alguns soldados.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      sideQuest();
      escolha = 0;

    }

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": ATENÃ‡ÃƒO HOMENS!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ":NÃ³s somos os Ãºltimos homens que protege os civis.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Os Orcs conseguem passar pelos portÃµes que ligam a Cidade Velha e a Bastilha com o Distrito dos AnÃµes.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi + ": HOMENS POSIÃ‡ÃƒO DE DEFESAS.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Os Orcs correm com fÃºria para a direÃ§Ã£o de vocÃªs.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃª observando o rostos dos soldados em desesperos comeÃ§a a pronunciar o juramento do quartel em voz alta.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi
        + "A NOITE CHEGA, E AGORA COMEÃ‡A A MINHA VIGIA. NÃƒO TERMINARÃ� ATÃ‰ A MINHA MORTE VIVEREI E MORREREI NO MEU POSTO. SOU A ESPADA NA ESCURIDÃƒO.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos: SOU A ESPADA NA ESCURIDÃƒO");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Todos: SOU O FOGO QUE ARDE CONTRA O FRIO, A LUZ QUE TRAZ CONSIGO A ALVORADA, A TROMBETA QUE ACORDA OS QUE DORMEM, O ESCUDO QUE DEFENDE OS REINOS DOS HOMENS.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(
        "Todos:  Dou a minha vida e a minha honra Ã  AlianÃ§a, por esta noite e por todas as noites que estÃ£o para vir.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos: AAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHH!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();
    if (batalha == 0) {

      System.out.println("O Orc o golpeia quebrando sua armadura e o jogando no chÃ£o.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Um dos soldados entra na sua frente e acaba sendo morto em seu lugar");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("vocÃª consegue uma investida contra o inimigo o atingindo pelas costas");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println(
          "ApÃ³s  se levantar  o Orcs pega vocÃª pelo vÃ£o da armadura erguendo vocÃª o chÃ£o  e o apunhalando com uma faca em sua barriga!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Com medo da investida foras do Orc vocÃª vai para trÃ¡s dos homens que estÃ£o  atrÃ¡s de vocÃª.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println(
          "Voce consegue desviar de uma lanÃ§a que voava em sua direÃ§Ã£o e coloca o corpo do Orcs em sua direÃ§Ã£o a lanÃ§a atravessa o mostro o fazendo gemer bem alto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("Uma explosÃ£o acontece perto de vocÃª.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Nesse momentos seus ouvidos sÃ£o  tapados e vocÃª apenas consegue escutar a sua prÃ³pria respiraÃ§Ã£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Mas antes mesmo que receber o golpe de misericÃ³rdia vocÃª consegue defender ao o ataque do Orc.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("VocÃª Ã© atingido por uma lanÃ§a na nuca fazendo atravessar seu rosto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("VocÃª recua para as rampas em direÃ§Ã£o ao Porto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println(
          "VocÃª o acerta com toda a sua forÃ§a na regiÃ£o da barriga. Fazendo  a sua arma atravessar para o outro lado.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println(
        "VocÃªs conseguem ver o sinal de fumaÃ§a emitido pelos magos anunciando que os Ãºltimos civis embarcaram.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Voce da  ordem para os Ãºltimos soldados a recuarem");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Nome do jogador: Recuarâ€¦.. Recuarâ€¦. !!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      InventarioAlianÃ§aparte1();
      vazio = null;
    }
    System.out.println();

  }

  public static void finalHistoriaAlinaca() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;

    if (respect > 8) {
      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃªs e os restantes dos homens conseguem embarca e, mas no fundo sÃ³ existe tristeza pois a umas das maiores cidades do reino dos humanos acaba de cair nas mÃ£o do inimigo. VocÃªs apenas conseguem ver fumaÃ§a destruiÃ§Ã£o. Eu e os meus companheiros fizeram um juramento implacÃ¡vel para recuperar sua terra natal a qualquer custo fugindo para as terras de Lortheron o maior reino dos humanos.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "Voce estÃ¡ descendo as rampas e por um momento vocÃª para e ajuda o resto  dos homens a irem na frente ao passar do Ãºltimo homem vocÃª sente uma flecha  arrevesando seu ombro.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("Com a respiraÃ§Ã£o baixa vocÃª se ajoelha jÃ¡ sem forÃ§as para continuar.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "E do ponto onde vocÃª estÃ¡  avistando o por do sol e vendo os GaleÃµes  se afastarem uma lagrima de alegria cai do seu olho esquerdo com uma sensaÃ§Ã£o  de paz e dever comprido.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("VocÃª sente alguÃ©m pegando vocÃª pela armadura e erguendo vocÃª.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "O grande Orc fala algumas palavras nÃ£o qual vocÃª nÃ£o consegue entender nada e com uma espada atravessa ela na sua barriga e deixando vocÃª cair no chÃ£o.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println(
          "Seus olhos de apagam com a Ãºltima visÃ£o da bandeira da alianÃ§a tremulando no mastro de uns dos navios destruÃ­dos no Porto.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

    }
  }

  static void historiaConquistaVentoBravo() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int escolha, batalha;

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s um dia de marcha e de queimarem tudo ao redor da grande cidade de pedra");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("vocÃª se encontra logo atrÃ¡s da linha das armas de cerco. A sua frente uma grande muralha com um portÃ£o de madeira e no topo dessa muralha muitos humanos com arcos olhando para vocÃªs. Os Orcs ficam agitados com a euforia de comeÃ§arem logo a matanÃ§a.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Todos se calam!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim fica de pÃ© em uma pedra e comeÃ§a a pronunciar algumas palavras.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim fica de pÃ© em uma pedra e comeÃ§a a pronunciar algumas palavras.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: Hoje Ã© o dia que vamos ficar nesse mundo definitivamente, hoje Ã© o dia que mostraremos nossas forÃ§as para a nossa PAZâ€¦â€¦.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: Gulâ€™â€¦..");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Antes mesmo de terminar a frase uma flecha atingi a linha de frente acertando um dos seus irmÃ£o na cabeÃ§a o fazendo morrer instantaneamente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim assuntado dar a ordem de avanÃ§ar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: PELA A HORDA !!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª e seus irmÃ£o partem para a batalha aos gritos, com frenesi de sangue no corpo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s chegar bem perto da muralha vocÃªs observam uma chuva  de flechas voando em direÃ§Ã£o a vocÃªs. Ofuscando atÃ© mesmo a passagem de luz.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Muitos do seu lado caem com as flechas os atingidos em cheio em vÃ¡rias partes do corpo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao seu lado estÃ¡ seu amigo Sion ele grita para vocÃªs.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Morgan: ESPEREM!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: Nome do jogador venha comigo vamos pegar essa escada vamos juntos com os outros por cima das muralhas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("Quer ajuda-los? (1) - Sim (2) - NÃ£o");
    System.out.print("Qual a sua Resposta: ");
    escolha = re.nextInt();

    if (escolha == 1) {
      HP -= 15;

      System.out.println("HP - " + HP);
      System.out.println("VocÃª pega a escada com Sion e outros Orcs e corre em direÃ§Ã£o ao lado direto da muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª consegue colocar a escada em posiÃ§Ã£o. Em quanto sobem uma flecha acaba acertando vocÃª no ombro");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Dois Orcs sobem na frente de vocÃªs.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Um deles e atingido e cai do alto da escada.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("O segundo consegue passar.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Sion era o prÃ³ximo uma espada acaba passando bem perto dele. Mas ele consegue desviar e arremessando o soldado para fora da muralha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª chega ao topo  da muralha e vÃª um soldado ajoelhado no chÃ£o. VocÃª vai na direÃ§Ã£o  dele para o acerta.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      batalha = sistemaCombate();
      if (batalha == 0) {

        System.out.println("O humana sai correndo e desliza por baixo de vocÃª o cortando da barriga a virilha fazendo vocÃª sangrar atÃ© a morte.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        return;

      } else if (batalha == 2) {
        HP -= 20;

        System.out
            .println("vocÃª consegue desviar do ataque dele, mesmo assim ele arremessa uma faca que acaba o acertando da batata da perna");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("VocÃª o acerta com um golpe na barriga.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

        System.out.println("Ele se ajoelha e vocÃª dÃ¡ um ponta pÃ© na costa dele fazendo ele cair da muralha em um rio logo.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();
      }

      System.out.println("HP - " + HP);
      System.out.println("VocÃª consegue ver as portas de arrebentando e a cavalaria de Orcs montados em Lobos.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Seus irmÃ£os avanÃ§am contra um punhado de soldados humanos com escudos e lanÃ§as e alguns desses humanos recuando para uma segunda muralha com um portÃ£o de ferro.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª desce as escadas da muralha em meios ao monte de corpos mutilados tantos humanos com dos seus irmÃ£os.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else{

      corpoPersonagem[3] = "Machado";

      System.out.println("HP - " + HP);
      System.out.println("vocÃª nega a em ir e avisa ao Sion que pode ser perigoso e fala que vai na segunda leva.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s as conquistas das muralhas um soldado humano se levanta e corre na sua direÃ§Ã£o");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();
    

    batalha = sistemaCombate();
    if (batalha == 0) {

    System.out.println("vocÃª pega ele pelo pescoÃ§o. Mas por azar ele saca um punhal e o acerta direto no coraÃ§Ã£o.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    return;

    } else if (batalha == 2) {
      HP -= 20;

    System.out.println("vocÃª consegue desviar do ataque, mas ele lhe acerta com a coronha da armar na sua sobrancelha. Um outro Orc acaba matando o humano com facilidade.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();

      } else if (batalha == 1) {

        System.out.println("ApÃ³s uma segunda investida do humano vocÃª o consegue desarma-lo com facilidade Com a prÃ³pria espada do soldado vocÃª o acerta na barriga atravessando-a.");
        System.out.print("Aperte ENTER para continuar");
        vazio = er.nextLine();
        System.out.println();
      }

    
    

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s muitas baixas Orgim chega na ponte que liga a entrada principal e ao portal da cidade.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim: os humanos foram muitos imprudentes em mandar todas suas tropas de arqueiros para  frente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim da as ordens para derrubar o segundo portÃ£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim:  devemos nos apresar. nossa vitÃ³ria estÃ¡ prÃ³xima logo a montanha do rei serÃ¡ nossa.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Orgim: Homens derrubem esse portÃ£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("As armas de certo abrem fogo contra o portÃ£o fazendo a segunda muralha cair os pedaÃ§os fazando os humanos acima dela cairem em chamas.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println();
    System.out.println("Planta a Bomba?");
    System.out.println("Qual a sua Resposta ?");
    System.out.print("(1) - Sim (2) - nÃ£o");
    escolha = re.nextInt();

    if (escolha == 1) {

      System.out.println("HP - " + HP);
      System.out.println("VocÃª Se aproxima do PortÃ£o de Ferro!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        historiaAlianÃ§a01();
        vazio = null;
      }
      System.out.println();

      sideQuest();
      escolha = 0;

    }

    System.out.println("HP - " + HP);
    System.out.println("Com uma grande explosÃ£o fazendo o segundo portÃ£o cair em pedaÃ§os.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Observa a primeira linha e a cavalaria irem na frente.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("ApÃ³s a primeiro leva de soldados vocÃªs entra na cidade. Com susto e com muita tristeza vocÃª observa humanos pequenos mortos, humanos fÃªmeas mortos, casas queimando, demolidas, outros soldados sendo abatidos por misericÃ³rdia ou por maldade.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion estÃ¡ ao seu lado e pede para acompanhar ele que fala que a primeira linha foi quase dizimada depois de uma explosÃ£o perto da ponte que leva para a montanha do rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª estÃ£o bem perto da onde aconteceu a explosÃ£o outros Orcs jÃ¡ improvisaram uma ponte com as escada de madeira que usaram para subir na primeira muralha.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃªs escutam um barulho agudo vindo do centro da cidade em uma montanha de cor branca que nÃ£o parava.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ogrim para ao lado de vocÃªs");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Orgrim: Finalmente !!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: VAMOS PARA A MONTANHA DO REI.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Chegando em frente da montanha vocÃª consegue alguns soldados correndo para direÃ§Ã£o oposta de vocÃªs.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("A bandeira da Horda em cima da montanha do rei.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion grita!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion: Olhe "+nomeHeroi+" no portÃ£o da montanha");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Ao observar no portÃ£o vocÃª vÃª Garona saindo do castelo com a bandeira de um grande leÃ£o dourado no fundo azul em mÃ£os e seu amigo Yorick  com o corpo do rei humano nas mÃ£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Um dos soldados fica de pÃ© e corre na direÃ§Ã£o  de vocÃªs contra vocÃªs com duas espadas e com ma armadura totalmente diferente dos outros soldados");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Sion vai em direÃ§Ã£o desse soldado mas  sem muito esforÃ§o seu amigo Ã© abatido com um corte horizontal na barriga e antes mesmo que ele caia no chÃ£o o humano arranca a cabeÃ§a dele.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": NÃƒOOOOOOOO!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": SIONNNNNN");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(" E com o frenesi do momento vocÃª parte para cima dele !");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": NÃƒOOOOOOOO!!!!");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();
    if (batalha == 0) {

      System.out.println("O soldado consegue te desarmar e com as duas lÃ¢minas das espadas corta a sua garganta decepando a sua cabeÃ§a.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("vocÃª pega a cabeÃ§a do seu amigo nas mÃ£os. E por um momento de distraÃ§Ã£o o humano investe contra vocÃª.Antes dele atingir vocÃª. Garona lanÃ§a uma adaga em direÃ§Ã£o humano atingido ele no pescoÃ§o.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("Com a raiva de perder seu amigo vocÃª consegue desarmar o humano pega ele com as duas mÃ£o  o arremessa entre a sua coxa direita quebrando a sua espinha.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("A sua tristeza por perder um amigo se mistura com a raiva por participar dessa matanÃ§a desnecessÃ¡ria mesmo com Gulâ€™Dan expulso da Horda apÃ³s a sua traiÃ§Ã£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("VocÃª fala para si mesmo.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println(nomeHeroi+": Nome do jogar: vou acabar com isso!!.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("vocÃª corre junto com os outro Orcs para a linha final da cidade onde encontra ou fileira de soldados protegendo alguns humanos que estÃ£o embarcando em grandes canoas que vocÃª jamais tinha visto antes.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("E vocÃª e seus irmÃ£o investi contra eles.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();//espra qui 
    if (batalha == 0) {

      System.out.println("O Humano o golpeia quebrando sua armadura e o jogando no chÃ£o.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Um dos Orcs entra na sua frente e acaba sendo morto em seu lugar com uma facada nas costas.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("vocÃª consegue uma investida contra o inimigo o atingindo pelas costas");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("ApÃ³s se levantar  o humano pega vocÃª pelo o vÃ£o da armadura erguendo vocÃª do chÃ£o  e o apunhalando com uma faca em sua barriga!");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("Com medo da investida do Ãºltima ataque do soldados vocÃª vai para trÃ¡s dos seus irmÃ£os que estÃ£o  atrÃ¡s de vocÃª.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("VocÃª consegue desviar de uma lanÃ§a que voava em sua direÃ§Ã£o e coloca o corpo do humano em sua direÃ§Ã£o a lanÃ§a atravessa o matando na mesma hora.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

    System.out.println("HP - " + HP);
    System.out.println("Uma explosÃ£o acontece perto de vocÃª.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out
        .println("Nesse momentos seus ouvidos sÃ£o  tapados e vocÃª apenas consegue escutar a sua prÃ³pria respiraÃ§Ã£o.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    System.out.println("HP - " + HP);
    System.out.println("Outro humano consegue acertar a sua perna o forÃ§ando a ajoelhar.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }

    System.out.println("HP - " + HP);
    System.out.println("Mas antes mesmo que receber o golpe de misericÃ³rdia vocÃª consegue defender ao o ataque do Humano.");
    System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
    vazio = er.nextLine();
    if (vazio.equals("i")) {
      historiaAlianÃ§a01();
      vazio = null;
    }
    System.out.println();

    batalha = sistemaCombate();// 1
    if (batalha == 0) {

      System.out.println("VocÃª Ã© atingido por uma lanÃ§a na nuca fazendo atravessar seu rosto.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

      return;

    } else if (batalha == 2) {
      HP -= 20;

      System.out.println("VocÃª fica parado esperando receber o ultimo ataque. Mas um irmÃ£o consegue matar o humano antes dele chegar atÃ© vocÃª");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    } else if (batalha == 1) {

      System.out.println("VocÃª consegue desviar de uma lanÃ§a que voava em sua direÃ§Ã£o e coloca o corpo do humano em sua direÃ§Ã£o a lanÃ§a atravessa o matando na mesma hora.");
      System.out.print("Aperte ENTER para continuar");
      vazio = er.nextLine();
      System.out.println();

    }

  }

  public static void finalHistoriaHorda() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;

    if (respect > 8) {
      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª e seus irmÃ£o  vence aquela investida e vÃª os humanos correndo para as grandes Canoas de madeiras.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "A cidade estÃ¡ destruÃ­da, quase tudo em reiunas, e aquele maldito barulho do centro da cidade tinha cessado.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Bandeira da Horda tremulado na grande montanha de pedra do rei.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª observa as grandes Canoas se afastando  para bem longe.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ogrim aparece perto de vocÃª. E se pronuncia.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Ogrim: Nem sempre a PAZ vem como nÃ³s esperamos,  ela vem com muito esforÃ§o  e sangue.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(
          "Ogrim: Hoje cai nosso inimigo e com ele surge a PAZ. Hoje comeÃ§aremos uma nova histÃ³ria para nossos clÃ£s unidos em uma Ãºnica bandeira.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Orgim: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Orgim: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Todos: PELA HORDA!!!!!!!!!");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

    } else {

      System.out.println("HP - " + HP);
      System.out.println(
          "VocÃª e seus irmÃ£o  vence aquela investida e vÃª os humanos correndo para as grandes Canoas de madeiras.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª vÃª um Ãºnico soldado correndo em direÃ§Ã£o  as canoas.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }

      System.out.println("HP - " + HP);
      System.out.println("VocÃª pega um arco do chÃ£o e dispara o acertando em cheio em seu ombro direito o ajoelhar.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("VocÃª  se aproxima do soldado ajoelhado o pega pelo o vÃ£o da armadura  o erguendo");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("vocÃª olha nos seus olhos");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println(nomeHeroi + ": Eu sei que ainda nÃ£o acabou e que vamos nos encontra muitas e muitas vezes.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

      System.out.println("HP - " + HP);
      System.out.println("Com uma espada o atravessa na barriga o deixando cair no chÃ£o.");
      System.out.print("Aperte ENTER para continuar ou [i] - INVENTARIO: ");
      vazio = er.nextLine();
      if (vazio.equals("i")) {
        InventarioAlianÃ§aparte1();
        vazio = null;
      }
      System.out.println();

    }
  }

  public static int sistemaCombate() {

    Scanner leitor = new Scanner(System.in);
    int escolher;

    while (HP > 0 && eHP > 0) {
      System.out.println("VocÃª pode escolher: \n\n(1) - ATACAR\n\n(2) - CORRER\n\n(3) - TOMAR POÃ‡ÃƒO DE CURA");
      escolher = leitor.nextInt();

      if (escolher == 1) {
        attack();
      }
      if (escolher == 2) {
        run();

      }
      if (escolher == 3) {
        potion();
      }

    }
    if (HP <= 0) {

      return 0;
    } else {
      eHP = 40;
      return 1;
    }

  }

  public static void attack() {

    int DMG = 0, eDMG = 0;

    System.out.println("VocÃª ataca o adversÃ¡rio");
    System.out.println("");

    DMG = (int) (Math.random() * 40);

    System.out.println("VocÃª causa " + DMG + " de dano");
    eHP = eHP - DMG;
    System.out.println("");

    System.out.println("Seu HP: " + HP + "\nHP do Inimigo: " + eHP);
    System.out.println("");

    eDMG = (int) (Math.random() * 40);

    System.out.println("O adversÃ¡rio te ataca com " + eDMG + " de dano");
    System.out.println("");
    HP = HP - eDMG;
    System.out.println("Seu HP: " + HP + "\nHP do Inimigo: " + eHP);
    System.out.println("");

    if (HP <= 0) {
      System.out.println("VocÃª morreu");

    }
    if (eHP <= 0) {
      System.out.println("VocÃª ganhou");

    }

  }

  public static void run() {

    int DMG = 0, eDMG = 0, dLook;

    System.out.println(
        "VocÃª escolheu correr, serÃ¡ rodado um d10, se vocÃª tirar acima de 6, foge, senÃ£o, toma um d40 de dano");
    dLook = (int) (Math.random() * 10);
    System.out.println("VocÃª tirou " + dLook);

    if (dLook > 6) {
      System.out.println("VocÃª fugiu");
      eHP = 0;
      respect--;
    } else {
      DMG = (int) (Math.random() * 40);
      System.out.println("VocÃª nÃ£o fugiu e recebeu " + DMG + " de dano");
      HP = HP - DMG;
    }
    eHP = 0;
  }

  public static void potion() {

    int DMG = 0, dLook;

    DMG = (int) (Math.random() * 40);
    System.out.println("VocÃª curou 25 de HP e reebeu " + DMG + " de dano ao se distrair");
    HP = HP - DMG;

  }

  public static void sideQuest() {
    Scanner er = new Scanner(System.in);
    Scanner re = new Scanner(System.in);
    String vazio;
    int numeroArmado, tentativa = 1;

    System.out.println("HP - " + HP);
    System.out.println("Em quanto os outros lhe dÃ£o cobertura vocÃª Ã© segurado pelos pÃ©s.");
    System.out.print("Aperte ENTER para continuar");
    vazio = er.nextLine();
    System.out.println();

    do {
      System.out.println("HP - " + HP);
      System.out.println(
          "Para armar a bomba Ã© preciso coloca os pavios na ordem correta eles estÃ£o identificado com Os CARACTERES  PDJJM+T");
      System.out.print("Qual o numero da Seguencia da bomba?: ");
      numeroArmado = re.nextInt();
      System.out.println();

      if (numeroArmado == 7355608) {
        System.out.println(nomeHeroi + ": The bomb was planted!");
        System.out.println(nomeHeroi + ": Ops Jogo errado !");
        tentativa = 0;
      } else {
        HP -= 1;
        System.out.println(nomeHeroi + ": Essa seguencia estÃ¡ errada! ");
      }

    } while (tentativa == 1);

  }

}
