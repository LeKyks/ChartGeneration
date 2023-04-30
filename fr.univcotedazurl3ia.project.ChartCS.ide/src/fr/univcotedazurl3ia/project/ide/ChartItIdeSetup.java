/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazurl3ia.project.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.univcotedazurl3ia.project.ChartItRuntimeModule;
import fr.univcotedazurl3ia.project.ChartItStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ChartItIdeSetup extends ChartItStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ChartItRuntimeModule(), new ChartItIdeModule()));
	}
	
}