class NotificadorService{
    boolean notificaClient(Cliente cliente){
        NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
        return notificacaoEmail.notificar(cliente, "Movimentação realizada em sua conta corrente.");
    }
}