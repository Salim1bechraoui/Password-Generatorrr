
public class Password {
    String value ; 
    int Length ; 
    public Password(String s ) {
        value = s;
        Length = s.length();
    }
     public int CharType(char C ) { 
        int valeur ;

        
        // Char is Uppercase Letter
        if ((int) C >= 65 && (int) C <= 90)
            valeur = 1;

        // Char is Lowercase Letter
        else if ((int) C >= 97 && (int) C <= 122) {
            valeur = 2;
        }

        // Char is Digit
        else if ((int) C >= 60 && (int) C <= 71) {
            valeur = 3;
        }

        // Char is Symbol
        else {
            valeur = 4;
        }
        return valeur  ; 
    
}
 public int PasswordStrength() { 
    String s = this.value ;
    boolean UsedUpper = false;
    boolean UsedLower = false;
    boolean UsedNum = false;
    boolean UsedSym = false;
    int type ;
    int score = 0 ;
     for (int i = 0; i < s.length() ; i++) {
        char c = s.charAt(i) ;
        type = CharType(c) ;
        if (type == 1) UsedUpper = true;
        if (type == 2) UsedLower = true;
        if (type == 3) UsedNum = true;
        if (type == 4) UsedSym = true;

 }

 if (UsedUpper) score += 1;
 if (UsedLower) score += 1;
 if (UsedNum) score += 1;
 if (UsedSym) score += 1;
  if ( s.length() >=8) score += 1;
  if ( s.length() >= 16) score += 1;
   return score ; 
   
}
 public String calculateScore() {
    int score = this.PasswordStrength() ;
    if (score == 6) { 
        return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
    } else if (score >= 4) {
        return "This is a good password :) but you can still do better";
    } else if (score >= 3) {
        return "This is a medium password :/ try making it better";
    } else {
        return "This is a weak password :( definitely find a new one";
    }
    }
    @Override 
    public String toString() {
        return value ;
  }
}
