public class ProgramaPrincipal {

    public static void main(String[] args) {

        PessoaFisica pf= new PessoaFisica();
        pf.setNome("Alberto");
        pf.setSobrenome("Oliveira");
        pf.setDataNascimento("03/05/1998");
        pf.setcpf(23972932332L);
        pf.setIdade(pf.calcularIdade());
        pf.setEndereco("Rua Almirante barros junior 184");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Nuubank");
        pj.setSobrenome("RJ");
        pj.setDataNascimento("07/11/2010");
        pj.setCnpj(678990986555L);
        pj.setIdade(pj.calcularIdade());
        pj.setEndereco("Avenida Rio Branco 1547");


        Documentos doc = new Documentos();
        String contrato = doc.getContrato(pf.getIdade());
        contrato = contrato.replace("[nome da empresa]", pj.getNome());
        contrato = contrato.replace("[endereço da empresa]", pj.getEndereco());
        contrato = contrato.replace("[número do CNPJ]", Long.toString(pj.getCnpj()));
        contrato = contrato.replace("[nome completo do contratado]", pf.getNome() + " " + pf.getSobrenome());
        contrato = contrato.replace("[número do CPF]", Long.toString(pf.getcpf()));
        contrato = contrato.replace("[data de nascimento do contratado]", pf.getDataNascimento());
        contrato = contrato.replace("[idade do contratado]", Integer.toString(pf.getIdade()));
        contrato = contrato.replace("[endereço do contratado]", pf.getEndereco());
        contrato = contrato.replace("[Nome da Empresa]", pj.getNome());

        System.out.print(contrato);

    }


}