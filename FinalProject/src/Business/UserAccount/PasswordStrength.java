/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 * @author Jyoti
 */
public class PasswordStrength {
    
    private int checkPasswordStrength(String password) {
                int strengthPercentage=0;
        String[] partialRegexChecks = { ".*[a-z]+.*", // lower
                ".*[A-Z]+.*", // upper
                ".*[\\d]+.*", // digits
                ".*[@#$%]+.*" // symbols
        };


                    if (password.matches(partialRegexChecks[0])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[1])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[2])) {
                    strengthPercentage+=25;
            }
                    if (password.matches(partialRegexChecks[3])) {
                    strengthPercentage+=25;
            }


        return strengthPercentage;
    }
}
