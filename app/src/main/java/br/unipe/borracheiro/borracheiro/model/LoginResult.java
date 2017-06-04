package br.unipe.borracheiro.borracheiro.model;

/**
 * Created by -Vinícius on 04/06/2017.
 */

public class LoginResult {
    private String status;
    private String token;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String toString() {
        return status + " - " + token;
    }
}
