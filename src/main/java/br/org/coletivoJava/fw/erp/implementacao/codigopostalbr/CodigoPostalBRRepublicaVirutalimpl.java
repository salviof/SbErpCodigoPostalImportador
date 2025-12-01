package br.org.coletivoJava.fw.erp.implementacao.codigopostalbr;

import java.util.List;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.EntidadeLocal;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.CodigoPostalBRRepublicaVirutal;
import br.org.coletivoJava.fw.api.erp.codigopostalbr.InfoRespostaCepWebService;

@CodigoPostalBRRepublicaVirutal
public class CodigoPostalBRRepublicaVirutalimpl implements br.org.coletivoJava.fw.api.erp.codigoPostal.br.ItfCodigoPostalBR {

    @Override
    public boolean configuraEndereco(String cep, EntidadeLocal pLocal) {
        return UtilCRCCEP.configuraEndereco(cep, pLocal);
    }

    @Override
    public List<String> cepsPorEndereco(String pEndereco) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean configurarPosicaoGeogafica(EntidadeLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean contribuirCadastroNovoEndereco(EntidadeLocal pLocal) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public boolean isCepExiste(String pCep) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

    @Override
    public InfoRespostaCepWebService getInfoRespostaWebService(String cep) {
        throw new UnsupportedOperationException("O METODO AINDA N\u00c3O FOI IMPLEMENTADO.");
    }

}
