public class Documentos {
   private String contratoAdmitido = "CONTRATO DE TRABALHO\n" +
           "\n" +
           "Pelo presente instrumento particular, de um lado " + "[nome da empresa], "+  "  pessoa jurídica de direito privado, com sede na " + "[endereço da empresa]"+" , inscrita no CNPJ sob o nº " + "[número do CNPJ]"+" \n, doravante denominada " + "[nome da empresa]" +  " ,  e de outro lado, "  + "[nome completo do contratado]"+ ", portador(a) do CPF nº "+"[número do CPF],"+" nascido(a) em  "+"[data de nascimento do contratado]"+ "\n, com "+"[idade do contratado]" + " anos, residente e domiciliado(a) na "+"[endereço do contratado]"+", doravante denominado "+ "CONTRATADO"+"\n, celebram o presente contrato de trabalho.";

   private String contratoInvalido = "Prezado(a) [nome do candidato],\n" +
           "\n" +
           "Agradecemos imensamente pelo seu interesse em fazer parte da equipe da nossa empresa e por ter participado do processo seletivo.\n" +
           "\n" +
           "Gostaríamos de informá-lo(a) que avaliamos cuidadosamente seu currículo e seu desempenho durante as entrevistas e testes realizados. Infelizmente, devido à sua idade, não podemos seguir em frente com a contratação neste momento.\n" +
           "\n" +
           "Não temos dúvidas de que você tem muitas qualidades e competências valiosas para oferecer a qualquer empresa, e esperamos que você encontre em breve a oportunidade profissional que está buscando.\n" +
           "\n" +
           "Desejamos muito sucesso em sua jornada e agradecemos novamente por seu interesse em nossa empresa.\n" +
           "\n" +
           "Atenciosamente,\n" +
           "\n" +
           "[Nome da Empresa]\n";

   public String getContratoAdmitido() {
      return contratoAdmitido;
   }

   public String getContratoInvalido() {
      return contratoInvalido;
   }

   public String getContrato(int idade) {
      if (idade >= 18) {
         return contratoAdmitido;
      } else {
         return contratoInvalido;
      }
   }
}