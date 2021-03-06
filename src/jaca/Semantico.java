package jaca;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import jaca.analysis.DepthFirstAdapter;
import jaca.node.AAPrograma;
import jaca.node.AArAtbrAComando;
import jaca.node.AArBlocoABlocoExp;
import jaca.node.AArBlocoAComando;
import jaca.node.AArBlocoAComandoDois;
import jaca.node.AArBlocoExpAExpr;
import jaca.node.AArBoolATipoPrimitivo;
import jaca.node.AArChamadaAtributoAExpr;
import jaca.node.AArChamadaMetdAComando;
import jaca.node.AArChamadaMetdAExpr;
import jaca.node.AArChamadaMetodoAChamada;
import jaca.node.AArClasseATipoClasse;
import jaca.node.AArConstADecConst;
import jaca.node.AArDecConstAAtributos;
import jaca.node.AArDecFuncaoAProcFunc;
import jaca.node.AArDecObjAAtributos;
import jaca.node.AArDecProcedimentoAProcFunc;
import jaca.node.AArDecVarAAtributos;
import jaca.node.AArDefiniADefClasse;
import jaca.node.AArDivAExpr;
import jaca.node.AArELogicoAExpr;
import jaca.node.AArEnquantoAComando;
import jaca.node.AArExprAExprIni;
import jaca.node.AArExpressoesAListaExpr;
import jaca.node.AArFalsoAExpr;
import jaca.node.AArFuncaoADecFuncao;
import jaca.node.AArFuncaoCompletaADecFuncao;
import jaca.node.AArIdAAtributo;
import jaca.node.AArIdentifierAExpr;
import jaca.node.AArIgualAExpr;
import jaca.node.AArIniciarBlocoABloco;
import jaca.node.AArInitAInicializacao;
import jaca.node.AArInversorAExprIni;
import jaca.node.AArListaAExprs;
import jaca.node.AArListaAParams;
import jaca.node.AArMenorAExpr;
import jaca.node.AArMenorIgualAExpr;
import jaca.node.AArMenosAExpr;
import jaca.node.AArModAExpr;
import jaca.node.AArMultAExpr;
import jaca.node.AArNRealAExpr;
import jaca.node.AArNotEmptyAFamilia;
import jaca.node.AArObjADecObj;
import jaca.node.AArObjReservadoADecObj;
import jaca.node.AArOuLogicoAExpr;
import jaca.node.AArParamAParametro;
import jaca.node.AArParamsAParametros;
import jaca.node.AArProcFuncAMetodos;
import jaca.node.AArProcedCompletoADecProcedimento;
import jaca.node.AArProcedimentoADecProcedimento;
import jaca.node.AArRealATipoPrimitivo;
import jaca.node.AArRelARelacao;
import jaca.node.AArRelacoesAListaRelacoes;
import jaca.node.AArReservadoImprimeAChamada;
import jaca.node.AArReservadoLeAChamada;
import jaca.node.AArSeAComando;
import jaca.node.AArSeSenaoAComando;
import jaca.node.AArSeSenaoAComandoDois;
import jaca.node.AArSomaAExpr;
import jaca.node.AArTipoClasseATipo;
import jaca.node.AArTipoPrimitivoATipo;
import jaca.node.AArVarADecVar;
import jaca.node.AArVerdadeAExpr;
import jaca.node.PAAtributos;
import jaca.node.PADecProcedimento;
import jaca.node.PADefClasse;
import jaca.node.PAListaRelacoes;
import jaca.node.PAMetodos;
import jaca.node.PAParametro;
import jaca.node.PAParams;
import jaca.node.Start;

public class Semantico extends DepthFirstAdapter{
	TabelaDeSimbolos tabelaDeSimbolos = new TabelaDeSimbolos();
	Hashtable<String,String> newEscopo;
	boolean temBloco = false;

	@Override
	public void inStart(Start node) {
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando an?lise sem?ntica...");
		super.inStart(node);
	}
	
	@Override
	public void outStart(Start node) {
	    System.out.println("-------------------------------------------------");
        System.out.println("Fim da an?lise sem?ntica");
        System.out.println("-------------------------------------------------");
		super.outStart(node);
	}

	@Override
	public void outAAPrograma(AAPrograma node) {
		
		super.outAAPrograma(node);
	}

	@Override
	public void outAArNotEmptyAFamilia(AArNotEmptyAFamilia node) {
		//System.out.println("entrei aqui familia");
		newEscopo = new Hashtable<String, String>();
		
		String[] splitedString;
		String key;
		String value;
		
		splitedString = node.getARelacao().toString().split(" ");
		key = splitedString[0];
		value = splitedString[1].replace("_", "").toLowerCase();
		newEscopo.put(key, value);
		
				
		List<PAListaRelacoes> list = new ArrayList<PAListaRelacoes>(node.getAListaRelacoes());
		for(PAListaRelacoes e : list) {
			splitedString = e.toString().split(" ");
			key = splitedString[0].trim();
			value = splitedString[1].replace("_", "").toLowerCase().trim();
			newEscopo.put(key, value);
		}
		
		
		tabelaDeSimbolos.add(newEscopo);
		System.out.println("\n-------------Nova atualiza??o--------------------\n");
		tabelaDeSimbolos.print();
		System.out.println("\n-----------------------------------------\n");
		
		//super.outAArNotEmptyAFamilia(node);
	}

	@Override
	public void outAArRelacoesAListaRelacoes(AArRelacoesAListaRelacoes node) {
		
		// TODO Auto-generated method stub
		super.outAArRelacoesAListaRelacoes(node);
	}

	@Override
	public void outAArRelARelacao(AArRelARelacao node) {
		// TODO Auto-generated method stub
		super.outAArRelARelacao(node);
	}

	@Override
	public void outAArDefiniADefClasse(AArDefiniADefClasse node) {
		//System.out.println("entrei aqui defini??o de classe");
		if(temBloco) {
			newEscopo = new Hashtable<String, String>();
		}
		
		//int i = 0;
		
		String[] splitedString;
		String key;
		String value;
		
		String idclass = node.getIdClass().toString().trim();
		
		if(tabelaDeSimbolos.search(idclass)) {
			System.out.println("Error: [" + idclass + " j? existe]");
			System.exit(0);
		}else {
			newEscopo.put(idclass, "class");
		}
		
		
		List<PAAtributos> atributos = new ArrayList<PAAtributos>(node.getAAtributos());
		for(PAAtributos atributo : atributos) {
			splitedString = atributo.toString().split(" ");
			key = splitedString[1].trim();
			value = splitedString[0].trim();
			if(tabelaDeSimbolos.search(key)) {
				System.out.println("Error: [" + key + " j? existe]");
				System.exit(0);
			}else {
				newEscopo.put(key, value);
			}
			
			
		}
		tabelaDeSimbolos.add(newEscopo);
		System.out.println("\n-------------Nova atualiza??o--------------------\n");
		tabelaDeSimbolos.print();
		System.out.println("\n-------------------------------------------\n");
		
		
		//super.outAArDefiniADefClasse(node);
	}

	@Override
	public void outAArProcFuncAMetodos(AArProcFuncAMetodos node) {
		
		// TODO Auto-generated method stub
		super.outAArProcFuncAMetodos(node);
	}

	@Override
	public void outAArDecProcedimentoAProcFunc(AArDecProcedimentoAProcFunc node) {
		
		//System.out.println(node.getADecProcedimento());
		super.outAArDecProcedimentoAProcFunc(node);
	}

	@Override
	public void outAArDecFuncaoAProcFunc(AArDecFuncaoAProcFunc node) {
		
		// TODO Auto-generated method stub
		super.outAArDecFuncaoAProcFunc(node);
	}

	@Override
	public void outAArObjADecObj(AArObjADecObj node) {
		// TODO Auto-generated method stub
		super.outAArObjADecObj(node);
	}

	@Override
	public void outAArObjReservadoADecObj(AArObjReservadoADecObj node) {
		// TODO Auto-generated method stub
		super.outAArObjReservadoADecObj(node);
	}

	@Override
	public void outAArVarADecVar(AArVarADecVar node) {
		// TODO Auto-generated method stub
		super.outAArVarADecVar(node);
	}

	@Override
	public void outAArConstADecConst(AArConstADecConst node) {
		// TODO Auto-generated method stub
		super.outAArConstADecConst(node);
	}

	@Override
	public void outAArInitAInicializacao(AArInitAInicializacao node) {
		// TODO Auto-generated method stub
		super.outAArInitAInicializacao(node);
	}

	@Override
	public void outAArTipoClasseATipo(AArTipoClasseATipo node) {
		// TODO Auto-generated method stub
		super.outAArTipoClasseATipo(node);
	}

	@Override
	public void outAArTipoPrimitivoATipo(AArTipoPrimitivoATipo node) {
		// TODO Auto-generated method stub
		super.outAArTipoPrimitivoATipo(node);
	}

	@Override
	public void outAArClasseATipoClasse(AArClasseATipoClasse node) {
		// TODO Auto-generated method stub
		super.outAArClasseATipoClasse(node);
	}

	@Override
	public void outAArRealATipoPrimitivo(AArRealATipoPrimitivo node) {
		// TODO Auto-generated method stub
		super.outAArRealATipoPrimitivo(node);
	}

	@Override
	public void outAArBoolATipoPrimitivo(AArBoolATipoPrimitivo node) {
		// TODO Auto-generated method stub
		super.outAArBoolATipoPrimitivo(node);
	}

	@Override
	public void outAArProcedCompletoADecProcedimento(AArProcedCompletoADecProcedimento node) {
		//System.out.println("entrei aqui procedimento completo");
		if(!temBloco) {
			newEscopo = new Hashtable<String, String>();
		}
		
		
		String[] splitedString = null;
		String idProced = node.getId().toString().trim();
		
		if(tabelaDeSimbolos.search(idProced)) {
			System.out.println("Error: [" + idProced + " j? existe]");
			System.exit(0);
		}else {
			newEscopo.put(idProced, "procedimento");
		}
		
		
		if(node.getAParametros() != null) {
			splitedString = node.getAParametros().toString().split(" ");
		}
		
		if(splitedString != null) {
			for(int i = 0; i < splitedString.length; i = i+2) {
				if((i+1) != splitedString.length) {
					if(tabelaDeSimbolos.search(splitedString[i+1])) {
						System.out.println("Error: [" + splitedString[i+1] + " j? existe]");
						System.exit(0);
					}else {
						newEscopo.put(splitedString[i+1], splitedString[i]);
					}
				}
				
			}
		}
		if(temBloco) {
			tabelaDeSimbolos.add(newEscopo);
		}
		
		//super.outAArProcedCompletoADecProcedimento(node);
	}

	@Override
	public void outAArProcedimentoADecProcedimento(AArProcedimentoADecProcedimento node) {
		//System.out.println("entrei aqui procedimento");
		String[] splitedString = null;
		String idProced = node.getId().toString().trim();
		
	
		if(tabelaDeSimbolos.search(idProced)) {
			System.out.println("Error: [" + idProced + " j? existe]");
			System.exit(0);
		}else {
			newEscopo.put(idProced, "procedimento");
		}
		
		
		if(node.getAParametros() != null) {
			splitedString = node.getAParametros().toString().split(" ");
		}
		
		if(splitedString != null) {
			for(int i = 0; i < splitedString.length; i = i+2) {
				if((i+1) != splitedString.length) {
					if(tabelaDeSimbolos.search(splitedString[i+1])) {
						System.out.println("Error: [" + splitedString[i+1] + " j? existe]");
						System.exit(0);
					}else {
						newEscopo.put(splitedString[i+1], splitedString[i]);
					}
				}
				
			}
		}
	
		
			super.outAArProcedimentoADecProcedimento(node);
	}

	@Override
	public void outAArFuncaoCompletaADecFuncao(AArFuncaoCompletaADecFuncao node) {
		//System.out.println("entrei aqui fun??o completo");
		String[] splitedString = null;
		String idFuncao = node.getId().toString().trim();
		
		if(tabelaDeSimbolos.search(idFuncao)) {
			System.out.println("Error: [" + idFuncao + " j? existe]");
			System.exit(0);
		}else {
			newEscopo.put(idFuncao, node.getATipo().toString());
		}
		
		
		
		if(node.getAParametros() != null) {
			splitedString = node.getAParametros().toString().split(" ");
		}
		
		
		
		if(splitedString != null) {
			for(int i = 0; i < splitedString.length; i = i+2) {
				if((i+1) != splitedString.length) {
					if(tabelaDeSimbolos.search(splitedString[i+1])) {
						System.out.println("Error: [" + splitedString[i+1] + " j? existe]");
						System.exit(0);
					}else {
						newEscopo.put(splitedString[i+1], splitedString[i]);
					}
				}
				
			}
		}
		
			// TODO Auto-generated method stub
		super.outAArFuncaoCompletaADecFuncao(node);
	}

	@Override
	public void outAArFuncaoADecFuncao(AArFuncaoADecFuncao node) {
		//System.out.println("entrei aqui fun??o");
		String[] splitedString = null;
		String idFuncao = node.getId().toString().trim();
		
		if(tabelaDeSimbolos.search(idFuncao)) {
			System.out.println("Error: [" + idFuncao + " j? existe]");
			System.exit(0);
		}else {
			newEscopo.put(idFuncao, node.getATipo().toString());
		}
		
		
		if(node.getAParametros() != null) {
			splitedString = node.getAParametros().toString().split(" ");
		}
		
		if(splitedString != null) {
			for(int i = 0; i < splitedString.length; i = i+2) {
				if((i+1) != splitedString.length) {
					if(tabelaDeSimbolos.search(splitedString[i+1])) {
						System.out.println("Error: [" + splitedString[i+1] + " j? existe]");
						System.exit(0);
					}else {
						newEscopo.put(splitedString[i+1], splitedString[i]);
					}
				}
				
			}
		}
		
		
		// TODO Auto-generated method stub
		super.outAArFuncaoADecFuncao(node);
	}

	@Override
	public void outAArParamsAParametros(AArParamsAParametros node) {
		
		// TODO Auto-generated method stub
		super.outAArParamsAParametros(node);
	}

	@Override
	public void outAArListaAParams(AArListaAParams node) {
		
		// TODO Auto-generated method stub
		super.outAArListaAParams(node);
	}

	@Override
	public void outAArParamAParametro(AArParamAParametro node) {
		// TODO Auto-generated method stub
		super.outAArParamAParametro(node);
	}

	@Override
	public void outAArSeAComando(AArSeAComando node) {
		// TODO Auto-generated method stub
		super.outAArSeAComando(node);
	}

	@Override
	public void outAArSeSenaoAComando(AArSeSenaoAComando node) {
		// TODO Auto-generated method stub
		super.outAArSeSenaoAComando(node);
	}

	@Override
	public void outAArEnquantoAComando(AArEnquantoAComando node) {
		// TODO Auto-generated method stub
		super.outAArEnquantoAComando(node);
	}

	@Override
	public void outAArAtbrAComando(AArAtbrAComando node) {
		// TODO Auto-generated method stub
		super.outAArAtbrAComando(node);
	}

	@Override
	public void outAArChamadaMetdAComando(AArChamadaMetdAComando node) {
		// TODO Auto-generated method stub
		super.outAArChamadaMetdAComando(node);
	}

	@Override
	public void outAArBlocoAComando(AArBlocoAComando node) {
		// TODO Auto-generated method stub
		super.outAArBlocoAComando(node);
	}

	@Override
	public void outAArSeSenaoAComandoDois(AArSeSenaoAComandoDois node) {
		// TODO Auto-generated method stub
		super.outAArSeSenaoAComandoDois(node);
	}

	@Override
	public void outAArBlocoAComandoDois(AArBlocoAComandoDois node) {
		// TODO Auto-generated method stub
		super.outAArBlocoAComandoDois(node);
	}

	@Override
	public void outAArIniciarBlocoABloco(AArIniciarBlocoABloco node) {
		//System.out.println("entrei aqui iniciar bloco");
		temBloco = true;
		newEscopo = new Hashtable<String, String>();
		String[] splitedString;
		String key;
		String value;
		
		List<PAAtributos> atributos = new ArrayList<PAAtributos>(node.getAAtributos());
		for(PAAtributos atributo : atributos) {
			System.out.println(atributo);
			splitedString = atributo.toString().split(" ");
			key = splitedString[1].trim();
			value = splitedString[0].trim();
			if(tabelaDeSimbolos.search(key)) {
				System.out.println("Error: [" + key + " j? existe]");
				System.exit(0);
			}else {
				
				newEscopo.put(key, value);
			}
			
		}
		
		// TODO Auto-generated method stub
		super.outAArIniciarBlocoABloco(node);
	}

	@Override
	public void outAArDecObjAAtributos(AArDecObjAAtributos node) {
		// TODO Auto-generated method stub
		super.outAArDecObjAAtributos(node);
	}

	@Override
	public void outAArDecVarAAtributos(AArDecVarAAtributos node) {
		// TODO Auto-generated method stub
		super.outAArDecVarAAtributos(node);
	}

	@Override
	public void outAArDecConstAAtributos(AArDecConstAAtributos node) {
		// TODO Auto-generated method stub
		super.outAArDecConstAAtributos(node);
	}

	@Override
	public void outAArExprAExprIni(AArExprAExprIni node) {
		// TODO Auto-generated method stub
		super.outAArExprAExprIni(node);
	}

	@Override
	public void outAArInversorAExprIni(AArInversorAExprIni node) {
		// TODO Auto-generated method stub
		super.outAArInversorAExprIni(node);
	}

	@Override
	public void outAArIdentifierAExpr(AArIdentifierAExpr node) {
		// TODO Auto-generated method stub
		super.outAArIdentifierAExpr(node);
	}

	@Override
	public void outAArNRealAExpr(AArNRealAExpr node) {
		// TODO Auto-generated method stub
		super.outAArNRealAExpr(node);
	}

	@Override
	public void outAArVerdadeAExpr(AArVerdadeAExpr node) {
		// TODO Auto-generated method stub
		super.outAArVerdadeAExpr(node);
	}

	@Override
	public void outAArFalsoAExpr(AArFalsoAExpr node) {
		// TODO Auto-generated method stub
		super.outAArFalsoAExpr(node);
	}

	@Override
	public void outAArChamadaAtributoAExpr(AArChamadaAtributoAExpr node) {
		// TODO Auto-generated method stub
		super.outAArChamadaAtributoAExpr(node);
	}

	@Override
	public void outAArChamadaMetdAExpr(AArChamadaMetdAExpr node) {
		// TODO Auto-generated method stub
		super.outAArChamadaMetdAExpr(node);
	}

	@Override
	public void outAArSomaAExpr(AArSomaAExpr node) {
			
		// TODO Auto-generated method stub
		super.outAArSomaAExpr(node);
	}

	@Override
	public void outAArMenosAExpr(AArMenosAExpr node) {
		// TODO Auto-generated method stub
		super.outAArMenosAExpr(node);
	}

	@Override
	public void outAArMultAExpr(AArMultAExpr node) {
		// TODO Auto-generated method stub
		super.outAArMultAExpr(node);
	}

	@Override
	public void outAArDivAExpr(AArDivAExpr node) {
		// TODO Auto-generated method stub
		super.outAArDivAExpr(node);
	}

	@Override
	public void outAArModAExpr(AArModAExpr node) {
		// TODO Auto-generated method stub
		super.outAArModAExpr(node);
	}

	@Override
	public void outAArIgualAExpr(AArIgualAExpr node) {
		// TODO Auto-generated method stub
		super.outAArIgualAExpr(node);
	}

	@Override
	public void outAArELogicoAExpr(AArELogicoAExpr node) {
		// TODO Auto-generated method stub
		super.outAArELogicoAExpr(node);
	}

	@Override
	public void outAArOuLogicoAExpr(AArOuLogicoAExpr node) {
		// TODO Auto-generated method stub
		super.outAArOuLogicoAExpr(node);
	}

	@Override
	public void outAArMenorAExpr(AArMenorAExpr node) {
		// TODO Auto-generated method stub
		super.outAArMenorAExpr(node);
	}

	@Override
	public void outAArMenorIgualAExpr(AArMenorIgualAExpr node) {
		// TODO Auto-generated method stub
		super.outAArMenorIgualAExpr(node);
	}

	@Override
	public void outAArBlocoExpAExpr(AArBlocoExpAExpr node) {
		// TODO Auto-generated method stub
		super.outAArBlocoExpAExpr(node);
	}

	@Override
	public void outAArBlocoABlocoExp(AArBlocoABlocoExp node) {
		// TODO Auto-generated method stub
		super.outAArBlocoABlocoExp(node);
	}

	@Override
	public void outAArChamadaMetodoAChamada(AArChamadaMetodoAChamada node) {
		// TODO Auto-generated method stub
		super.outAArChamadaMetodoAChamada(node);
	}

	@Override
	public void outAArReservadoLeAChamada(AArReservadoLeAChamada node) {
		// TODO Auto-generated method stub
		super.outAArReservadoLeAChamada(node);
	}

	@Override
	public void outAArReservadoImprimeAChamada(AArReservadoImprimeAChamada node) {
		// TODO Auto-generated method stub
		super.outAArReservadoImprimeAChamada(node);
	}

	@Override
	public void outAArIdAAtributo(AArIdAAtributo node) {
		// TODO Auto-generated method stub
		super.outAArIdAAtributo(node);
	}

	@Override
	public void outAArExpressoesAListaExpr(AArExpressoesAListaExpr node) {
		// TODO Auto-generated method stub
		super.outAArExpressoesAListaExpr(node);
	}

	@Override
	public void outAArListaAExprs(AArListaAExprs node) {
		// TODO Auto-generated method stub
		super.outAArListaAExprs(node);
	}

	
	
}
