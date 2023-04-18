public class ClassePrincipal {

        public static void main(String args[]){
            System.out.println("Seja bem vindo" );
            /**
             * aprender a subir o setNome para entro da primeira impressão do 'seja bem-vindo'
             */
            Pacientes pacientes = new Pacientes();
            pacientes.setNome("Gabriel");
            Medicos medicos = new Medicos();
            medicos.setNome("medico responsavel:Dr.DrauzioVarela");
            Procedimentos procedimentos = new Procedimentos();
            procedimentos.setCoração("aréa do procedimento: ventriloco esquerdo");
            /**
             * aprener a fixar termos inicias e deixar que so as propriedades de classes complete os argumento
             */
            System.out.println(pacientes.getNome());
            System.out.println(medicos.getNome());
            System.out.println(procedimentos.getCoração());

        }
    }


