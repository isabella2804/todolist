package com.isabella.todolist.user;

public class UserModel {

    public String userName;
    public String nome;
    public String password;

    
    public String getUserName() {
        return userName;
    }
    public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "UserModel [userName=" + userName + ", nome=" + nome + ", password=" + password + "]";
    }

    

}
