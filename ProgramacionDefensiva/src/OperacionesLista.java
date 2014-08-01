import java.util.List;

import org.apache.commons.lang3.Validate;

import com.google.common.base.Preconditions;

public class OperacionesLista {
	/**
	 * Calcula la operación especificada sobre la lista de valores
	 * 
	 * @param valores la lista con los valores a operar
	 * @param operacion la operacion que se desea efectuar 1 suma 2 resta.
	 * @return el resultado de la operación
	 */
	public static int operarElementos(List<Long> valores, Integer operacion) 
	{
		int resultado = 0;
		for (Long valor : valores) 
		{
			if (operacion == 1) 
			{
				resultado += valor;
			}
			else if (operacion == 2) 
			{
				resultado -= valor;
			}
		}
		return resultado;
	}

	/**
	 * Calcula la operación especificada sobre la lista de valores
	 * 
	 * @param valores la lista con los valores a operar
	 * @param operacion la operacion que se desea efectuar 1 suma 2 resta.
	 * @return el resultado de la operación
	 */
	public static int operarElementosDenfesiva(List<Long> valores, Integer operacion) 
	{
		Preconditions.checkNotNull(valores, "La lista de valores no puede ser nula");
		Preconditions.checkArgument(
				operacion != null && (operacion == 1 || operacion == 0),
				"La operacón tiene que ser 1 o 2");
		
		Validate.noNullElements(valores, "La lista no puede tener valores nulos");
		
		int resultado = 0;
		for (Long valor : valores) 
		{
			if (operacion == 1) 
			{
				resultado += valor;
			}
			else if (operacion == 2)
			{
				resultado -= valor;
			}
		}
		return resultado;
	}

	/**
	* 
	* @param valores la lista con los valores a operar
	* @param operacion la operacion que se desea efectuar 1 suma 2 resta.
	* @return el resultado de la operación
	* @throws NullPointerException si la lista de valoes es nula
	* @throws IllegalArgumentException si la operacion no es 1 o 2 o si la lista contiene valores nulos.
	*/
	public static int operarElementosDenfesivaDocumentada(List<Long> valores, Integer operacion)
			throws NullPointerException, IllegalArgumentException
	{
		Preconditions.checkNotNull(valores, "La lista de valores no puede ser nula");
		Preconditions.checkArgument(
				operacion != null && (operacion == 1 || operacion == 0),
				"La operacón tiene que ser 1 o 2");
		
		Validate.noNullElements(valores, "La lista no puede tener valores nulos");
		
		int resultado = 0;
		for (Long valor : valores) 
		{
			if (operacion == 1) 
			{
				resultado += valor;
			}
			else if (operacion == 2)
			{
				resultado -= valor;
			}
		}
		return resultado;
	}

	/**
	 * Calcula la operación especificada sobre la lista de valores
	 * 
	 * @param valores la lista con los valores a operar
	 * @param operacion la operacion que se desea efectuar 1 suma 2 resta.
	 * @return el resultado de la operación
	 */
	public static int operarElementosEficiente(List<Long> valores, final Integer operacion) 
	{
		if (operacion == 2) 
		{
			operacion = -1;
		}
		
		int resultado = 0;
		for (Long valor : valores) 
		{
			resultado += operacion * valor;
		}
		return resultado;
	}
}
