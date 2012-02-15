package br.com.danillomaciel.alphaenglish.persistencia;

import br.com.danillomaciel.alphaenglish.modelo.Frase;
import java.util.ArrayList;
import java.util.List;

public class FraseDao extends Dao {

    public void gravar(Frase f) throws Exception {
        abrirBanco();
        pstmt = con.prepareStatement("INSERT INTO frase values(null, ?, ?,?,?,?)");
        pstmt.setString(1, f.getfPortugues());
        pstmt.setString(2, f.getfIngles());
        pstmt.setString(3, f.getNomeLivro());
        pstmt.setString(4, f.getUnidLivro());
        pstmt.setString(5, f.getTipoFrase());
        pstmt.execute();
        fecharBanco();
    }

    public Frase buscaporId(int id) throws Exception {
        abrirBanco();
        String query = "SELECT * FROM frase WHERE id = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();

        Frase f = new Frase();

        if (rs.next()) {
            f.setId(rs.getInt("id"));
            f.setfPortugues(rs.getString("fPortugues"));
            f.setfIngles(rs.getString("fIngles"));
            f.setNomeLivro(rs.getString("nomeLivro"));
            f.setUnidLivro(rs.getString("unidLivro"));
            f.setTipoFrase(rs.getString("tipoFrase"));
        }
        fecharBanco();
        return f;
    }

    public List<Frase> getLista(String nome) throws Exception {
        abrirBanco();
        String query = "SELECT * FROM frase WHERE fPortugues LIKE ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, nome);
        rs = pstmt.executeQuery();
        
        

        Frase f = null;
        List<Frase> listaNomes = new ArrayList<Frase>();
        while (rs.next()) {
            f = new Frase();
            f.setId(rs.getInt("id"));
            f.setfPortugues(rs.getString("fPortugues"));
            f.setfIngles(rs.getString("fIngles"));
            f.setNomeLivro(rs.getString("nomeLivro"));
            f.setUnidLivro(rs.getString("unidLivro"));
            f.setTipoFrase(rs.getString("tipoFrase"));
            listaNomes.add(f);
        }
        fecharBanco();
        return listaNomes;

    }

    /*
     * nome, unidade, tipo
     * 3 * 2 * 1 = 6
     * nome
     * unidade
     * tipo
     * nome unidade #
     * nome tipo
     * unidade tipo
     * nome, unidade e tipo #
     * 
     */
    public Frase buscaporRnd(String nome, String unidade, String tipoFrase) throws Exception {
        abrirBanco();
        String query = null;


        if ((!nome.equals("")) && (!unidade.equals("")) && (!tipoFrase.equals(""))) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? and unidLivro  LIKE ? and tipoFrase  LIKE ? order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nome);
            pstmt.setString(2, unidade);
            pstmt.setString(3, tipoFrase);

            //nome unidade
        } else if ((!nome.equals("")) && (!unidade.equals(""))) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? and unidLivro Like ?  order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nome);
            pstmt.setString(2, unidade);

            //unidade tipo    
        } else if ((!unidade.equals("")) && (!tipoFrase.equals(""))) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE unidLivro Like ? and tipoFrase Like ?  order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, unidade);
            pstmt.setString(2, tipoFrase);

            //nome tipo
        } else if ((!nome.equals("")) && (!tipoFrase.equals(""))) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? and tipoFrase Like ?  order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nome);
            pstmt.setString(2, tipoFrase);

            //tipo
        } else if (!tipoFrase.equals("")) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE tipoFrase Like ? order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, tipoFrase);

            //unidade
        } else if (!unidade.equals("")) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE unidLivro Like ? order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, unidade);

            //nome
        } else if (!nome.equals("")) {
            query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? order by RAND()";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nome);

            //outros
        } else {
            query = "SELECT fPortugues, fIngles FROM frase order by RAND()";
            pstmt = con.prepareStatement(query);
        }
        rs = pstmt.executeQuery();

        Frase f = new Frase();

        if (rs.next()) {
            // f.setId(rs.getInt("id"));
            f.setfPortugues(rs.getString("fPortugues"));
            f.setfIngles(rs.getString("fIngles"));
        }
        fecharBanco();
        return f;
    }

    public void deletar(Frase f) throws Exception {
        abrirBanco();
        String query = "DELETE FROM frase WHERE id=?";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, f.getId());
        pstmt.execute();
        fecharBanco();
    }

    public void altera(Frase f) throws Exception {

        abrirBanco();
        String query = "UPDATE frase set fPortugues = ?, fIngles = ?, nomeLivro = ?, unidLivro = ?, tipoLivro = ? WHERE "
                + "id = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, f.getfPortugues());
        pstmt.setString(2, f.getfIngles());
        pstmt.setString(3, f.getNomeLivro());
        pstmt.setString(4, f.getUnidLivro());
        pstmt.setString(4, f.getTipoFrase());
        pstmt.setInt(5, f.getId());
        pstmt.executeUpdate();

        fecharBanco();



    }
    
   
     public List<Frase> getLista() throws Exception {
        abrirBanco();
        String query = "SELECT DISTINCT nomeLivro FROM frase";
        pstmt = con.prepareStatement(query);
        //pstmt.setString(1, nomeLivro);
        rs = pstmt.executeQuery();
 
        Frase f = null;
        List<Frase> listaCampoNomeLivro = new ArrayList<Frase>();
        while (rs.next()) {
            f = new Frase();
           // f.setId(rs.getInt("id"));
           // f.setfPortugues(rs.getString("fPortugues"));
           // f.setfIngles(rs.getString("fIngles"));
            f.setNomeLivro(rs.getString("nomeLivro"));
          //  f.setUnidLivro(rs.getString("unidLivro"));
          //  f.setTipoFrase(rs.getString("tipoFrase"));
            listaCampoNomeLivro.add(f);
        }
        fecharBanco();
        return listaCampoNomeLivro;


    }
}
