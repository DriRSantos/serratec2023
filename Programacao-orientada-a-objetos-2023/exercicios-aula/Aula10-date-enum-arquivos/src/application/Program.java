package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import entities.enums.PessoasEnum;

public class Program {

	public static void main(String[] args) {

		System.out.println("Sistema Bancário");
		System.out.println();

		Date date = new Date();
		System.out.println(date);

		System.out.println();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = new Date();
		System.out.println("Date antes de formatar: " + date1);
		System.out.println("Date depois de formatar: " + simpleDateFormat.format(date1));

//        System.out.println();
//        String stx = "07/11/1978";
//        Date dataUsuario = simpleDateFormat.parse(stx);
//        System.out.println("Date digitado e formatado: " + dataUsuario);

		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		// Mostra qual o dia da semana 1 = domingo, 2=segunda, etc
		System.out.println(gc.get(gc.DAY_OF_WEEK));
		// Adiciona 2 meses à data atual
		System.out.println(gc.get(gc.DAY_OF_MONTH));
		gc.add(gc.DAY_OF_MONTH, 2);
		System.out.println(gc.get(gc.DAY_OF_MONTH));
		// Imprime falso. 2009 não é bissexto.
		System.out.println(gc.isLeapYear(2020));
		// Atribui a data do GregorianCalendar à uma variável Date
		Date d1 = gc.getTime();
		System.out.println(d1); // aumenta o tempo de acordo com o que modificou antes
		// Armazena a data de d1 para o GregorianCalendar gc.
		gc.setTime(d1);
		
		System.out.println();
		LocalDate hoje = LocalDate.now();
		System.out.println("LocalDate antes de formatar: " + hoje);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String hojeFormatado = hoje.format(formatter);
		System.out.println("LocalDate depois de formatar: " + hojeFormatado);
		
		System.out.println();
		LocalDateTime agora = LocalDateTime.now();
		System.out.println("LocalDateTime antes de formatar: " + agora);
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String agoraFormatado = agora.format(formatter);
		System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);
		
		System.out.println("====== ENUM ========");
		String testaEnum = "GERENTE";
		PessoasEnum presidente = PessoasEnum.PRESIDENTE;
		PessoasEnum gerente = PessoasEnum.GERENTE;
		
		if( testaEnum.equalsIgnoreCase(PessoasEnum.PRESIDENTE.name()) ) {
				System.out.println("Tipo da Pessoa = " + presidente.name());
		
		}
		else if( testaEnum.equalsIgnoreCase(PessoasEnum.GERENTE.name()) ) {
				System.out.println("Tipo da Pessoa = " + gerente.name());
		
		}
		
		System.out.println();
	//	Escritor.escrever(".\\arquivos\\teste.txt");
	//	Leitor.ler(".\\arqyuvis\\");
	//	try {
			
	//	}
//		catch (IOException IOe) {
//			System.out.println("Houve erro ao escrever o arquivo: " + IOe.getCause());
//		}
		
		System.out.println();
		LocalDateTime agora1 = LocalDateTime.now();
		//System.out.println("LocalDateTime antes de formatar: " + agora1);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		String agora1Formatado = agora.format(formatter2);
		System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);
		
	}
}
