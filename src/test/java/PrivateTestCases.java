import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

public class PrivateTestCases {

    // VERIFICA MÉTODOS

    @Test
    public void test_notificaCliente_WhatsApp_Sucesso() throws Exception {

        verificaExistenciaClasse("NotificacaoWhatsApp");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoWhatsApp").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(new Cliente("aaaa@bbb.com", "33 3333-3333", "33 93333-3333"), notificacao));
    }

    @Test
    public void test_notificaCliente_Email_Sucesso() throws Exception {

        verificaExistenciaClasse("NotificacaoEmail");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoEmail").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(new Cliente("aaaa@bbb.com", "33 3333-3333", "33 93333-3333"), notificacao));
    }

    @Test
    public void test_notificaCliente_Sms_Sucesso() throws Exception {

        verificaExistenciaClasse("NotificacaoSms");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoSms").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(new Cliente("aaaa@bbb.com", "33 3333-3333", "33 93333-3333"), notificacao));
    }

    @Test
    public void test_notificaCliente_WhatsApp_clienteNull_Falha() throws Exception {

        verificaExistenciaClasse("NotificacaoWhatsApp");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoWhatsApp").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(null, notificacao));
    }

    @Test
    public void test_notificaCliente_Email_clienteNull_Falha() throws Exception {

        verificaExistenciaClasse("NotificacaoEmail");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoEmail").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(null, notificacao));
    }

    @Test
    public void test_notificaCliente_Sms__clienteNull_Falha() throws Exception {

        verificaExistenciaClasse("NotificacaoSms");

        var notificadorService = new NotificadorService();
        var notificacao = (Notificacao) Class.forName("NotificacaoSms").getDeclaredConstructor().newInstance();
        assertEquals(true, notificadorService.notificaClient(null, notificacao));
    }

    private void verificaExistenciaClasse(String className) {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e){
            assumeNoException(e);
        }
    }
}