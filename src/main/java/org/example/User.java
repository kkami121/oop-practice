package org.example;

public class User {
    private String password;

    public void initPassord(PasswordGenerator passwordGenerator){ // 패스워드 초기화 메소드
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String passord = passwordGenerator.generatePassword();

        if(passord.length() >= 8 && passord.length() <=12){
            this.password = passord;
        }
    }

    public String getPassword() {
        return password;
    }
}
