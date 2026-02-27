package org.example.service.Login;

import java.io.IOException;


import org.example.model.users.User;
import org.example.service.ServiceStartAccount;
import org.example.service.genericsFunctions.AccountGenerics;
import org.example.service.genericsFunctions.FunctionsAdmin;
import org.example.service.serviceGlobalMethod.Input;

public class Login {
    
    FunctionsAdmin fAdmin = new FunctionsAdmin();
    User user = new User();
    //Ao buscar o email digitado, se não tiver é direcionado para createUser, caso tenha, verificação de senha. Transformar o login em boolean para retornar true para dar seguimento no sistema de verificação. Caso seja true acessa a conta. 3 tentativas
    public void login() throws IOException{
        System.out.println("To continue, please enter your email address: ");
        String email = Input.reader.readLine();
        
        //VALIDAR A FUNÇÃO CADASTRO
        
            if (fAdmin.findByEmail(email) == null){
                System.out.println("Email not found... Creating Account");
                ServiceStartAccount c = new ServiceStartAccount();
                c.createUser();
            }
            validationPassword();
    }


    //Criar o menu no controller para testar a validação do email. Neste menu terá duas opções: Login ou Criar conta.
    //Criando a conta consigo validar a senha existente
    //Depois criar o perfil ADM e dar continuade do crud simples.
    private boolean validationPassword() throws IOException{
        System.out.println("To continue, please enter your password: ");
        String password = Input.reader.readLine();
        AccountGenerics fGenerics = new AccountGenerics();
        int counter = 0;
            do{
                counter++;

                    if (fGenerics.searchAccounts(user.getPassword()).equals(null)){
                        System.out.println("Invalid password");
                        System.out.println("One more try");
                    }
                    if (fGenerics.searchAccounts(user.getPassword()).equals(password)){
                        System.out.println("Password Match");
                        return true;
                    }
            }while (counter != 3);
                    return false;
    }

}
