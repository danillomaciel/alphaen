package br.com.danillomaciel.alphaenglish.persistencia;

import br.com.danillomaciel.alphaenglish.modelo.Frase;
import java.util.ArrayList;
import java.util.List;

public class FraseDao extends Dao {

    public void gravar(Frase f) throws Exception {
        abrirBanco();
        pstmt = con.prepareStatement("INSERT INTO frase values(null, ?, ?,?,?)");
        pstmt.setString(1, f.getfPortugues());
        pstmt.setString(2, f.getfIngles());
        pstmt.setString(3, f.getNomeLivro());
        pstmt.setString(4, f.getUnidLivro());
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
            listaNomes.add(f);
        }
        fecharBanco();
        return listaNomes;

    }

    public Frase buscaporRnd(String nome, String unidade) throws Exception {
        abrirBanco();
        String query = null;

       if((!nome.equals("")) && (!unidade.equals(""))){
           query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? and unidLivro  LIKE ? order by RAND()";
         pstmt = con.prepareStatement(query);
        pstmt.setString(1, nome);
       pstmt.setString(2, unidade);
        }
       else if((!nome.equals("")) && (unidade.equals(""))){
                query = "SELECT fPortugues, fIngles FROM frase WHERE nomeLivro Like ? order by RAND()";
                 pstmt = con.prepareStatement(query);
        pstmt.setString(1, nome);
        }
       else{
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
        String query = "UPDATE frase set fPortugues = ?, fIngles = ?, nomeLivro = ?, unidLivro = ?  WHERE "
                + "id = ?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, f.getfPortugues());
        pstmt.setString(2, f.getfIngles());
        pstmt.setString(3, f.getNomeLivro());
        pstmt.setString(4, f.getUnidLivro());
        pstmt.setInt(5, f.getId());
        pstmt.executeUpdate();

        fecharBanco();



    }
}
