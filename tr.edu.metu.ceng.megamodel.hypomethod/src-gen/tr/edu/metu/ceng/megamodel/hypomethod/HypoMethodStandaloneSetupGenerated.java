/*
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage;

@SuppressWarnings("all")
public class HypoMethodStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new HypoMethodRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.ceng.metu.edu.tr/~e1774785/megamodel/hypomethod")) {
			EPackage.Registry.INSTANCE.put("http://www.ceng.metu.edu.tr/~e1774785/megamodel/hypomethod", HypoMethodPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("hypo", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("hypo", serviceProvider);
	}
}
