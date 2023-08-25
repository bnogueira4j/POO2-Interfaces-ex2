import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeNoException;

public class TestCases {

    // VERIFICA EXISTÊNCIA E HERANÇA DAS CLASSES

    @Test
    public void test_verificaExistenciaClasseNotificacaoWhatsApp_Sucesso()
            throws ClassNotFoundException{

        try {
            Class.forName("NotificacaoWhatsApp");
        } catch (ClassNotFoundException e){
            fail("Você deve implementar a classe NotificacaoWhatsApp");
        }
    }

    @Test
    public void test_verificaExistenciaClasseNotificacaoEmail_Sucesso()
            throws ClassNotFoundException{

        try {
            Class.forName("NotificacaoEmail");
        } catch (ClassNotFoundException e){
            fail("Você deve implementar a classe NotificacaoEmail");
        }
    }

    @Test
    public void test_verificaExistenciaClasseNotificacaoSms_Sucesso()
            throws ClassNotFoundException{

        try {
            Class.forName("NotificacaoSms");
        } catch (ClassNotFoundException e){
            fail("Você deve implementar a classe NotificacaoSms");
        }
    }

    @Test
    public void test_verificaClasseNotificacaoWhatsAppImplImplementaNotificacao_Sucesso() {
        try {
            if(Notificacao.class
                    .isAssignableFrom(Class.forName("NotificacaoWhatsApp")) == false) {
                fail("A classe NotificacaoWhatsApp deve implementar a interface Notificacao");
            }
        } catch (ClassNotFoundException e){
            assumeNoException(e);
        }
    }

    @Test
    public void test_verificaClasseNotificacaoEmailImplImplementaNotificacao_Sucesso() {
        try {
            if(Notificacao.class
                    .isAssignableFrom(Class.forName("NotificacaoEmail")) == false) {
                fail("A classe NotificacaoEmail deve implementar a interface Notificacao");
            }
        } catch (ClassNotFoundException e){
            assumeNoException(e);
        }
    }

    @Test
    public void test_verificaClasseNotificacaoSmsImplImplementaNotificacao_Sucesso() {
        try {
            if(Notificacao.class
                    .isAssignableFrom(Class.forName("NotificacaoSms")) == false) {
                fail("A classe NotificacaoSms deve implementar a interface Notificacao");
            }
        } catch (ClassNotFoundException e){
            assumeNoException(e);
        }
    }
}
