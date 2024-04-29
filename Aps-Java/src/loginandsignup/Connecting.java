/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup;

import com.mysql.cj.callback.UsernameCallback;
import com.mysql.cj.xdevapi.Statement;
import java.net.URL;

/**
 *
 * @author Gustavo
 */
class Connecting {
    String $Host;
    String $DB;
    String $Username;
    String $Pwd;
    String $Url;

    public  Connecting(String $Host,String $DB,String $User,String $Pwd) {
        this.$Host = $Host;
        this.$DB = $DB;
        this.$Username = $User;
        this.$Pwd = $Pwd;
        
        
        this.$Url = "jdbc:mysql://localhost:"+$Host+"/"+$DB+"";
    }

   

    public String get$Host() {
        return $Host;
    }

    public void set$Host(String $Host) {
        this.$Host = $Host;
    }

    public String get$DB() {
        return $DB;
    }

    public void set$DB(String $DB) {
        this.$DB = $DB;
    }

    public String get$Username() {
        return $Username;
    }

    public void set$Username(String $Username) {
        this.$Username = $Username;
    }

    public String get$Pwd() {
        return $Pwd;
    }

    public void set$Pwd(String $Pwd) {
        this.$Pwd = $Pwd;
    }

    public String get$Url() {
        return $Url;
    }

    public void set$Url(String $Url) {
        this.$Url = $Url;
    }
    
    

    
}
