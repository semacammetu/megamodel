package tr.edu.metu.ceng.megamodel.simexp

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import sedml.SedmlPackage
import tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage

class HypoMethodToSedMLGenerator {
	def static void main(String[] args) {
		new HypoMethodToSedMLGenerator().generate(
			"D:/CASE STUDY/git/megamodel/tr.edu.metu.ceng.megamodel.simexp/model/sedml/sedml.xml")
	}

	// Register Sedml packages to the EMF Registry
	def doEMFSetup() {
		EPackage.Registry.INSTANCE.put(SedmlPackage.eINSTANCE.nsURI, SedmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xml", new XMIResourceFactoryImpl);
		
		EPackage.Registry.INSTANCE.put(HypoMethodPackage.eINSTANCE.nsURI, HypoMethodPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xml", new XMIResourceFactoryImpl);
	}

	def generate(String file) {
		// Register the EMF model
		doEMFSetup
		val resourceSet = new ResourceSetImpl
		// Load the model and get the resources
		val resource = resourceSet.getResource(URI.createFileURI(file), true)
		for (content : resource.contents) {
			// queryModel(content)
		}
	}

}
