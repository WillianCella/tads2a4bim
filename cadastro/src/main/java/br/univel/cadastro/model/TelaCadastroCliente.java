package br.univel.cadastro.model;

import java.awt.BorderLayout;

public class TelaCadastroCliente extends MolduraAbstrata {
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		super();
	}

	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroCliente(), BorderLayout.CENTER);
	}

}
