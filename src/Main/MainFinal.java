package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import code_IMP.Constant;
import code_IMP.FileUtil;
import code_IMP.MainPrincipal;
import exceptions.CodeSelectorExceptions;

public class MainFinal {

	public static void main(String[] args) {
		MainDesignWizard mainDesignWizard = new MainDesignWizard();
		MainBackTracking mainBackTracking = new MainBackTracking();
		MainJAVAReflection mainJAVAReflection = new MainJAVAReflection();
		MainPrincipal mainJAVAReflectionANALISE = new MainPrincipal();
		
		String basePath = Constant.WAY_JMOCK;
		chamandoOMain(mainJAVAReflectionANALISE, basePath);

	}

	private static void chamandoOMain(MainPrincipal mainJAVAReflectionANALISE, String basePath) {
		try {
			mainJAVAReflectionANALISE.main(basePath);
		} catch (CodeSelectorExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
