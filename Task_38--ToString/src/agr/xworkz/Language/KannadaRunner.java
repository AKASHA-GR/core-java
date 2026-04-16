package agr.xworkz.Language;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class KannadaRunner {
    public static void main(String[] args) {
        OriginOfLanguage origin = new OriginOfLanguage("Karnatake","India");
        int[] yearsOfOld = {2000,2500,3000,4000,5000};
        Language language = new Language(origin,JnanpithAward.EIGHT,yearsOfOld,true,true);
        System.out.println(language.toString());
        language.speak();
        language.sing();
        System.out.println();

        Kannada kannada = new Kannada(origin,JnanpithAward.EIGHT,yearsOfOld,true,true,"20milian above","10milian above");
        kannada.sing();
        kannada.speak();
        System.out.println(kannada.toString());
    }

}
