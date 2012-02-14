/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danillomaciel.alphaenglish.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Danillo
 */
public class Dao {

    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    public void abrirBanco() throws Exception {
        Class.forName("org.hsqldb.jdbcDriver");
//teste para saber se o git pega
        
        String url = "jdbc:hsqldb:file:E:/Meus Documentos/Meus Arquivos/projetoNetbeans/aplhaenglish/bd_alphaenalphaen";
        String user = "SA";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
    }

    public void fecharBanco() throws Exception {
        if (con != null) {
            con.close();
        }
        if (pstmt != null) {
            pstmt.close();
        }
    }
}
