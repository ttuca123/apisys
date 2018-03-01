package com.apisys.teste.enu;

/**
 * 
 * @author Artur
 * 
 * @since 2018
 * @version 1.0
 */

public enum EnuSituacaoMatricula {

	

	MATRICULADO(0, "Matriculado"), TRANCADO(1, "Trancado"), JUBILADO(2,
			"Jubilado");

	private Integer codigo;

	private String descricao;

	private EnuSituacaoMatricula(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricao(int codigo) {

		for (EnuSituacaoMatricula enuSituacaoMatricula : EnuSituacaoMatricula.values()) {
			if (codigo == enuSituacaoMatricula.getCodigo()) {
				return enuSituacaoMatricula.getDescricao();
			}

		}
		return "Ops, nenhum item encontrado!!!";
	}

	public static Integer getCodigo(String descricao) {

		for (EnuSituacaoMatricula enuSituacaoMatricula : EnuSituacaoMatricula.values()) {
			if (enuSituacaoMatricula.getDescricao().equals(descricao.trim())) {
				return enuSituacaoMatricula.getCodigo();
			}
		}
		return 0;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}
