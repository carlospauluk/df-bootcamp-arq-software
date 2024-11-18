package com.bcxparqsoftware.desafiofinal.util;

public class CpfUtil {

	public static boolean isCpfValido(String cpf) {
		if (cpf == null || cpf.length() != 11 || cpf.equals("00000000000") || cpf.equals("11111111111") ||
			cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") ||
			cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") ||
			cpf.equals("88888888888") || cpf.equals("99999999999")) {
			return false;
		}

		int soma = 0;
		int digito1, digito2;

		for (int i = 0; i < 9; i++) {
			soma += (10 - i) * Character.getNumericValue(cpf.charAt(i));
		}

		digito1 = 11 - (soma % 11);
		digito1 = (digito1 == 10 || digito1 == 11) ? 0 : digito1;

		if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
			return false;
		}

		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += (11 - i) * Character.getNumericValue(cpf.charAt(i));
		}

		digito2 = 11 - (soma % 11);
		digito2 = (digito2 == 10 || digito2 == 11) ? 0 : digito2;

		return digito2 == Character.getNumericValue(cpf.charAt(10));
	}
}
