package org.mugiwaras.backend.model.business.interfaces;

import org.mugiwaras.backend.model.Cliente;
import org.mugiwaras.backend.model.business.exceptions.BusinessException;
import org.mugiwaras.backend.model.business.exceptions.NotFoundException;

import java.util.List;

public interface IClienteBusiness {

    public Cliente load(long id) throws BusinessException, NotFoundException;

    public List<Cliente> list() throws BusinessException;

    Cliente add(Cliente cliente) throws BusinessException;
}
