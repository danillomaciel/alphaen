package br.com.danillomaciel.alphaenglish.visao;

import java.util.Scanner;
import br.com.danillomaciel.alphaenglish.modelo.Frase;
import br.com.danillomaciel.alphaenglish.persistencia.FraseDao;


/**
 *
 * @author Danillo
 */


public class Main extends Janela{

    public static void main(String[] args) {
        Main m = new Main();
        m.Gui();



       // m.gravar();
       // m.buscaRnd();
       

    }

    public void Gui()
        {
        Janela j = new Janela();
       //Janela j = new Janela();
        //JFrame frame = new JFrame("Janela");
       j.setDefaultCloseOperation(Janela.EXIT_ON_CLOSE);
        j.setSize(500, 300);
        j.setResizable(true);
        j.setVisible(true);



    }



    public void gravar() {
        Frase f = new Frase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase em Português : ");
        f.setfPortugues(sc.nextLine());
        System.out.println("Digite a frase em Inglês : ");
        f.setfIngles(sc.nextLine());


        try {
            FraseDao fd = new FraseDao();
            fd.gravar(f);

            System.out.println("Gravado com Sucesso!!!");

        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    public void buscaId() {
        Scanner sc = new Scanner(System.in);
        try {
            FraseDao fd = new FraseDao();
            fd.buscaporId(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    
}


