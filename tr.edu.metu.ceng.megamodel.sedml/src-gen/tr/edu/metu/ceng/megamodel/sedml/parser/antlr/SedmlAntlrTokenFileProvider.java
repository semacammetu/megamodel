/*
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.sedml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SedmlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("tr/edu/metu/ceng/megamodel/sedml/parser/antlr/internal/InternalSedml.tokens");
	}
}
