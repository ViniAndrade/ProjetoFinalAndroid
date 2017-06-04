package br.unipe.borracheiro.borracheiro.core;

import com.google.gson.Gson;

import br.unipe.borracheiro.borracheiro.model.LoginResult;

/**
 * Created by -Vinícius on 04/06/2017.
 */

public class AuthController {
    private static AuthController INSTANCE = null;

    private AuthController(){}

    public static AuthController getInstance(){
        if (INSTANCE == null)
            INSTANCE = new AuthController();

        return INSTANCE;
    }

    public static String loadAuthFromJSON(String json){
        Gson gson = new Gson();
        LoginResult ar = gson.fromJson(json, LoginResult.class);

        return ar.toString();
    }
}