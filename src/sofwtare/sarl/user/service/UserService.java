/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofwtare.sarl.user.service;

import sofwtare.sarl.user.model.Users;

import java.util.List;

/**
 *
 * @author moulaYounes
 */
public class UserService {


    public void initDb() throws Exception{
        for (int i = 0; i < 10; i++) {
           // usersDao.save(new Users("log"+i, "pass"+i, i%2));
        }
    }
    public static boolean seConnecter(String login, String password) throws Exception {
    	String requette = "SELECT * FROM users WHERE login='" + login + "' and password='"+password+"'";
    	return true;
    	//return usersDao.load(requette).size()>0;
    }

    private List<Users> findUserBloquedTemplate(int bloqued) throws Exception {
        String requette = "SELECT * FROM users WHERE bloqued=" + bloqued;
        return null;
        //return usersDao.load(requette);
    }

    public List<Users> findUserBloqued() throws Exception {
        return findUserBloquedTemplate(1);
    }

    public List<Users> findUserDebloqued() throws Exception {
        return findUserBloquedTemplate(0);
    }
  }
