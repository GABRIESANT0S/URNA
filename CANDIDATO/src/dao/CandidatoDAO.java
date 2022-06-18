/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Candidato;


public class CandidatoDAO  extends ExecuteSQL{
    public CandidatoDAO(Connection con){
        super(con);
    }
    
    public String salvar(Candidato candiato){
        String sql = "INSERT INTO CHAPA VALUES(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
            ps.setInt(1, chapa.getNumero());
            ps.setString(2, chapa.getDescricao());
            if(ps.executeUpdate() > 0){
                return "candidato Inserido com sucesso";
            }else{
                return "Erro ao Inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
}