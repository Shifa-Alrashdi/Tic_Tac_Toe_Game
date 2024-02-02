/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Administrator
 */
public class DAOImplDerbyJDBC implements Dao<User> {
    private String dbURL="jdbc:derby://localhost:1527/d1 [user1 on USER1]";
    private String username="user1";
    private String password="user1";
    private Connection conn;
    

    public List<User> getAll() {
        List<User> all = new ArrayList<User>();
        try ( Connection conn = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "SELECT * FROM t1";
            PreparedStatement statement = (PreparedStatement) conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                
                String firstName = result.getString(2);
                String email = result.getString("email");
                all.add(new User(firstName, email));               
            }
            return all;

        } catch (SQLException ex) {
        }
        return null;
    }

    @Override
    public void save(User t) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(User t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(User t) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Optional<User> get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
