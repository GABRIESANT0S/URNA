/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;


public class ExecuteSQL {
    private Connection con;
    
    public ExecuteSQL(Connection con){
        setCon(con);
    }
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
    
}