        private void preencheCliente(String codigo) {
        ClienteDAO cDao = new  ClienteDAO();
        cliente = cDao.buscaCodigo(Integer.valueOf(codigo));
        txtbairro.setText(cliente.getEndereco().getBairro());
        txtcep.setText(cliente.getEndereco().getCep());
        txtcidade.setText(cliente.getEndereco().getCidade());
        txtcnpj.setText(cliente.getCnpjCpf());
        txtcod.setText(String.valueOf(cliente.getIdCliente()));
        txtcomplemento.setText(cliente.getEndereco().getComplemento());
        txtcpf.setText(cliente.getCnpjCpf());
        txtemail.setText(cliente.getEmail());
        txtlogradouro.setText(cliente.getEndereco().getLogradouro());
        txtnome.setText(cliente.getNome());
        txtnumero.setText(cliente.getEndereco().getNumero());
        txtrazaosocial.setText(cliente.getRazaoSocial());
        txttelefone.setText(cliente.getTelefone());
        }

