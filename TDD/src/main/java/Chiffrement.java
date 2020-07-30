public class Chiffrement {

    public static String encodeCesar (String code){
        StringBuilder retour = new StringBuilder();

        for (int i =0; i<code.length(); i++){
            char c = code.charAt(i);
            if (Character.isUpperCase(c)){
                c = (char) (((c - 65 + 13)%26)+65);
            } else if (Character.isLowerCase(c)){
                c = (char) (((c - 97+ 13)%26)+97);
            }

            retour.append(c);

        }

       return retour.toString();
    }

}
